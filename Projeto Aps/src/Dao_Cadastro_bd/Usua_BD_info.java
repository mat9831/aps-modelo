/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao_Cadastro_bd;

/**
 *
 * @author MATHEUS
 */
public class Usua_BD_info {
    private String USUARIO;
    private String SENHA;
    private String CONFIRMESENHA;

    public String getUSUARIO() {
        return USUARIO;
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

    public String getCONFIRMESENHA() {
        return CONFIRMESENHA;
    }

    public void setCONFIRMESENHA(String CONFIRMESENHA) {
        this.CONFIRMESENHA = CONFIRMESENHA;
    }

    public Usua_BD_info(String USUARIO, String SENHA) {
        this.USUARIO = USUARIO;
        this.SENHA = SENHA;
    }
    
    
}
