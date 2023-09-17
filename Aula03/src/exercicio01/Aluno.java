package exercicio01;

public class Aluno {
    private String ra;
    private String nome;

    public Aluno () {
        this.nome = nome;
        this.ra = ra;
    }
    
    public Aluno (String ra, String nome) {
        this.nome = nome;
        this.ra = ra;
        
    }
    
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String imprimir () {
        return  "\n====================" +
                "\nRA: " +ra+
                "\nNome: " +nome;         
    }
    
}
