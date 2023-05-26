/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelPrincipal;

/**
 *
 * @author MATHEUS
 */
public class PessoaPJ {
    private String nomepj;
    private String cnpj;
    private String doacaopj;
    public String getNomepj() {
        return nomepj;
    }

    public PessoaPJ(String doacaopj) {
        this.doacaopj = doacaopj;
    }

    public String getDoacaopj() {
        return doacaopj;
    }

    public void setDoacaopj(String doacaopj) {
        this.doacaopj = doacaopj;
    }

    public void setNomepj(String nomepj) {
        this.nomepj = nomepj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaPJ(String nomepj, String cnpj) {
        this.nomepj = nomepj;
        this.cnpj = cnpj;
    }

    public PessoaPJ(String nomepj, String cnpj, String doacaopj) {
        this.nomepj = nomepj;
        this.cnpj = cnpj;
        this.doacaopj = doacaopj;
    }
    
    }
    
    

