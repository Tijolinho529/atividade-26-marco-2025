public class MainProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Laptop", 1200.00, 5);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: " + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidade());
        System.out.println("Valor total em estoque: " + produto.calcularValorTotal());

        produto.setPreco(1350.00);
        produto.setQuantidade(8);

        System.out.println("\nNovo preço do produto: " + produto.getPreco());
        System.out.println("Nova quantidade em estoque: " + produto.getQuantidade());
        System.out.println("Novo valor total em estoque: " + produto.calcularValorTotal());
    }
}