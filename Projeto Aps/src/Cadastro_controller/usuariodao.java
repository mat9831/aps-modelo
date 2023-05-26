/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cadastro_controller;

import Dao_Cadastro_bd.Conexao_Bd;
import ModelPrincipal.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
 import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
public class usuariodao {
    Connection conn;
    public ResultSet autenticarusuario(Usuario objusuario) throws SQLException{
        conn = new Conexao_Bd ().getConnection();
        try {
            String sql = "select * from  usuario where usuario =?  and senha=?";
           PreparedStatement pstm = conn.prepareStatement(sql);
           pstm.setString(1, objusuario.getUsuario());
           pstm.setString(2, objusuario.getSenha());
           ResultSet rs=  pstm.executeQuery();
           return rs;
        } catch (SQLException erro) {
         JOptionPane.showMessageDialog(null, "usuariodao:"+erro);
            return null;
        
    }
    }

  
 
}
