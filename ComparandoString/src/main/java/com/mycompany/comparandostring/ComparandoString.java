
package com.mycompany.comparandostring;


public class ComparandoString {
    public static void main(String[] args) {
        String nome1 = "Jessica";
        String nome2 = "Jessica";
        String nome3 = new String("Jessica"); //criando um objeto.
        String resultado,res ;
        resultado = (nome1 == nome3)?"Igual":"Diferente";
        res =(nome1.equals(nome3))?"Igual":"Diferente"; // metodo para comparar se o conteudo de um objeto é igual ao outro.
        System.out.println(resultado);
        System.out.println(res);
        //o nome3 nunca será igual aos nomes 1 e 2 pois foi instanciado usando a clausula new, tendo então uma estrututa diferente.
        
    }
    
}
