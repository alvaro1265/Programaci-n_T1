package UT7;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CiudadDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/geografia_db";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    public List<Ciudad> obtenerCiudadesPorPais(int idPais) {

        List<Ciudad> lista = new ArrayList<>();

        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, PASSWORD);

            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM Ciudades WHERE id_pais = ?"
            );

            ps.setInt(1, idPais);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Ciudad c = new Ciudad(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("poblacion"),
                        rs.getInt("id_pais")
                );

                lista.add(c);
            }

            con.close();

        } catch (SQLException e) {
            System.err.println("Error en DAO :: " + e.getMessage());
        }

        return lista;
    }
}
