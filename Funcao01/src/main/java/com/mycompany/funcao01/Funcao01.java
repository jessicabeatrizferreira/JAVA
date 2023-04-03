/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.funcao01;

import com.mycompany.funcao02.Fatorial;

/**
 *
 * @author Jéssica Beatriz
 */
public class Funcao01 {
    public static void main(String[] args) {
        
        
        Fatorial f = new Fatorial();
        f.setValor(5);
        System.out.println(f.getFormula());
        System.out.println(f.getFatorial());
        
    
    }
}
