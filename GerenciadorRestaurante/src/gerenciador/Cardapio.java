package gerenciador;


public interface Cardapio
{
   
   public void setnomeDoPrato(String nome);
    public void setDescricao(String descricao);
    public void setPreco(double preco);    
    public String getDescricao();
    public String getnomeDoPrato();
    public double getPreco();
    public String toString();


}