/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank;

/**
 *
 * @author jessi
 */
public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;
    
    public void deposita(double valor) {//void não retorna nada. o double valor é o que ele recebe.
    	this.saldo += valor; //this faz com que o método se referencia a qual conta foi chamada.é opcional
    }
    public boolean saca(double valor) {
    	if (this.saldo >= valor) {
    		this.saldo-=valor; // se tiver saldo retira e retirna verdadeiro, se não retorna false.
    		return true;
    	}else {
    		return false;
    	}
    	
    }
}
