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
public class Disciplina {
    public ArrayList<String> nome_disc;
    public ArrayList<Integer> Nota;
    public int Estado;
    
    public Disciplina(ArrayList<String> disciplina, ArrayList<Integer> nota) {
        this.nome_disc = disciplina;
        this.Nota = nota;
    }
    
    public void Media() {
        double media = 0.00;
        for(int nota : this.Nota) {
            media += nota;
        }
        if((media/this.Nota.size()) >= 10) {
            this.Estado = 1;
        }
        else {
            this.Estado = 0;
        }
    }
}
