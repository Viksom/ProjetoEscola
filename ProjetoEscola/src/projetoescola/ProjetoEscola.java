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
        Implementacao acesso = new Implementacao();
        
        ArrayList<Aluno> Lista_alunos;
        ArrayList<String> disc = new ArrayList<>();
        ArrayList<Integer> notas = new ArrayList<>();
        
        disc.add("SD");
        notas.add(0);
        disc.add("AMI");
        notas.add(0);
        
        acesso.Cadastrar_aluno("Alberto", disc, notas, 921, "Luanda-Sul");
        acesso.Cadastrar_aluno("Jorge", disc, notas, 921, "Calemba 2");
        
        Lista_alunos = acesso.Ver_lista_aluno();
        
        acesso.Remover_aluno(Lista_alunos.get(1));
        Lista_alunos.get(0).Nome = "Paulo";
        acesso.Atualizar_aluno(Lista_alunos.get(0));
        
        for (Aluno alunos : Lista_alunos) {
            System.out.println(alunos.Nome);
        }
    }
}
