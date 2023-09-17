package exercicio01;

import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Curso> lstCursos;
    private ArrayList<Aluno> lstAlunos;
    
    public Curso () {
        lstAlunos = new ArrayList<>();
        lstCursos = new ArrayList<>();
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
    
    public void removerAluno (int index) {
        lstAlunos.remove(index);
    }
    
    public String imprimir () {
        String impr = "";
        
        impr += "Dados do curso" +
                      "\n-------------------------"+
                      "\nCódigo: " +codigo+
                      "\nNome: " +nome+
                      "\nCarga horária:" +cargaHoraria;
        
        for (Curso curso : lstCursos) {
        impr += curso.imprimir();
        }
        return impr;
    }
    
    
    public String imprimirCompleto () {    
        String str = "";
        str += "***Dados do curso***" +
                "\n-------------------------"+
                "\nCódigo: " +codigo+
                "\nNome: " +nome+
                "\nCarga horária:" +cargaHoraria +
                
                "\n***Dados dos alunos***";
        
        for (Aluno aluno : lstAlunos) {
            str += aluno.imprimir();
        }
        
        return str;
    }
}
