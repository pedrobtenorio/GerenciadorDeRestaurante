package gerenciador;

import java.util.ArrayList;
import java.util.Scanner;

import funcionarios.Funcionario;




public class Mesas{
	Scanner input = new Scanner(System.in);
	private String identificacao, pedidos;
	private boolean ocupada, suja, pendente;
	private double conta;
	
	public Mesas(String id, String pedidos, boolean oc, boolean suja, double conta, boolean pendente) 
	{
		this.identificacao=id;
		this.pedidos=pedidos;
		this.ocupada=oc;
		this.suja=suja;
		this.conta=conta;
		this.pendente=pendente;
	}
	
	public String toString() {
        String info;
        info="\n"+"identificacao: "+identificacao+"\nPedidos: "+pedidos+"conta: "+ Double.toString(conta)+"\n";
        return info;
    }
	

	public void criarMesa(Mesas mesasdobar[], ArrayList<Mesas> mesa){
		String id;
		
		
		int i;
    	for(i=0; i<=99; i++)
		{
			
			if(mesasdobar[i].getidentificacao()==null)
			{
				break;
			}
		}
		System.out.println("Insira o Registro da mesa");
		id=input.nextLine();
		
		for (Mesas s : mesa ) 
		{
			if(s.getidentificacao().equals(id))
			{
				System.out.println("ja existe uma mesa com esse registro, operacao cacelada!");
				return;
			}
		}
		mesasdobar[i].setidentificacao(id);
		mesa.add(mesasdobar[i]);	
		return;
	}
	
	public boolean getPendente()
	{
		return this.pendente;
	}
	
	public void setPendente(boolean status)
	{
		this.pendente=status;
		return;
	}
	
	public void setSuja(boolean status)
	{
		this.suja=status;
		return;
	}
	
	public void refreshall()
	{
		this.identificacao=null;
		this.pedidos=" ";
		this.ocupada=false;
		this.suja=false;
		this.conta=0;
	}
	
	public double getConta()
	{
		return this.conta;
	}
	
	public double fecharMesa(ArrayList<Mesas> mesa, double caixa)
	{
		String id;
		double dinheiro;
		System.out.println("digite a identificacao da mesa que voce quer fechar a conta");
		id=input.nextLine();	
		for (Mesas s : mesa ) {
			if(s.getidentificacao().equals(id))
			{
				if(s.verOcupada()==false)
				{
					System.out.println("nao tem ninguem nessa mesa");
					return caixa;
				}
				if(s.pendente)
				{
					System.out.println("os pedidos dessa mesa nao foram entregues logo voce nao pode fecha-la");
					return caixa;
				}
				dinheiro=s.getConta();
				System.out.println("essa mesa pagou " + Double.toString(dinheiro) + " reais\n");
				caixa=caixa+dinheiro;
				s.refreshall();
				return caixa;
				
			}
		}
		System.out.println("Nao foi encontrada mesa com essa identificacao");
		return caixa;
	}
	


	private void setidentificacao(String id) {
		this.identificacao=id;
		return;
		
	}
	
	private void setConta(double c)
	{
		this.conta=this.conta+c;
		return;
	}
	
	
	
	private void setPedidos(String pedido) {
		this.pedidos=this.pedidos.concat(pedido);
		this.pedidos=this.pedidos.concat("  ");
		return;
		
	}
	
	public String getPedido()
	{
		return this.pedidos;
	}


	public String getidentificacao() {
		return this.identificacao;
	}


