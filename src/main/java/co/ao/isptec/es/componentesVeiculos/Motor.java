/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.ao.isptec.es.componentesVeiculos;

/**
 *
 * @author Love
 */
public class Motor {
    
    private String combustivel;
    private double potencia;
    private int cilindros;

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public Motor(String combustivel, double potencia, int cilindros) {
        this.combustivel = combustivel;
        this.potencia = potencia;
        this.cilindros = cilindros;
    }
    
}
