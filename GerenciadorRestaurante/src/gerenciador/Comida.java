package gerenciador;


public class Comida implements Cardapio
{
    private double gramas;
    private String nome;
    private String descricao;
    public double preco;
    

    public Comida()
    {
        super();
    }
    public void setPeso(double g)
    {
        this.gramas=g;
    }

	@Override
	public void setnomeDoPrato(String nome) {
		this.nome=nome;
		
	}
	@Override
	public void setDescricao(String descricao) {
		this.descricao=descricao;
		
	}
	@Override
	public void setPreco(double preco) {
		this.preco=preco;
		
	}
	@Override
	public String getDescricao() {
		return this.descricao;
	}
	@Override
	public String getnomeDoPrato() {
		
		return this.nome;
	}
	@Override
	public double getPreco() {
		return this.preco;
	}
	
	public double getPeso()
	{
		return this.gramas;
	}
	
	@Override
    public String toString() {
        String info;
        info="\n"+ nome +"\n"+descricao+"\n"+Double.toString(preco)+"R$"+"\n"+Double.toString(gramas)+"g"+"\n";
        return info;
    }
    
}