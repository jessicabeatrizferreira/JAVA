/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testeir;

/**
 *
 * @author jessi
 */
public class TesteIR {

    public static void main(String[] args) {
 
        double salario =3300.0;
        
        if (salario <2600.0){
            System.out.println("A sua Aliquota é de 15%");
            System.out.println("Voce pode deduzir até R$350,00");
        }
        if (salario <3750.0){
            System.out.println("A sua Aliquota é de 22%");
            System.out.println("Voce pode deduzir até R$636,00");
        }
        
    }
}
