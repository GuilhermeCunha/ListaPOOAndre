/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.atvdpooandre;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Calculadora {
    
    
    public double somar(double a, double b){
        return (a+b);
    }
    public double subtrair(double a, double b){
        return (a-b);
    }    
    public double multiplicar(double a, double b){
        return (a*b);
    }
    public double dividir(double a, double b){
        if(b==0){
            JOptionPane.showMessageDialog(null, "Não se pode dividir por 0");
            return 0;
        }
        return a/b;  
    }    
}
