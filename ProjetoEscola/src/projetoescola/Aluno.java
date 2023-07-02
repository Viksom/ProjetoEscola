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
public class Aluno {
    public String Nome;
    public String N_processo;
    public Disciplina disciplina;
    public Contacto contacto;
    public Endereco endereco;
    public boolean Propina;
    
    public Aluno(String nome, String n_proc, ArrayList<String> disc, ArrayList<Integer> nota, String cont, String ender, boolean propina) {
        this.Nome = nome;
        this.N_processo = n_proc;
        this.disciplina = new Disciplina(disc, nota);
        this.contacto = new Contacto(cont);
        this.endereco = new Endereco(ender);
        this.Propina = propina;
    }
}
