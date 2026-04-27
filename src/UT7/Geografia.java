package UT7;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class Geografia {

    public class GestorGeografia {

        private static final String URL = "jdbc:mysql://localhost:3306/geografia_db";
        private static final String USUARIO = "root";
        private static final String PASSWORD = "";
        private static Connection conexion;

        public static void main(String[] args) {

            conectar();


            mostrarCiudadesPorContinente();

            trasvasePoblacion();

            calcularPoblacionAsia();

            CiudadDAO dao = new CiudadDAO();
            List<Ciudad> ciudades = dao.obtenerCiudadesPorPais(4);

            for (Ciudad c : ciudades) {
                System.out.println(c.getNombre() + " - " + c.getPoblacion());
            }

            desconectar();
        }

        public static void conectar() {
            try {
                conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            } catch (SQLException e) {
                System.err.println("Error de conexión :: " + e.getMessage());
            }
        }

        public static void desconectar() {
            try {
                if (conexion != null && !conexion.isClosed()) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.err.println("Error al desconectar :: " + e.getMessage());
            }
        }

        public static void mostrarCiudadesPorContinente() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un continente: ");
            String continente = sc.nextLine();

            try {
                String sql = """
                SELECT c.nombre AS ciudad, p.nombre AS pais, c.poblacion
                FROM Ciudades c
                INNER JOIN Paises p ON p.id = c.id_pais
                WHERE p.continente = ?
            """;

                PreparedStatement ps = conexion.prepareStatement(sql);
                ps.setString(1, continente);

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    System.out.println(
                            "Ciudad: " + rs.getString("ciudad") +
                                    " | País: " + rs.getString("pais") +
                                    " | Población: " + rs.getInt("poblacion") + " habitantes"
                    );
                }

            } catch (SQLException e) {
                System.err.println("Error en consulta :: " + e.getMessage());
            }
        }

        public static void trasvasePoblacion() {
            try {
                conexion.setAutoCommit(false);

                String sql1 = "UPDATE Ciudades SET poblacion = poblacion + 50000 WHERE nombre = 'Madrid'";
                // ERROR intencionado
                String sql2 = "UPDATE Ciudadess SET poblacion = poblacion - 50000 WHERE nombre = 'Barcelona'";

                Statement st = conexion.createStatement();

                st.executeUpdate(sql1);
                st.executeUpdate(sql2); // falla

                conexion.commit();
                System.out.println("Trasvase realizado");

            } catch (SQLException e) {
                System.err.println("Error en transacción :: " + e.getMessage());
                try {
                    conexion.rollback();
                    System.out.println("Rollback realizado");
                } catch (SQLException ex) {
                    System.err.println("Error en rollback :: " + ex.getMessage());
                }
            }
        }

        public static void calcularPoblacionAsia() {
            try {
                String sql = "{CALL calcular_poblacion_continente(?, ?)}";

                CallableStatement cs = conexion.prepareCall(sql);

                cs.setString(1, "Asia");
                cs.registerOutParameter(2, Types.INTEGER);

                cs.execute();

                int total = cs.getInt(2);
                System.out.println("Población total de Asia: " + total);

            } catch (SQLException e) {
                System.err.println("Error en procedimiento :: " + e.getMessage());
            }
        }
    }
}