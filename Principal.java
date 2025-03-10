public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.setNome("Coca-Cola");
        produto1.setPreco(10);
        produto1.setQuantidade(50);

        produto2.setNome("Pepsi");
        produto2.setPreco(8);
        produto2.setQuantidade(30);

        produto1.imprimir();
        produto2.imprimir();
    }
}
