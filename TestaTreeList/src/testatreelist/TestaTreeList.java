/*
 * Faculdade SENAC
 * Tecnologia em Jogos Digitais - 3º Semestre - 2019
 * Aluno: Celso Alineri
 */
package testatreelist;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author celso.alineri
 */
public class TestaTreeList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] numbers = {75, 1235, 45, 845, 96, 1235, 4864, 1, 212, 36, 220, 
          123, 451, 11, 23, 9, 245, 1477, 1233, 8};
        
        SortedSet<Integer> tree = new TreeSet(Arrays.asList(numbers));
        
        System.out.println("sorted set: ");
        printSet(tree);
        
        System.out.println("headSet (\"1235\"): ");
        printSet(tree.headSet(1235));
        
        System.out.println("tailSet (\"1235\"): ");
        printSet(tree.tailSet(1235));
        
        System.out.printf("first: %s%n", tree.first());
        System.out.printf("last: %s%n", tree.last());
    }
    
    private static void printSet(SortedSet<Integer> set){
        //for(Integer i: set){
            System.out.printf("%s ", set);
        //}
        System.out.println();
    }
    
}