	public void removerMesa(ArrayList<Mesas> mesa)
	{
		String id;
		System.out.println("digite a identificacao da mesa");
		id=input.nextLine();	
		for (Mesas s : mesa ) {
			if(s.getidentificacao().equals(id))
			{
				
				mesa.remove(s);
				System.out.println("mesa removida");
				return;
			}
		}
		System.out.println("Nao foi encontrada mesa com essa identificacao");
		return;
	}
	
	
	public void limparMesa(ArrayList<Funcionario> funcionarios, ArrayList<Mesas> mesa) {
		boolean flag=false;
		for (Funcionario s : funcionarios )
		{
			if(s.getClasse().equals("SG"))
			{
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Voce nao tem Servicos gerais, contrate algum");
			return;
		}
		String id;
		System.out.println("digite a identificacao da mesa que voce deseja LImpar");
		id=input.nextLine();
		for(Mesas s : mesa)
		{
			if(s.getidentificacao().equals(id))
			{
				if(s.verSuja())
				{
					s.setSuja(false);
				}
				else
				{
					System.out.println("a mesa ja esta limpa.");
				}
				return;
			}
		}
		System.out.println("a mesa nao existe");
		return;
		
	}
	
	
	
	public void anotarPedido(ArrayList<Mesas> mesa, ArrayList<Cardapio> cardapio)
	{
		boolean pedindo = true;
		while(pedindo)
		{
			String prato, str, digito;
			double preco=0;
			boolean achou =false;
			boolean mesaExiste=false;
			System.out.println("insira o nome da comida que a mesa quer");
	    	prato=input.nextLine();
	    	for (Cardapio s : cardapio ) 
			{
				if(s.getnomeDoPrato().equals(prato))
				{
					achou=true;
					preco=s.getPreco();
					
				}
			}
	    	if(achou==false)
	    	{
	    		System.out.println("essa comida nao foi achada no cardapio.");
	        	
	    	}
	 
	    	else
	    	{
	    		System.out.println("insira a identificacao da mesa que esta pedindo a comida");
		    	str=input.nextLine();
				for (Mesas s : mesa ) 
				{
					if(s.getidentificacao().equals(str))
					{
						mesaExiste=true;
						s.setPedidos(prato);
						s.setConta(preco);
						System.out.println("pedido adicionado");
						
					}
				}
				if(!mesaExiste)
				{
					System.out.println("essa mesa nao foi encontrada");
				}
				
	    	}
	    	
			
			System.out.println("se ainda deseja continuar pedindo digite 1");
			digito=input.nextLine();
			if(digito.equals("1"))
			{
				pedindo=true;
			}
			else
			{
				pedindo=false;
			}
		}
		
		return;
		
	}
	
	private boolean verSuja()
	{
		return this.suja;
	}
	public boolean verOcupada()
	{
		return this.ocupada;
	}
	
	private void ocupar()
	{
		this.ocupada=true;
		return;
	}
	
	public void entregarPedido(ArrayList<cozinha> pedidos, ArrayList<Funcionario> funcionarios, ArrayList<Mesas> mesa) {
		boolean flag=false;
		boolean mesaStatus=false;
		for (Funcionario s : funcionarios )
		{
			if(s.getClasse().equals("Garcom"))
			{
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Voce nao tem Garcoms, contrate algum");
			return;
		}
		String id;
		System.out.println("digite a identificacao da mesa que voce deseja servir");
		id=input.nextLine();
		for(cozinha s : pedidos)
		{
			if(s.getIdMesa().equals(id))
			{
				if(s.getStatus().equals("Pronto"))
				{
			
					mesaStatus=true;
					if (mesaStatus==true)
					{
						for(Mesas a : mesa)
						{
							if(a.getidentificacao().equals(id))
							{
								a.setPendente(false);
								System.out.println("pedido entregue na mesa");
							}
						}
						return;
					}				
					
				}
				else
				{
					
					System.out.println("o pedido nao esta pronto");
				}
				return;
			}
		}
		System.out.println("esse pedido nao esta na cozinha");
		return;
		
	}
	
	
	
	public void ocuparMesa(ArrayList<Mesas> mesa)
	{
		String str;
		System.out.println("insira a identificacao da mesa que os clientes irao sentar");
		str=input.nextLine();
		for (Mesas s : mesa ) 
		{
			
			if(s.getidentificacao().equals(str))
			{
				if(s.verSuja())
				{
					System.out.println("essa mesa esta suja e nao pode ser usada, pe�a para um funcionario dos servi�oes gerais limpar");
					return;
				}
				if(s.verOcupada())
				{
					System.out.println("essa mesa esta ocupada e nao pode ser usada.");
					return;
				}
				else
				{
					s.ocupar();
					System.out.println("Os clientes estao na mesa!");
					return;
				}
			}
		}
	}
}