package funcionarios;

import java.util.ArrayList;
import java.util.Scanner;

public class SG extends Funcionario
{

	public SG(String nm, String registro, double sal, String clas) {
		super(nm, registro, sal, clas);
		
	}



	public void addSG(SG sg[], ArrayList<Funcionario> funcionarios) {
		
		String test;
		int i;
    	for(i=0; i<=99; i++)
		{
			test=sg[i].getNome();
			if(test==null)
			{
				break;
			}
		}
		
		String nome, CPF;
		double salario = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o nome do sg");
		nome=input.nextLine();
		System.out.println("Insira o Registro do Garcom");
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
				System.out.println("Insira o Salaraio do Servicos gerais");
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

		sg[i]= new SG(nome, CPF, salario, "SG");
		funcionarios.add(sg[i]);
	}
	
	
	
	
}