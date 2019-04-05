/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.atvdpooandre;

/**
 *
 * @author Guilherme
 */
public class AtvdPOOAndre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        
        lampada.setPotencia(50);
        lampada.ligar();
        lampada.desligar();
        
        System.out.println(lampada.getPotencia());
        if(lampada.isEstado()){
            System.out.println("A lampada  de " + lampada.getPotencia() +" está ligada");
        }else{
            System.out.println("A lampada  de " + lampada.getPotencia() +" não está ligada");
        }
        
        Lampada lampada2 = new Lampada(600,true);
        if(lampada2.isEstado()){
            System.out.println("A lampada  de " + lampada2.getPotencia() +" está ligada");
        }else{
            System.out.println("A lampada  de " + lampada2.getPotencia() +" não está ligada");
        }
    }
    
}
