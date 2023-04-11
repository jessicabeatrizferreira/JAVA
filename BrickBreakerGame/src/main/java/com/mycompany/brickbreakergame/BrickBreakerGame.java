/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.brickbreakergame;
import javax.swing.JFrame;

/**
 *
 * @author jessi
 */
public class BrickBreakerGame {

    public static void main(String[] args) {
       JFrame obj = new JFrame(); //criando a tela
       Gameplay gameplay = new Gameplay(); // criando um objeto da game play
       obj.setBounds(10,10,700,600); //definindo o tamanho da tela
       obj.setTitle("Breakout Ball"); // definindo o nome
       obj.setResizable(false); //não tera o seu tamanho alteravel
       obj.setVisible(true); 
       obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       obj.add(gameplay); //add a gameplay dentro do jframe
       
    }
}
