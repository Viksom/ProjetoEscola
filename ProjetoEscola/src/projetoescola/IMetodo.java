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
public interface IMetodo {
    void Cadastrar_aluno(String nome, ArrayList<String> disc, ArrayList<Integer> nota, int number_phone, String ender, boolean propina);
    Aluno Consultar_aluno(String nome);
    ArrayList<Aluno> Ver_lista_aluno();
    void Atualizar_aluno(Aluno dados);
    void Remover_aluno(Aluno dados);
}
