/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exvetorfill;

import java.util.Arrays;

/**
 *
 * @author Jéssica Beatriz
 */
public class ClasseVetor {
    public static void main(String[] args) {
        int v[] = new int[20];
        Arrays.fill(v,0);
        for (int valor:v){
            System.out.println(valor);
        }
    }
    
}
