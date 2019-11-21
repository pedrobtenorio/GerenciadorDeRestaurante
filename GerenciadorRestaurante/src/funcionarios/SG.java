package funcionarios;

import java.util.ArrayList;
import java.util.Scanner;

public class SG extends Funcionario
{

	public SG(String nm, String registro, double sal, String clas) {
		super(nm, registro, sal, clas);
		
	}

	@Override//Serviços gerais ira limpar as mesas
	public void trabalhar() {
		
		
		
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
		double salario;
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
		System.out.println("Insira o Salaraio do Garcom");
		salario=input.nextDouble();
		input.nextLine();
		while(salario<998)
		{
			System.out.println("Voce nao pode pagar menos que 998 Rs(salario minimo) para os seus funcionarios!! Insira um novo salario");
			salario=input.nextDouble();
			input.nextLine();
		}

		sg[i]= new SG(nome, CPF, salario, "Servicos gerais");
		funcionarios.add(sg[i]);
	}
	
	
	
	
}