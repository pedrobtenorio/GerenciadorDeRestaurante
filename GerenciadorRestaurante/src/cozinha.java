import java.util.ArrayList;
import java.util.Scanner;

import funcionarios.Funcionario;


public class cozinha
{
	private String pedido, idMesa, Status;
	Scanner input = new Scanner(System.in);
	
	public cozinha(String pedido, String idMesa, String Status )
    {
        this.pedido=pedido;
        this.idMesa=idMesa;
        this.Status=Status;
    }
	
	
	public void refresCozinha()
	{
		this.pedido=null;
		this.idMesa=null;
		this.Status=null;
		
	}

	public String getIdMesa() {
		return idMesa;
	}

	public void setIdMesa(String idMesa) {
		this.idMesa = idMesa;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
	public void mudarParaPronto(ArrayList<cozinha> pedidos, ArrayList<Funcionario> funcionarios)
	{
		boolean flag=false;
		for (Funcionario s : funcionarios )
		{
			if(s.getClasse().equals("Cozinheiro"))
			{
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Voce nao tem cozinheiros, contrate algum");
			return;
		}
		String id;
		System.out.println("digite a identificacao da mesa quer mudar o status do prato");
		id=input.nextLine();
		for(cozinha s : pedidos)
		{
			if(s.getIdMesa().equals(id))
			{
				if(s.getStatus().equals("Pronto"))
				{
					System.out.println("o pedido ja esta pronto");
					
				}
				else
				{
					s.setStatus("Pronto");
					System.out.println("o pedido  esta pronto");
				}
				return;
			}
		}
		System.out.println("esse pedido nao esta na cozinha");
		return;
	}
	
	public void colocarEmAndamento(ArrayList<Mesas> mesa, ArrayList<cozinha> pedidos, cozinha pedidoarray[])
	{
		String id;
		System.out.println("digite a identificacao da mesa que voce quer por o pedido em andamento");
		id=input.nextLine();	
		for (Mesas s : mesa ) {
			if(s.getidentificacao().equals(id))
			{
				if(s.verOcupada())
				{
					if(s.getPedido().equals(" "))
					{
						System.out.println("A mesa ainda nao pediu nada");
						return;
					}
					else
					{
						int i;
				    	for(i=0; i<=99; i++)
						{
							
							if(pedidoarray[i].getPedido()==null)
							{
								pedidoarray[i].setIdMesa(s.getID());
								pedidoarray[i].setPedido(s.getPedido());
								pedidoarray[i].setStatus("Em andamento");
								pedidos.add(pedidoarray[i]);
								System.out.println("pedido em andamento");
								return;
								
							}
							
						}
					}
				}
				
			}
			
		}
		System.out.println("Nao tem ninguem nessa mesa");
		return;
	}
}