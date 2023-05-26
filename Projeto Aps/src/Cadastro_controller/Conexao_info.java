/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cadastro_controller;
import ModelPrincipal.Usuario;
import View.TL_cadastro_login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Cadastro_controller.UsuarioController;
public class Conexao_info {
    private final Connection connection;

    public Conexao_info(Connection connection) {
        this.connection = connection;
    }
    public void insert(UsuarioController usuario) throws SQLException{    
        
            
            String SQL= "insert into usuario(usuario,senha,confirmeasenha) values ('"+usuario.getUSUARIO()+"','"+usuario.getSENHA()+"','"+usuario.getCONFIRMESENHA()+"');";
            PreparedStatement CNDCStatement = connection.prepareStatement(SQL);
            CNDCStatement.execute();
            
          connection.close();
          
    }
}

        
    

