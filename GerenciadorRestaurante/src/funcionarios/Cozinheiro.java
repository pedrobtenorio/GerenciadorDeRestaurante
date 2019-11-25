package funcionarios;

import java.util.ArrayList;
import java.util.Scanner;


public class Cozinheiro extends Funcionario
{

	public Cozinheiro(String nm, String registro, double sal, String clas) {
		super(nm, registro, sal, clas);
		
	}

	@Override//Cozinheiro mudara o status do pedido para pronto e mudar para em andamento
	public void trabalhar() {
		
		
		
	}

	
	public void addCozinheiro(Cozinheiro cozinheiros[], ArrayList<Funcionario> funcionarios) {
		String test;
		int i;
    	for(i=0; i<=99; i++)
		{
			test=cozinheiros[i].getNome();
			if(test==null)
			{
				break;
			}
		}
		
		String nome, CPF;
		double salario=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o nome do Cozinheiro");
		nome=input.nextLine();
		System.out.println("Insira o Registro do cozinheiro");
		CPF=input.nextLine();
		for (Funcionario s : funcionarios ) {
			if(s.getID().equals(CPF))
			{
				System.out.println("ja existe um funcionario com esse registro, operacao cacelada!");
				return;
			}
			
		}
		boolean erro=true;
		do
		{
			try
			{
				System.out.println("Insira o Salaraio do Cozinheiro");
				salario=input.nextDouble();
				input.nextLine();
				while(salario<998)
				{
					System.out.println("Voce nao pode pagar menos que 998 Rs(salario minimo) para os seus funcionarios!! Insira um novo salario");
					salario=input.nextDouble();
					input.nextLine();
				}
				erro=false;
			}
			catch(Exception e)
			{
				System.out.println("voce precisa digitar um numero");
				 input.next();
			}
			
		}while(erro);
		
		
		cozinheiros[i]= new Cozinheiro(nome, CPF, salario, "Cozinheiro");
		funcionarios.add(cozinheiros[i]);

	}
					
}
	