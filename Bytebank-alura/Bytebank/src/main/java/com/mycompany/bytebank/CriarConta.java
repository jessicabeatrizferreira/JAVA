

package com.mycompany.bytebank;

public class CriarConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); //primeira conta do tipo Conta recebe o que o new conta devolver
        primeiraConta.saldo = 200; //atribuiu um valor ao saldo da primeira conta. o ponto é a referencia do saldo da primeira conta.
        System.out.println(primeiraConta.saldo);
        
        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);
        
        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        
        System.out.println("A primeira conta tem: " + primeiraConta.saldo);
        System.out.println("A segunda conta tem: " + segundaConta.saldo);
        
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);
        
        System.out.println(segundaConta.agencia);
        
        segundaConta.agencia =145;
        System.out.println("Agora a conta está na agencia " +segundaConta.agencia);
        
        if (primeiraConta==segundaConta) {
        	System.out.println("Mesma coisa");
        }
        System.out.println(primeiraConta);
        
    }
}
