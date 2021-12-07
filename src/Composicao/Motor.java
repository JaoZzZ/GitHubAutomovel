/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composicao;

/**
 *
 * @author IFSC
 */
public class Motor {
    int potencia;
    
    public Motor(){
        potencia=1000;
        //valor padrão
    }
    public Motor(int potencia){
        this.potencia=potencia;
        //valor definido por você
    }
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
}
