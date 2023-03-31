/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.contador;

/**
 *
 * @author Jéssica Beatriz
 */
public class Contagem {
    public static void main(String[] args) {
        int contador = 0;
        while (contador<15){
            contador++;
            if (contador ==5 ||contador ==7){
                continue;
            }
            if (contador ==12){
                break;
            }
            System.out.println("Cambalhota!" + contador);
            
        }
    }
}
