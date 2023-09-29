package exercicio01;

public class Professor extends Pessoa {
    
    private String cracha;
    private char tipoVinculo;
    private double salario;

    public Professor(String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
        this.cracha = cracha;
        this.tipoVinculo = tipoVinculo;
        this.salario = salario;
    }

    
    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String imprimir() {
        return super.imprimir() +
                "\nCracha: " + cracha +
                "\nTipo Vinculo: " + tipoVinculo +
                "\nSalario: " + salario;
    }
    
    
}
