/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelPrincipal;

/**
 *
 * @author MATHEUS
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private String doacao;
    public String getNome() {
        return nome;
    }

    public Pessoa(String nome, String cpf, String doacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.doacao = doacao;
    }

    public Pessoa(String doacao) {
        this.doacao = doacao;
    }

    public String getDoacao() {
        return doacao;
    }

    public void setDoacao(String doacao) {
        this.doacao = doacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    }
    
    

