package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    
    public boolean verificarLoginSenha(String email, String senha) {
        Connection conexao = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        boolean valido = false;
        
        try {
            conexao = Conexao.getConnection();
            String sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";
            pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, senha);
            rs = pstmt.executeQuery();
            
            valido = rs.next(); // Se houver um resultado, o login e senha são válidos
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conexao != null) conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return valido;
    }
}
