package UT7;

import java.sql.*;

public class GestorInstituto {

    private static final String URL = "jdbc:mysql://localhost:3306/instituto_db";
    private static final String USUARIO = "root";
    private static final String PASSWORD = ""; // Que cada alumno ponga la suya
    private static Connection conexion;

    // TODO Paso 1: Crear el método conectar() y desconectar()
    // Mantenemos una única conexión en toda la aplicación

    // TODO Paso 2: Crear el método registrarAlumno(String nombre, String email)
    // Alta de un alumno en su tabla correspondiente

    // TODO Paso 3: Crear el método matricularAlumno(int idAlumno, int idAsignatura)
    // Aquí estamos insertando una relación N:N

    // TODO Paso 4: Crear el método mostrarAsignaturasDeAlumno(int idAlumno)
    // Select con join...

    // TODO Paso 5: Crear el método darDeBajaAlumno(int idAlumno)
    // Delete...

    public static void main(String[] args) {
        GestorInstituto gestor = new GestorInstituto();
        conectar();

        try {
            conexion.setAutoCommit(false);
            registrarAlumno("Rafa", "rafa@educa.jcyl.es");
            registrarAlumno("Laura", "laura@educa.jcyl.es");
            registrarAlumno("Sam", "sam@educa.jcyl.es");
            conexion.commit();
            System.out.println("Alumnos insertados");
        } catch (Exception e) {
            System.err.println("Error al insertar los alumnos :: " + e.getMessage());
            try {
                conexion.rollback();
            } catch (SQLException ex) {
                System.err.println("Error al realizar rollback :: " + e.getMessage());
            }

        }
        desconectar();
        // Aquí iremos probando los métodos paso a paso
    }

    public static void conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
        } catch (ClassNotFoundException e){
            System.err.println("No se ha encontrado el driver de MySQL");
        } catch (SQLException e) {
            System.err.println("Error de SQL al conectar :: " + e.getMessage());
        }
    }

    public static void mostrarAlumnos() {
        try {
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM alumnos");

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");

                System.out.println(id + " - " + nombre + " - " + email);
            }

        } catch (SQLException e) {
            System.err.println("Error al mostrar alumnos :: " + e.getMessage());
        }
    }

    public static void desconectar(){
        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al desconectarse :: " + e.getMessage());
        }
    }

    public static void registrarAlumno(String nombre, String email) throws SQLException {
        try {
            PreparedStatement statement = conexion.prepareStatement("INSERT INTO Alumnos(nombre, email) VALUES (?,?)");
            statement.setString(1, nombre);
            statement.setString(2, email);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al registrar el alumno :: " + e.getMessage());
            throw e;
        }
    }

    public static void matricularAlumno(int idAlumno, int idAsignatura) throws SQLException {
        try {
            PreparedStatement statement = conexion.prepareStatement(
                    "INSERT INTO matriculas(idAlumno, idAsignatura) VALUES (?,?)"
            );

            statement.setInt(1, idAlumno);
            statement.setInt(2, idAsignatura);

            statement.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al matricular alumno :: " + e.getMessage());
            throw e;
        }
    }

    public static void mostrarAsignaturasDeAlumno(int idAlumno) {
        try {
            String sql = """
            SELECT alumnos.nombre AS alumno, asignaturas.nombre AS asignatura
            FROM matriculas
            INNER JOIN alumnos ON alumnos.id = matriculas.id_alumno
            INNER JOIN asignaturas ON asignaturas.id = matriculas.id_asignatura
            WHERE id_alumno = ?
            """;

            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, idAlumno);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                System.out.println("Asignatura: " + rs.getString("nombre"));
            }

        } catch (SQLException e) {
            System.err.println("Error al mostrar asignaturas :: " + e.getMessage());
        }
    }
}
