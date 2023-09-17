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
        String[] options = {"Cadastrar Curso", "Cadastrar Aluno", "Remover Aluno", 
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
                    
                    lstCursos.add(new Curso(codigoCurso, nomeCurso,horasCurso));
                    
                    break;
                    
                
                case 1:
                                      
                    if (lstCursos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Impossível cadastrar aluno sem cursos disponíveis.");
                    
                        break;
                    }
                    
                    nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno: ");
                    numeroRA = JOptionPane.showInputDialog("Digite o RA do aluno: ");
                                       
                    Curso cursoSelecionado = (Curso) JOptionPane.showInputDialog(null, "Selecione o curso:",
                                "Selecionar Curso", JOptionPane.QUESTION_MESSAGE, null, lstCursos.toArray(), lstCursos.get(0));
                        
                        if (cursoSelecionado != null) {
                            cursoSelecionado.inserirAluno(new Aluno(nomeAluno,numeroRA));
                            JOptionPane.showMessageDialog(null, "Aluno cadastrado no curso: " + cursoSelecionado.getNome());
                        }
                
                case 5:
                    System.exit(0);
                    break;

                   
            }
        } while (escolha != 5);
        
        
    }
  
    
}
