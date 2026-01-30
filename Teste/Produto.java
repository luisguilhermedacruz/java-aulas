public class Produto{
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque){
        validarNome(nome);
        validarPreco(preco);
        validarQuantidade(quantidadeEmEstoque);

        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

        public String getNome(){
            return nome;
        }

        public double getPreco(){
            return preco;
        }

        public int getQuantidadeEstoque(){
            return quantidadeEmEstoque;
        }

        private void validarNome(String nome){
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Produtos sem nome não serão permitidos!");
        }

    }

    private void validarPreco(double preco){
        if (preco < 0) {
            throw new IllegalArgumentException("Produtos não podem ter preço negativo!");
        }
    }

    private void validarQuantidade(int quantidadeEmEstoque){
        if (quantidadeEmEstoque < 0 ) {
           throw new IllegalArgumentException("Não fazemos vendas sem produto!"); 
        }
    }

    public void aumentarPreco(double value){
        if (value <= 0) {
            throw new IllegalArgumentException("Valor de aumento inválido!");
        }
        preco+=value;
    }

    public void reporEstoque(int quantidadeReposicao){
        if( quantidadeReposicao <= 0){
            throw new IllegalArgumentException("Valor de reposição inválido!");        
        }

        quantidadeEmEstoque += quantidadeReposicao;
    }

    public void baixarVendaDoEstoque(int quantidadeVendido){
        if (quantidadeVendido <= 0 ) {
            throw new IllegalArgumentException("Número de venda precisa ser real!");
        }

        if( quantidadeVendido > quantidadeEmEstoque){
            throw new IllegalArgumentException("Não fazemos vendas sem estoque!");
        }

        quantidadeEmEstoque -= quantidadeVendido;
    }
}