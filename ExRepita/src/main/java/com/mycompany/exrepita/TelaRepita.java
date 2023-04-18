/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exrepita;

import javax.swing.JOptionPane;
/**
 *
 * @author Jéssica Beatriz
 */
public class TelaRepita {
    public static void main(String[] args) {
       // JOptionPane.showMessageDialog(null,"Olá mundo!","Bem Vindo!", JOptionPane.INFORMATION_MESSAGE);
       int n, s=0;
       do {
       n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe um número: <br><em> (Zero Interrompe!)</em></html>"));
       //JOptionPane.showMessageDialog(null,"Voçê digitou " + n);
       s +=n;
       }while (n!=0);
       JOptionPane.showMessageDialog(null, "O Somatório é: " + s);
    }
    
}
