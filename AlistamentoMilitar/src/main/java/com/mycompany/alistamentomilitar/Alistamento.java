/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alistamentomilitar;

public class Alistamento {

    public static void main(String[] args) {
        char sexo = 'M';
        int idade = 18;
        if ((sexo == 'M' || sexo == 'F') && idade < 18) {
            System.out.println("Alistamento Não Permitido!");
        } else if (sexo == 'M' && idade >= 18) {
            System.out.println("Alistamento Obrigatório");
        } else if (sexo == 'F' && idade >= 18) {
            System.out.println("Deseja se alistar?");
        }
    }
}
