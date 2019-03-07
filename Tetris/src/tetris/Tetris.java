/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author celso.alineri
 */
public class Tetris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        System.out.println("Ola Mundo!");
        /*
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Arquivos PDF (*.pdf)", "pdf"));
        int retorno = chooser.showOpenDialog(null);
        */
        
        
        // Cria os botoes
        JButton botaoOK = new JButton("OK");
        JButton botaoSair = new JButton("Sair");

        botaoSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Pressionou botao Sair. Tchau!");
                System.exit(0);
            }
        });
        
        botaoOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Pressionou botao OK!");
            }
        });
        
        // Cria o painel para adcionar os botoes
        JPanel panel = new JPanel();
        panel.add(botaoOK);
        panel.add(botaoSair);
        
        // Cria o frame (janela) para adcionar os paineis
        JFrame janela = new JFrame("Teste");
        janela.add(panel);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setVisible(true);
        
    }
    
}
