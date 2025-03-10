public class Produto {
    private double preco;
    private int quantidade;
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Valor inválido");
        }
    }

    public double getPreco() {
        return this.preco;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Quantidade inválida");
        }
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void vender(int total) {
        if (total > 0 && total <= this.quantidade) {
            this.quantidade -= total;
        } else {
            System.out.println("Quantidade inválida para venda");
        }
    }

    public void imprimir() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}
