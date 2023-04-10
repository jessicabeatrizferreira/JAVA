/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculoir;

/**
 *
 * @author jessi
 */
public class CalculoIR {

    public static void main(String[] args) {
        double salario = 3300.0;

        if (salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("Aua aliquota é de 7,5%");
            System.out.println("Você pode deduzir até R$142,00");
        } else if (salario >= 2800.0 && salario <= 3751.0) {
            System.out.println("A sua aliquiota é de 15%");
            System.out.println("Você pode deduzir até R$350,00");
        } else if (salario >= 3751.0 && salario <= 4664.0) {
            System.out.println("A sua aliquota é de 22.5%");
            System.out.println("Você pode deduzir até R$636,00");
        }
    }
}
