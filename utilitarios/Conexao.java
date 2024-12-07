package utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
        public static void main(String[] args) {
        obterConexao();
            System.out.println("Conectado com sucesso");
    }
    static String URL = "jdbc:postgresql://localhost:5432/BancoMVCDAO";
    static String USER = "postgres";
    static String PASSWORD = "root";

    private static Connection con = null;

    public static Connection obterConexao() {
        try {
            if (con == null) {
                con = DriverManager.getConnection(URL, USER, PASSWORD);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar com o banco de dados: " + e.getMessage(), e);
        }
        return con;
    }

}