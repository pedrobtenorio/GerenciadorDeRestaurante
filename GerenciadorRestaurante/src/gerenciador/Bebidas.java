package gerenciador;


public class Bebidas implements Cardapio
{
    private double ML;
    private String nome;
    private String descricao;
    public double preco;
    

    public Bebidas()
    {
        super();
    }
    public void setVolume(double v)
    {
        this.ML=v;
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
	
	public double getVolume()
	{
		return this.ML;
	}
	
	@Override
    public String toString() {
        String info;
        info="\n"+ nome +"\n"+descricao+"\n"+Double.toString(preco)+"R$"+"\n"+Double.toString(ML)+"Ml"+"\n";
        return info;
    }
    
}