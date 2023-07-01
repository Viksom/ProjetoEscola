package projetoescola;

import java.util.ArrayList;

/**
 *
 * @author Viksóm
 */
public class Implementacao implements IMetodo
{
    public ArrayList<Aluno> alunos = new ArrayList<>();
    private int Process_Number = 202300;

    @Override
    public void Cadastrar_aluno(String nome, ArrayList<String> disc, ArrayList<Integer> nota, int number_phone, String ender, boolean propina) {
        String n_proc = "" + this.Process_Number;
        this.alunos.add(new Aluno(nome, n_proc, disc, nota, number_phone, ender, propina));
        this.Process_Number ++;
    }

    @Override
    public Aluno Consultar_aluno(String nome) {
        for (Aluno aluno : this.alunos) { return aluno; }
        return null;
    }

    @Override
    public ArrayList<Aluno> Ver_lista_aluno() { return this.alunos; }

    @Override
    public void Atualizar_aluno(Aluno dados) {
        int i = 0;
        for (Aluno aluno : this.alunos) {
           if (aluno.N_processo.equals(dados.N_processo)) {
               alunos.set(i, dados);
               break;
           }
           i++;
        }
    }

    @Override
    public void Remover_aluno(Aluno dados) {
        int i = 0;
        for (Aluno aluno : this.alunos) {
           if (aluno.N_processo.equals(dados.N_processo)) {
               alunos.remove(i);
               break;
           }
           i++;
        }
    }
}
