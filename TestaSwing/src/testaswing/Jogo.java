/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaswing;

import java.awt.Color;
import java.awt.Dimension;
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
        // limpa a janela
        Dimension d = this.getSize();
        g.setColor(Color.BLUE);
        g.fillOval((int) floor(d.getWidth()/2)-50,(int) floor(d.getHeight()/2)-25,50,50);
        
        
    }
    
}
