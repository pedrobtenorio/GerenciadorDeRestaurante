package gerenciador;

import java.util.ArrayList;
import java.util.Scanner;



public class Restaurante
    {
        private String nome;
        private String slogan;
        private String endereco;
        static Scanner input = new Scanner(System.in);

        public Restaurante(String nome, String slogan, String endereco )
        {
            this.nome=nome;
            this.slogan=slogan;
            this.endereco=endereco;
        }

        public void PrintarRestaurante()
        {
            System.out.format("%n%nBem vindo ao restaurante %s%n%s%nnos estamos na %s%n", this.nome, this.slogan, this.endereco);
        }
        
        public void addComida(Comida[] comida1, ArrayList<Cardapio> cardapio )
        {
        	 String nomeprato, descricao, test;
             double preco, pesoOuVolume;
        	int i;
    		for(i=0; i<=99; i++)
    		{
    			test=comida1[i].getnomeDoPrato();
    			if(test==null)
    			{
    				
    				break;
    			}
    		}
    		System.out.println("insira o nome do prato");
    		nomeprato=input.nextLine();
    		comida1[i].setnomeDoPrato(nomeprato);
    		System.out.println("insira a descricao do prato");
    		descricao=input.nextLine();
    		comida1[i].setDescricao(descricao);
    		
    		boolean erro=true;
    		do {
    			try
    			{
    				System.out.println("insira o preco");
    				preco=input.nextDouble();
    	    		input.nextLine();
    	    		comida1[i].setPreco(preco);
    	    		System.out.println("insira o peso");
    	    		pesoOuVolume=input.nextDouble();
    	    		input.nextLine();
    	    		comida1[i].setPeso(pesoOuVolume);
    	    		erro=false;
    			}
    			catch(Exception e)
    			{
    				System.out.println("voce precisa digitar um numero");
    				 input.next();
    			}
    			
    		}while(erro);
    		
    		cardapio.add(comida1[i]);
        }
        public void removeComida(Comida[] comida1, ArrayList<Cardapio> cardapio )
        {
        	String  test;
        	System.out.println("insira o nome da comida que você deseja remover");
        	test=input.nextLine();
        	int i;
        	for(i=0; i<=99; i++)
    		{
    			if(test.equals(comida1[i].getnomeDoPrato()))
    			{
    				comida1[i].setnomeDoPrato(null);
    				cardapio.remove(comida1[i]);
    				System.out.println("comida removida!");
    				return;
    			}
    		}
        	
        	System.out.println("essa comida nao foi achada no cardapio.");
        	
        	return;
        }
        
        
        public void modComida(Comida[] comida1, ArrayList<Cardapio> cardapio )
        {
        	String descricao, test;
            double preco;
        	int i;
        	System.out.println("insira o nome da comida que voce deseja editar");
        	test=input.nextLine();
        	for(i=0; i<=99; i++)
    		{
    			if(test.equals(comida1[i].getnomeDoPrato()))
    			{
    				System.out.println("insira a nova descricao");
    				descricao=input.nextLine();
    	    		comida1[i].setDescricao(descricao);
    	    		boolean erro=true;
    	    		do {
    	    			try
    	    			{
    	    				System.out.println("insira o novo preco");
    	    				preco=input.nextDouble();
    	    	    		input.nextLine();
    	    	    		comida1[i].setPreco(preco);
    	    	    		erro=false;
    	    			}
    	    			catch(Exception e)
    	    			{
    	    				System.out.println("voce precisa digitar um numero");
    	    				 input.next();
    	    			}
    	    			
    	    		}while(erro);
    				return;
    			}
    		}
        
        	System.out.println("essa comida nao foi achada no cardapio.");
        	return;
        	
        }
        
        
        public void addBebida(Bebidas[] bebida1, ArrayList<Cardapio> cardapio )
        {
        	String nomeprato, descricao, test;
            double preco, pesoOuVolume;
        	int i;
        	for(i=0; i<=99; i++)
    		{
    			test=bebida1[i].getnomeDoPrato();
    			if(test==null)
    			{
    				break;
    			}
    		}
    		System.out.println("insira o nome da bebida");
    		nomeprato=input.nextLine();
    		bebida1[i].setnomeDoPrato(nomeprato);
    		System.out.println("insira a descrição da bebida");
    		descricao=input.nextLine();
    		bebida1[i].setDescricao(descricao);
    		boolean erro=true;
    		do {
    			try
    			{
    				System.out.println("insira o preco");
    				preco=input.nextDouble();
    	    		input.nextLine();
    	    		bebida1[i].setPreco(preco);
    	    		System.out.println("insira o peso");
    	    		pesoOuVolume=input.nextDouble();
    	    		input.nextLine();
    	    		bebida1[i].setVolume(pesoOuVolume);
    	    		erro=false;
    			}
    			catch(Exception e)
    			{
    				System.out.println("voce precisa digitar um numero");
    				 input.next();
    			}
    			
    		}while(erro);
    		cardapio.add(bebida1[i]);
        }
        
        public void removeBebida(Bebidas[] bebida1, ArrayList<Cardapio> cardapio )
        {
        	String  test;
        	System.out.println("insira o nome da bebida que você deseja remover");
        	test=input.nextLine();
        	int i;
        	for(i=0; i<=99; i++)
    		{
    			if(test.equals(bebida1[i].getnomeDoPrato()))
    			{
    				bebida1[i].setnomeDoPrato(null);
    				cardapio.remove(bebida1[i]);
    				System.out.println("Bebida removida!");
    				return;
    			}
    		}
        	
        	System.out.println("bebida nao foi achada no cardapio.");
        	
        	return;
        }
        
        public void modBebida(Bebidas[] bebida1, ArrayList<Cardapio> cardapio )
        {
        	String descricao, test;
            double preco;
        	int i;
        	System.out.println("insira o nome da bebida que voce deseja editar");
        	test=input.nextLine();
        	for(i=0; i<=99; i++)
    		{
    			if(test.equals(bebida1[i].getnomeDoPrato()))
    			{
    				System.out.println("insira a nova descrição");
    				descricao=input.nextLine();
    	    		bebida1[i].setDescricao(descricao);
    	    		boolean erro=true;
    	    		do {
    	    			try
    	    			{
    	    				System.out.println("insira o novo preco");
    	    				preco=input.nextDouble();
    	    	    		input.nextLine();
    	    	    		bebida1[i].setPreco(preco);
    	    	    		erro=false;
    	    			}
    	    			catch(Exception e)
    	    			{
    	    				System.out.println("voce precisa digitar um numero");
    	    				 input.next();
    	    			}
    	    			
    	    		}while(erro);
    				return;
    			}
    		}
        
        	System.out.println("essa bebida nao foi achada no cardapio.");
        	return;
        	
        }
        
       
    }