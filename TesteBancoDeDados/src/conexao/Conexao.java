package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String url = "jdbc:mysql://localhost:3306/exemplobd";
    private static final String user = "root";
    private static final String password = "*****";

    private static Connection conn;

    public static Connection getConexao() {

        try {
            if (conn == null) {
                conn = DriverManager.getConnection(url, user, password);
            }
            return conn;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }
    }
}





        /*        if (conn == null){
            try {
                conn = DriverManager.getConnection(url, user, password);
                return conn;
        else{
            return conn;
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
                return null;
            }
        }

    }*/


