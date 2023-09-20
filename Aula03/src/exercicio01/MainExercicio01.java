package exercicio01;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainExercicio01 {

    public static void main(String[] args) {
        int escolha, codigoCurso, horasCurso, escolhaCurso;
        String nomeCurso = null;
        String nomeAluno = null;
        String numeroRA = null;
        
        ArrayList<Curso> lstCursos = new ArrayList<>();
        ArrayList<Curso> lstCursoNome = new ArrayList<>();
        ArrayList<Aluno> lstAlunos = new ArrayList<>();
        
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
                    
                    lstCursos.add(new Curso(codigoCurso, nomeCurso, horasCurso));
                    lstCursoNome.add(new Curso(nomeCurso));
                    
                    break;
                    
                case 1:              
                    if (lstCursos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Impossível cadastrar aluno sem cursos disponíveis.");
                    
                        break;
                    }
                    
                    nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno: ");
                    numeroRA = JOptionPane.showInputDialog("Digite o RA do aluno: ");
                    
                    Object[] Curso = lstCursoNome.toArray();  
                    
                    Object value = JOptionPane.showInputDialog(null, 
                                           "Escolha o curso do aluno:", 
                                           "Escolha do curso", 
                                            JOptionPane.QUESTION_MESSAGE, 
                                            null,
                                            Curso, 
                                            Curso[0]);

                    
                    for (int i = 0; i < lstCursos.size(); i++) {
                        System.out.println(i + ": " + lstCursoNome.get(i).getNome());
                    }

                    if (escolhaCurso >= 0 && escolhaCurso < lstCursoNome.size()) {
                        lstAlunos.add(new Aluno(numeroRA, nomeAluno));
                        lstCursos.get(escolhaCurso).inserirAluno(aluno);
                    } else {
                        JOptionPane.showMessageDialog(null, "Curso não encontrado.");
                    }
                    
                    
                    break;
                        
                case 2:
                    if (lstCursos.isEmpty() || lstAlunos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum curso ou aluno cadastrado!");
                    
                        break;
                    }
                        escolhaCurso = JOptionPane.showMessageDialog(null, "Escolha o curso ")
                                
                        
                        if (cursoSelecionado != null) {
                        int escolhaAluno = (int) JOptionPane.showInputDialog(null, "Selecione o aluno:",
                                "Selecionar Aluno", JOptionPane.QUESTION_MESSAGE, null, lstAlunos.toArray(), lstAlunos.get(0));
                        
                        cursoSelecionado.removerAluno(escolhaAluno);
                        JOptionPane.showMessageDialog(null, "Aluno removido no curso: " + cursoSelecionado.getNome());
                    }
                    
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, curso.imprimir());
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, curso.imprimirCompleto());
                    break;
                    
                case 5:
                    System.exit(0);
                    break;
            }
            
        } while (escolha != 5);
        
    }
    
}
