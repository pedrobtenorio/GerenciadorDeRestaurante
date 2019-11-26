package preMadeMenus;

import java.util.Scanner;

public class menus
{
	Scanner input =new Scanner(System.in);
	
	public String menu0()
	{
		System.out.println("Escolha a opcao");
        System.out.println("(1) Gerenciar cardapio");
        System.out.println("(2) Gerenciar funcionarios");
        System.out.println("(3) Gerenciar estoque");
        System.out.println("(4) Gerenciar mesas");
        System.out.println("(5) Gerenciar caixa");
        System.out.println("(6) Verificar cozinha");
        System.out.println("(7) Despesas");
        System.out.println("(8) relatorios");
        System.out.println("(9) sair");
        String opc;
        opc=input.nextLine();
        return opc;
	}
	public String menu1()
	{
		System.out.println("Escolha a opcao");
        System.out.println("(1) Adicionar comida");
        System.out.println("(2) Adicionar bebida");
        System.out.println("(3) Remover Comida");
        System.out.println("(4) Remover bebida");
        System.out.println("(5) Modificar preco e descricao de comida");
        System.out.println("(6) Modificar preco e descricao de bebida");
        System.out.println("(7) Mostrar cardapio");
        System.out.println("(8) Sair");
 
        String opc;
        opc=input.nextLine();
        return opc;
	}

	public String menu2()
	{
		System.out.println("Escolha a opcao");
        System.out.println("(1) Contratar Cozinheiro");
        System.out.println("(2) Contratar Garcom");
        System.out.println("(3) Contratar Servicos gerais");
        System.out.println("(4) Demitir funcionarios");
        System.out.println("(5) Mudar salario de um trabalhador");
        System.out.println("(6) sair");
        String opc;
        opc=input.nextLine();
        return opc;
	}
	public String menu3()
	{
		System.out.println("Escolha a opcao");
        System.out.println("(1) Comparar materiais");
        System.out.println("(2) Mostrar o estoque");
        System.out.println("(3) sair");

        String opc;
        opc=input.nextLine();
        return opc;
	}
	public String menu4()
	{
		System.out.println("Escolha a opcao");
        System.out.println("(1) Colocar mesa");
        System.out.println("(2) Tirar mesa");
        System.out.println("(3) Anotar pedido");
        System.out.println("(4) Colocar clientes na mesa");
        System.out.println("(5) Servir pratos");
        System.out.println("(6) limpar mesa");
        System.out.println("(7) Sair");
  
        String opc;
        opc=input.nextLine();
        return opc;
	}
	public String menu5()
	{
		System.out.println("Escolha a opcao");
        System.out.println("(1) Ver dinheiro do caixa");
        System.out.println("(2) Fechar conta");
        System.out.println("(3) Sair");
        String opc;
        opc=input.nextLine();
        return opc;
	}
	public String menu6()
	{
		System.out.println("Escolha a opcao");
        System.out.println("(1) Colocar pedido em andamento");
        System.out.println("(2) Mudar o status dos pedidos para pronto");
        System.out.println("(3) sair");
        String opc;
        opc=input.nextLine();
        return opc;
	}
	public String menu7()
	{
		System.out.println("Escolha a opcao");
        System.out.println("(1) Pagar luz e agua");
        System.out.println("(2) Pagar Funcionarios");
        System.out.println("(3) sair");
        String opc;
        opc=input.nextLine();
        return opc;
	}
	public String menu8()
	{
		System.out.println("Escolha a opcao");
        System.out.println("(1) Mostrar cardapio");
        System.out.println("(2) Mostrar funcionarios");
        System.out.println("(3) Mostrar mesas");
        System.out.println("(4) Mostrar caixa");
        System.out.println("(5) sair");
        String opc;
        opc=input.nextLine();
        return opc;
	}
	
	
	
	
}