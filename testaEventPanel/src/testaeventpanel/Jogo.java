/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaeventpanel;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author celso.alineri
 */
public class Jogo extends JPanel implements KeyListener {
    private boolean jogoAtivo; // variável de controle para game Loop
    
    public Jogo(){
        // Cria a moldura a janela
        JFrame frame = new JFrame("Ola Mundo Grafico");

        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);//desabilita maximizar janela
        frame.setVisible(true);
        frame.add(this); // adiciona o JPanel na janela
        frame.addKeyListener(this); // registra o JPanel na lista de eventos a serem repassados
        setFocusable(true); // permite o JPanel receber o os eventos
        
        this.setBackground( Color.white ); // muda cor de fundo do JPanel

        jogoAtivo = true; // seta que o jogo está ativo
    }
    
    //Exemplo do loop principal do jogo
    public void run() {
        while(this.jogoAtivo) {
            //(Os eventos NÃO são tratados aqui)

            // faz as simulações fisicas
            //desenha a tela
            repaint();

            // aguarda alguns milisegundos
            try {
                Thread.sleep(50);
            } catch(InterruptedException ex) {}
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Type na tecla:"+e.getKeyChar());

    }
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Pressionei a tecla:"+e.getKeyChar());

    }
    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Liberei a tecla:"+e.getKeyChar());
        
    }
}
