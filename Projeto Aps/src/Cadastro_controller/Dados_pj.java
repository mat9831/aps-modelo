/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cadastro_controller;

import ModelPrincipal.PessoaPJ;
//import ModelPrincipal.doacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author MATHEUS
 */
public class Dados_pj {
      private final Connection connectionpj;

    public Dados_pj(Connection connectionpj) {
        this.connectionpj = connectionpj;
    }
     public void insert(PessoaPJ pessoapj) throws SQLException{
     
             String sql = "insert into pessoapj (nomepj,cnpj,doaçaopj) values('"+pessoapj.getNomepj()+"','"+pessoapj.getCnpj()+"','"+pessoapj.getDoacaopj()+"');";
             
             PreparedStatement statement = connectionpj.prepareStatement(sql);
             statement.execute();
             
             connectionpj.close();
            

        

    }                    


}
     