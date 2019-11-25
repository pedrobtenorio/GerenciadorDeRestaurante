
import java.util.ArrayList;
import java.util.Scanner;

import funcionarios.*;
import preMadeMenus.menus;

public class Gerenciador{

   
    static Scanner input = new Scanner(System.in);
    
    static double dinheiro =10000f;


    public static void main(String args[])
    {
    	double luz, agua, pagar=0;
    	String opt = "0";
        String login ="adm";
        String senha="12345";
        String loginDigitado, senhaDigitada;
        String nome;
        String slogan;
        String endereco;
        ArrayList<Cardapio> cardapio = new ArrayList<Cardapio>();
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        ArrayList<Mesas> mesa = new ArrayList<Mesas>();
        ArrayList<cozinha> pedidos= new ArrayList<cozinha>();
        Mesas gerenciadorMesa= new Mesas(null, " ", true, true, 0, true);
        cozinha gerenciadorCozinha= new cozinha(null,null,null);
        Mesas mesasdobar[]=new Mesas[100];
        Cozinheiro cozinheiros[]=new Cozinheiro[100];
        Garcom garcom[]=new Garcom[100];
        SG sg[]=new SG[100];
        cozinha pedidoarray[] = new cozinha[100]; 
        int  i;     
        Bebidas bebida1[]=new Bebidas[100];
        Comida comida1[]=new Comida[100];
        for(i=0; i<=99; i++)
        {
        	
        	bebida1[i]=new Bebidas();
            comida1[i]=new Comida();
            cozinheiros[i]=new Cozinheiro(null, null, 0, null);
            garcom[i]=new Garcom(null, null, 0, null);
            sg[i]=new SG(null, null, 0, null);
            mesasdobar[i]= new Mesas(null, " ", true, true, 0, true);
            pedidoarray[i]=new cozinha(null, null, null);
            
        }
        boolean loginsucesso=false;
        System.out.println("Bem vindo a pagina de administracao de restaurantes");
        while(loginsucesso==false)
        {
        	System.out.println("digite seu usuario");
        	loginDigitado=input.nextLine();
            System.out.println("digite sua senha");
            senhaDigitada=input.nextLine();
            if(senha.equals(senhaDigitada)&& login.equals(loginDigitado))
            {
            	loginsucesso=true;
            }
            else
            {
            	System.out.println("usuario ou senha incorretos");
            }
            
        }
        if(loginsucesso)
        {
        	  System.out.println("Crie seu restaurante!");
	          System.out.println("insira um nome");
	          nome=input.nextLine();
	          System.out.println("insira um slogan");
	          slogan=input.nextLine();
	          System.out.println("insira um endereco");
	          endereco=input.nextLine();	
	          Restaurante principal = new Restaurante(nome, slogan, endereco);
	          principal.PrintarRestaurante();
	         menus meusmenus=new menus();
	        while(!opt.equals("9"))
	        {
	        	opt=meusmenus.menu0();
	        	
		        		        
	        	if(opt.equals("1"))
	        	{
	        		opt=meusmenus.menu1();
	        		
	        		if(opt.equals("1"))
	        		{
	        			principal.addComida(comida1, cardapio);
	        		}
	        		else if(opt.equals("2"))
	        		{
	        			principal.addBebida(bebida1, cardapio);
	        		}
	        		else if(opt.equals("3"))
	        		{
	        			principal.removeComida(comida1, cardapio);
	        		}
	        		
	        		else if(opt.equals("4"))
	        		{
	        			principal.removeBebida(bebida1, cardapio);
	        		}
	        		else if(opt.equals("5"))
	        		{
	        			principal.modComida(comida1, cardapio);
	        		}
	        		else if(opt.equals("6"))
	        		{
	        			principal.modBebida(bebida1, cardapio);
	        		}
	        		else if(opt.equals("7"))
	        		{
	        			System.out.println(cardapio);
	        		}
	        		else if(opt.equals("8"))
	        		{
	        			System.out.println("\n\n\n Voltando para menu anterio \n\n\n");
	        		}
	        		else
	        		{
	        			System.out.println("opcao incorreta");
	        		}
	        		
	        		
	        		
	        	}
	        	else if(opt.equals("2"))
	        	{
	        		opt=meusmenus.menu2();
	        		
	        		if(opt.equals("1"))
	        		{
	        			cozinheiros[0].addCozinheiro(cozinheiros, funcionarios);
	        		}
	        		else if(opt.equals("2"))
	        		{
	        			garcom[0].addGarcom(garcom, funcionarios);
	        		}
	        		else if(opt.equals("3"))
	        		{
	        			sg[0].addSG(sg, funcionarios);
	        		}
	        		else if(opt.equals("4"))
	        		{
	        			sg[0].demitirFuncionario(funcionarios);
	        		}
	        		else if(opt.equals("5"))
	        		{
	        			sg[0].mudarSalario(funcionarios);
	        		}
	        		else if(opt.equals("6"))
	        		{
	        			System.out.println("\n\n\n Voltando para menu anterio \n\n\n");
	        		}
	        		else
	        		{
	        			System.out.println("opcao incorreta");
	        		}
	        	}
	        	else if(opt.equals("3"))
	        	{
	        		opt=meusmenus.menu3();
	        	}
	        	else if(opt.equals("4"))
	        	{
	        		opt=meusmenus.menu4();
	        		if(opt.equals("1"))
	        		{
	        			gerenciadorMesa.criarMesa(mesasdobar, mesa);
	        		}
	        		else if(opt.equals("2"))
	        		{
	        			gerenciadorMesa.removerMesa(mesa);
	        		}
	        		else if(opt.equals("3"))
	        		{
	        			gerenciadorMesa.anotarPedido(mesa, cardapio);
	        		}
	        		else if(opt.equals("4"))
	        		{
	        			gerenciadorMesa.ocuparMesa(mesa);
	        		}
	        		else if(opt.equals("5"))
	        		{
	        			 gerenciadorMesa.entregarPedido(pedidos, funcionarios, mesa);
	        		}
	        		else if(opt.equals("6"))
	        		{
	        			 System.out.println("\n\n\n Voltando para menu anterio \n\n\n");
	        		}	        	
	        		else
	        		{
	        			System.out.println("opcao incorreta");
	        		}
	        	}
	        	else if(opt.equals("5"))
	        	{
	        		opt=meusmenus.menu5();
	        		{
	        			if(opt.equals("1"))
	        			{
	        				System.out.println("Dinheiro no caixa: "+ Double.toString(dinheiro)+"\n" );
	        			}
	        			else if(opt.equals("2"))
	        			{
	        				dinheiro=gerenciadorMesa.fecharMesa(mesa, dinheiro);
	        			}
	        			else if(opt.equals("3"))
	        			{
	        				System.out.println("\n\n\n Voltando para menu anterio \n\n\n");
	        			}
	        			else
	        			{
	        				System.out.println("opcao incorreta");
	        			}
	        		}
	        	}
	        	else if(opt.equals("6"))
	        	{
	        		opt=meusmenus.menu6();
	        		if(opt.equals("1"))
	        		{
	        			gerenciadorCozinha.colocarEmAndamento(mesa, pedidos, pedidoarray);
	        		}
	        		else if(opt.equals("2"))
	        		{
	        			gerenciadorCozinha.mudarParaPronto(pedidos, funcionarios);
	        		}
	        		else if(opt.equals("3"))
	        		{
	        			System.out.println("\n\n\n Voltando para menu anterio \n\n\n");
	        		}
	        		else
	        		{
	        			System.out.println("opcao incorreta");
	        		}
	        	}
	        	else if(opt.equals("7"))
	        	{
	        		opt=meusmenus.menu7();
	        		if(opt.equals("1"))
	        		{
	        			System.out.println("digite o preco da conta de luz");
	        			luz=input.nextDouble();
	        			input.nextLine();
	        			if(luz>dinheiro)
	        			{
	        				System.out.println("voce nao tem dinheiro para pagar a conta");
	        			}
	        			if(luz<0)
	        			{
	        				System.out.println("o valor inserido é invalido");
	        			}
	        			else 
	        			{
	        				dinheiro=dinheiro-luz;
	        			}        			
	        			System.out.println("digite o preco da conta de agua");
	        			agua=input.nextDouble();
	        			if(agua>dinheiro)
	        			{
	        				System.out.println("voce nao tem dinheiro para pagar a conta");
	        			}
	        			if(agua<0)
	        			{
	        				System.out.println("o valor inserido é invalido");
	        			}
	        			else 
	        			{
	        				dinheiro=dinheiro-agua;
	        			} 
	        			luz=0;
	        			agua=0;
	        		}
	        		else if(opt.equals("2"))
	        		{
	        			for (Funcionario s : funcionarios )
	        			{
	        				System.out.println(s);
	        			}
	        		}
	        	}
	        	else if(opt.equals("8"))
	        	{
	        		opt=meusmenus.menu8();
	        		if(opt.equals("1"))
	        		{
	        			System.out.println(cardapio);
	        		}
	        		else if(opt.equals("2"))
	        		{
	        			for (Funcionario s : funcionarios )
	        			{
	        				pagar=s.getSalaraio();
	        				if(pagar>dinheiro)
		        			{
		        				System.out.println("voce nao tem dinheiro para pagar o funcionario");
		        			}
		        			else
		        			{
		        				dinheiro=dinheiro-pagar;
		        			}
	        			}
	        				        			
	        		}
	        		
	        	}
	        	else if(opt.equals("9"))
	        	{
	        		System.out.println("\n\n\n Voltando para menu anterio \n\n\n");
	        	}
	        	else
	        	{
	        		System.out.println("O numero que voce escolheu eh invalido");
	        		continue;
	        	}
	        	     	        	
	        }
        }
              
    }
      
}