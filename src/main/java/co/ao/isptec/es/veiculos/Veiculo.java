/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.ao.isptec.es.veiculos;

/**
 *
 * @author Love
 */
public class Veiculo {
    
    private int id;
    private String marca;
    private String modelo;
    private int ano;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Veiculo(int id, String marca, String modelo, int ano) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
}
