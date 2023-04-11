package com.mycompany.brickbreakergame;

import java.awt.Color;
import static java.awt.Color.black;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.awt.event.KeyListener;
import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener, ActionListener { // implementando a interface - keyListener detecta as setas do teclado - ActionListener movimenta a bola.

    private boolean play = false; //o jogo não é iniciado automaticamente quando a tela aparece
    private int score = 0; // pontuação inicial
    private int totalBricks = 21;//quantodade de tijolos
    private Timer timer; //classe timer para definir o tempo de bola
    private int delay = 8; //velocidade da bola 
    private int playerX = 310; //posição inicila da barra de rolagem 
    private int ballposX = 120; //posição inicial da bola eixo x
    private int ballposY = 350;//posição inicial da bola euxo y
    private int ballXdir = -1;//direlção da bola eixo x
    private int ballYdir = -2;//direção da bola eixo y.

    public Gameplay() { //construtor
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }

    public void paint(Graphics g) {
        //background
        g.setColor(black);
        g.fillRect(1, 1, 692, 592);
        //border
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(691, 0, 3, 592);

        //the paddle
        g.setColor(Color.green);
        g.fillRect(playerX, 550, 100, 8);

        //the ball
        g.setColor(Color.yellow);
        g.fillOval(ballposX, ballposY, 20, 20);

    }
//os métodos abstratos que estão na interface devem ser implementados dentro da classe que está implementando o KeyListener e o ActionListener. (implementados apertando na setinha)

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if(playerX >=600){
            playerX=600;
            } else {
           moveRight();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        if(playerX <10){
            playerX=10;
            } else {
           moveLeft();
            }
        }
        
    }
    public void moveRight(){
        play =true;
        playerX+=20;
    }
     public void moveLeft(){
        play =true;
        playerX-=20;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
