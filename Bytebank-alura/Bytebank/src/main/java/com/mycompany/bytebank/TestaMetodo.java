package com.mycompany.bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();// nome da variavel é a letra minuscula e a maiuscula é o nome da conta.
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);// invoca o metodo deposita e add 50 ao valor
		System.out.println(contaDoPaulo.saldo);

		boolean conseguiuRetirar = contaDoPaulo.saca(20); // guarda o valor na variavel conseguiu retirar
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);// exibe o retorno do método

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(3000, contaDoPaulo);

		if(sucessoTransferencia) {
			System.out.println("Transferindo com sucesso!");
		} else {
			System.out.println("Erro ao transferir");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
	}

}
