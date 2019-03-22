/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaarraylist;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author celso.alineri
 */
public class TestaArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<String>();
        
        for(String color: colors){
            list.add(color); // adciona cor ao final da lista
        }
    }
    
}
