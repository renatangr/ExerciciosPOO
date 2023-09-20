package exercicio01;

import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Aluno> lstAlunos;
    private ArrayList<Curso> lstCursos;
    
    public Curso () {
        lstAlunos = new ArrayList<>();
    }
    
    
    public Curso (int codigo, String nome, int cargaHoraria) {
        this();
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public void inserirAluno (Aluno aluno) {
        lstAlunos.add(aluno);
    }
    
    public void removerAluno (Aluno aluno) {
        lstAlunos.remove(aluno);
    }
    
    public String imprimir () {
        StringBuilder sb = new StringBuilder();
         sb.append ("Dados do curso").append("\n-------------------------").append("\nCódigo:").append(getCodigo()).append("\nNome").append(getNome()).append("\nCarga Horária: ").append(getCargaHoraria());
         return sb.toString(); 
    }
    
    
    public String imprimirCompleto () {    
        StringBuilder sb = new StringBuilder();
        sb.append ("Dados do curso").append("\n-------------------------").append("Código: ").append(codigo).append("\nNome: ").append(nome).append("\nCarga Horária: ").append(cargaHoraria);
        sb.append("\nDados dos Alunos:").append("\n-------------------------");
        
        for (Aluno a : lstAlunos) {
            sb.append(a.imprimir()).append("\n");
        }
        return sb.toString();
    }
}
