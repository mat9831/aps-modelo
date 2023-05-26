/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao_Cadastro_bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author MATHEUS
 */
public class Conexao_Bd {
    public Connection getConnection() throws SQLException{
         Connection CNCD = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BancoDeDadosAPS", "postgres", "98314161");
        return CNCD;
    }
    
}
