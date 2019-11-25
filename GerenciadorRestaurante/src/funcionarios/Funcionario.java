package funcionarios;
import java.util.ArrayList;
import java.util.Scanner;


public abstract class Funcionario
{
	private String nome, CPF, classe;
	private double salario;
	static Scanner input = new Scanner(System.in);
	
	public Funcionario(String nm, String registro, double sal, String clas)
	{
		this.nome=nm;
		this.CPF=registro;
		this.salario=sal;
		this.classe=clas;
	}
	
	public void setNome(String nome)
	{
		this.nome=nome;
	}
	
	public abstract void trabalhar();
	
	public void demitirFuncionario(ArrayList<Funcionario> funcionarios)
	{
		String id;
		System.out.println("digite a identificacao do funcionario");
		id=input.nextLine();	
		for (Funcionario s : funcionarios ) {
			if(s.getID().equals(id))
			{
				
				s.setNome(null);
				funcionarios.remove(s);
				System.out.println("Funcionario demitido");
				return;
			}
		}
		System.out.println("Nao foi encontrado funcionario com essa identificacao");
		return;
	}

	
	public void mudarSalario(ArrayList<Funcionario> funcionarios)
	{
		
		String id;
		System.out.println("digite a identificacao do funcionario");
		id=input.nextLine();	
		for (Funcionario s : funcionarios ) {
			if(s.getID().equals(id))
			{
				System.out.println("digite o novo salario para o funcionario");
				s.salario=input.nextDouble();
				input.nextLine();
				while(salario<998)
				{
					System.out.println("Voce nao pode pagar menos que 998 Rs(salario minimo) para os seus funcionarios!! Insira um novo salario");
					salario=input.nextDouble();
					input.nextLine();
				}
				return;
			}
			
		}
		System.out.println("Nao foi encontrado funcionario com essa identificacao");
		return;
	}
	
	public String getID() {
		return this.CPF;
	}
	public String getNome() {
		
		return this.nome;
	}
	public String getClasse() {
		
		return this.classe;
	}
	public double getSalaraio() {
		return this.salario;
	}
	
	@Override
    public String toString() {
        String info;
        info="\n"+ nome +"\n"+"identificacao: "+CPF+"\nSalario: "+Double.toString(salario)+"R$"+"\n"+"Funcao: "+classe+"\n";
        return info;
    }
}