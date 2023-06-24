/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoescola;

import java.util.ArrayList;

/**
 *
 * @author Viksóm
 */
public class ProjetoEscola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> my_list = new ArrayList<>();
        System.out.println("Meu primeiro Envio!");
        for(int i=0; i!=10; i++) {
            my_list.add(i);
        }
        
        System.out.println("Valores inseridos.");
        for(int k=0; k!=10; k++) {
            System.out.println(my_list.get(k));
        }
    }
    
}
