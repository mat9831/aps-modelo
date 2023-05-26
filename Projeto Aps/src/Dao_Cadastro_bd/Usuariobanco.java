/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao_Cadastro_bd;

/**
 *
 * @author MATHEUS
 */
public class Usuariobanco {
    private String USUARIO;
    private String SENHA;
    private String CONFIRMERSENHA;

    public String getUSUARIO() {
        return USUARIO;
    }

    public Usuariobanco(String USUARIO, String SENHA, String CONFIRMERSENHA) {
        this.USUARIO = USUARIO;
        this.SENHA = SENHA;
        this.CONFIRMERSENHA = CONFIRMERSENHA;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getSENHA() {
        return SENHA;
    }

    public void setSENHA(String SENHA) {
        this.SENHA = SENHA;
    }

    public String getCONFIRMERSENHA() {
        return CONFIRMERSENHA;
    }

    public void setCONFIRMERSENHA(String CONFIRMERSENHA) {
        this.CONFIRMERSENHA = CONFIRMERSENHA;
    }
    
    
    
}
