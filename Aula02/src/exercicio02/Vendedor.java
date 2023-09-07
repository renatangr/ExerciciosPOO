package exercicio02;

public class Vendedor {
    private int codigo;
    private String nome;
    private double percentualComissao;
    
    public Vendedor (int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;   
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

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    public double calcularPagamentoComissao (double valorVenda) {
        return valorVenda * percentualComissao / 100;
    }
    
    public double calcularPagamentoComissao (double valorVenda, double valorDesconto) {
        return (valorVenda - valorDesconto) * percentualComissao/100;
    }
    
    public String imprimir () {
       return "Código do vendedor: " + getCodigo() +
              "\nNome do vendedor: " + getNome() +
              "\nPercentual de Comissão: " + getPercentualComissao() + " %";

    }
    
    public String imprimir(String str) {
        return imprimir() + "\n" + str;
    }
    
    public String imprimir (double valorVenda) {
        return "Código do vendedor: " + getCodigo() +
              "\nNome do vendedor: " + getNome() +
              "\nValor da venda: R$ " + valorVenda +
              "\nPercentual de Comissão: " + getPercentualComissao() + " %" +
              "\nValor total da comissão: R$ " + calcularPagamentoComissao(valorVenda);
    }
    
    public String imprimir(double valorVenda, double valorDesconto) {
        return "Código do vendedor: " + getCodigo() +
              "\nNome do vendedor: " + getNome() +
              "\nValor da venda: R$ " + valorVenda +
              "\nPercentual de Comissão: " + getPercentualComissao() + " %" +
              "\nDesconto: R$ " + valorDesconto +
              "\nValor total da comissão: R$ " + calcularPagamentoComissao(valorVenda, valorDesconto);
    }
}
