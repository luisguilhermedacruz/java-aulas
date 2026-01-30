public class TesteProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Café", 100, 100);
        produto1.aumentarPreco(15);
        produto1.baixarVendaDoEstoque(2);
        System.out.println("Aumentamos o preço do " + produto1.getNome() + " para R$" + 
        produto1.getPreco() + " e vendemos 2 cafés, agora nosso estoque é de " + produto1.getQuantidadeEstoque());
    }
}
