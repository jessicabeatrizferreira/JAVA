/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bytebank;

/**
 *
 * @author jessi
 */
public class CriarConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); //primeira conta do tipo Conta recebe o que o new conta devolver
        primeiraConta.saldo = 200; //atribuiu um valor ao saldo da primeira conta. o ponto é a referencia do saldo da primeira conta.
        System.out.println(primeiraConta.saldo);
    }
}
