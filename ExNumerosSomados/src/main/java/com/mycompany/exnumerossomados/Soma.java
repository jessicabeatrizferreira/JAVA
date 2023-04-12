/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exnumerossomados;

import java.util.Scanner;

/**
 *
 * @author Jéssica Beatriz
 */
public class Soma {
    public static void main(String[] args) {
        int num, soma=0;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("DIGITE UM NÚMERO: ");
            num = teclado.nextInt();
            soma+=num;
            System.out.println("QUER CONTINUAR? APERTE S PARA SIM E N PARA NÃO!");
            resposta =teclado.next();
        } while (resposta.equals("s"));
        System.out.println("A SOMA DOS VALORES É:" + soma);
    }
}
