/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaswing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import static java.lang.Math.floor;
import javax.swing.JFrame;

/**
 *
 * @author celso.alineri
 */
public class Jogo extends JFrame{
    
    public Jogo(){
        super("Ola Mundo Grafico!");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    @Override
    public void paint(Graphics g){
        /*
        // limpa a janela
        Dimension d = this.getSize();
        g.setColor(Color.BLUE);
        g.fillOval((int) floor(d.getWidth()/2)-50,(int) floor(d.getHeight()/2)-25,50,50);
        */
        
        g.setColor(Color.BLACK);
        g.fillRect(750, 550, 50, 50);
        
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 500, 500);
        
        g.setColor(Color.DARK_GRAY);
        g.fillOval(150,200,200,40);
        
        g.setColor(Color.RED);
        g.fillOval(100,80,150,150);
        
        g.setColor(Color.PINK);
        g.fillOval(120,105,30,30);
        
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial Bold", Font.PLAIN, 36));
        g.drawString("Projeto Integrador III", 30,450);
        
    }
    
}
