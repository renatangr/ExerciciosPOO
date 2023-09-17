package exercicio01;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainExercicio01 {

    public static void main(String[] args) {
        int escolha, codigoCurso, horasCurso;
        String nomeCurso = null;
        String nomeAluno = null;
        String numeroRA = null;
        
        ArrayList<Curso> lstCursos = new ArrayList<>();
        
        
        Curso curso = new Curso ();
               
        Aluno aluno = new Aluno ();
        
        do {
        String[] options = {"Criar Curso", "Criar Aluno", "Remover Aluno", 
            "Mostrar Todos os Cursos", "Mostrar alunos do curso", "Sair" };
        
        escolha = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo:",
                "Escolha uma opção",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        
        
            switch (escolha) {
                case 0:
                    nomeCurso = JOptionPane.showInputDialog("Digite o nome do curso: ");
                    codigoCurso = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do curso: "));
                    horasCurso = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária: "));
                    
                    curso.setNome(nomeCurso);
                    curso.setCodigo(codigoCurso);
                    curso.setCargaHoraria(horasCurso);
                    
                    lstCursos.add(curso);
                    
                
                case 1:
                    Object[] optCursos = lstCursos.toArray();
                    
                    nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno: ");
                    numeroRA = JOptionPane.showInputDialog("Digite o RA do aluno: ");
                    
                    JOptionPane.showOptionDialog(null, "Escolha o curso matriculado:",
                    "Escolha uma opção",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optCursos, optCursos[0]);
                    
                   
            }
        } while (escolha != 5);
        
        
    }
  
    
}
