/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cadastro_controller;
import Dao_Cadastro_bd.Conexao_Bd;
import ModelPrincipal.Pessoa;
import View.TL_Doacao_pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author MATHEUS
 */
public class Dados_pessoa {
    private final Connection connectionpessoa;

    public Dados_pessoa(Connection connectionpessoa) {
        this.connectionpessoa = connectionpessoa;
        
    }
     public void insert(Pessoa pessoa) throws SQLException{
         
          
             String sql = "insert into pessoa (nome,cpf,doacao) values('"+pessoa.getNome()+"','"+pessoa.getCpf()+"','"+pessoa.getDoacao()+"');";
             
             PreparedStatement statement = connectionpessoa.prepareStatement(sql);
             statement.execute();
             
             connectionpessoa.close();
            
 
        
        }
                   
     }

