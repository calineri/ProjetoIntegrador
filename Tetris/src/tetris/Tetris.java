/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import javax.swing.JFileChooser;
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
        
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Arquivos PDF (*.pdf)", "pdf"));
        int retorno = chooser.showOpenDialog(null);
        
        
    }
    
}
