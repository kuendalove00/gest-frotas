/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.ao.isptec.es.condutor;

/**
 *
 * @author Love
 */
public class Condutor {
    
     private String nome_completo;
    private int idade;
    private String numero_registo;
    private String historico_conducao;

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNumero_registo() {
        return numero_registo;
    }

    public void setNumero_registo(String numero_registo) {
        this.numero_registo = numero_registo;
    }

    public String getHistorico_conducao() {
        return historico_conducao;
    }

    public void setHistorico_conducao(String historico_conducao) {
        this.historico_conducao = historico_conducao;
    }

    public Condutor(String nome_completo, int idade, String numero_registo, String historico_conducao) {
        this.nome_completo = nome_completo;
        this.idade = idade;
        this.numero_registo = numero_registo;
        this.historico_conducao = historico_conducao;
    }
    
}
