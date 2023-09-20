package exercicio01;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainExercicio01 {

    public static void main(String[] args) {
        int escolha, codigoCurso, horasCurso, escolhaCurso, escolhaAluno, escolhaCursoMostrarAlunos;
        String nomeCurso = null;
        String nomeAluno = null;
        String numeroRA = null;
        
        ArrayList<Curso> lstCursos = new ArrayList<>();
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
                    
                    lstCursos.add(new Curso(codigoCurso, nomeCurso, horasCurso));
                    
                    break;
                    
                case 1:              
                    if (lstCursos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Impossível cadastrar aluno sem cursos disponíveis.");
                    
                        break;
                    }
                    
                    nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno: ");
                    numeroRA = JOptionPane.showInputDialog("Digite o RA do aluno: ");
                    
                    String[] opcoesCurso = new String[lstCursos.size()];
                    
                    for (int i = 0; i < lstCursos.size(); i++) {
                    opcoesCurso[i] = lstCursos.get(i).getNome();
                    }
                    
                    escolhaCurso = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo:",
                    "Escolha uma opção",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesCurso, opcoesCurso[0]);
        
                    lstAlunos.add(new Aluno(numeroRA, nomeAluno));
                    lstCursos.get(escolhaCurso).inserirAluno(aluno);
                                       
                    break;
                        
                case 2:
                    if (lstCursos.isEmpty() || lstAlunos.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhum curso ou aluno cadastrado!");
                    break;
                    }
                    
                    String[] opcoesCurso2 = new String[lstCursos.size()];
                    
                    for (int i = 0; i < lstCursos.size(); i++) {
                    opcoesCurso2[i] = lstCursos.get(i).getNome();
                    }
                    
                    escolhaCurso = JOptionPane.showOptionDialog(null, "Escolha o curso que o aluno está matriculado:",
                        "Escolha uma opção",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesCurso2, opcoesCurso2[0]);

                    String[] opcoesAluno = new String[lstAlunos.size()];
                    
                    for (int i = 0; i < lstAlunos.size(); i++) {
                        opcoesAluno[i] = lstAlunos.get(i).getNome();
                    }

                    escolhaAluno = JOptionPane.showOptionDialog(null, "Escolha o aluno a ser removido do curso:",
                        "Escolha uma opção",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesAluno, opcoesAluno[0]);

                    Curso cursoEscolhido = lstCursos.get(escolhaCurso);
                    Aluno alunoRemovido = lstAlunos.get(escolhaAluno);

                    cursoEscolhido.removerAluno(alunoRemovido); 
                    JOptionPane.showMessageDialog(null, "Aluno(a) " + alunoRemovido.getNome() + " removido(a) do curso " + cursoEscolhido.getNome());

                    break;
                    
                case 3:
                    for (Curso c : lstCursos) {
                    JOptionPane.showMessageDialog(null, "Cursos cadastrados: " + c.imprimir());
                    }
                    break;
                    
                case 4:
                    String[] opcoesCurso3 = new String[lstCursos.size()];                    
                    
                    for (int i = 0; i < lstCursos.size(); i++) {
                    opcoesCurso3[i] = lstCursos.get(i).getNome();
                    }
                    
                    escolhaCursoMostrarAlunos = JOptionPane.showOptionDialog(null, "Escolha o curso que o aluno está matriculado:",
                        "Escolha uma opção",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesCurso3, opcoesCurso3[0]);
                    
                    JOptionPane.showMessageDialog(null, "Alunos cadastrados no curso " + lstCursos.get(escolhaCursoMostrarAlunos).getNome() + " : ");
                    
                    for (Aluno a : lstAlunos) {
                        
                        JOptionPane.showMessageDialog(null, "Cursos cadastrados: " + a.imprimir());
                        
                    }
                    
                    // 
                    
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    System.exit(0);
                    break;
            }
            
        } while (escolha != 5);
        
    }
    
}
