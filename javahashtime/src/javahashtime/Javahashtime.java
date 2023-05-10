/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahashtime;
  
import java.util.*;
/**
 *
 * @author guilh
 */
public class Javahashtime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Hash Map ------------------------------------
        HashMap<Integer,String> pessoaHashMap = new HashMap<>();

        long tempoInicial = System.currentTimeMillis();
        
        for (int i = 0; i < 100000; i++) { pessoaHashMap.put(i,"Pessoa"+i); }
        for (int i = 0; i < 100000; i++) { pessoaHashMap.containsKey(i); }

        long tempoFinal = System.currentTimeMillis(); 
        System.out.printf("%.3f segundos%n", (tempoFinal - tempoInicial) / 1000.00); 
        //------------------------- Array List
        ArrayList<Integer> pessoaArray = new ArrayList<>();
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) { pessoaArray.add(i); }
        for (int i = 0; i < 100000; i++) { pessoaArray.contains(i); }
        tempoFinal = System.currentTimeMillis(); 
        System.out.printf("%.3f segundos%n", (tempoFinal - tempoInicial) / 1000.00); 
    }
    
}
    

