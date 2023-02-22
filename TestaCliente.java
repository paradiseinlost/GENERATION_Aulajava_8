package Aulajava8;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciando um objeto da classe Cliente
		
Cliente cliente1 = new Cliente ("Laura Bennington","01/12/1990","45667789120","998776655","LB@gmail.com","Rua Logoali");

cliente1.visualizar();
System.out.println("\n\n\n");

System.out.println("\nAlterar email: ");
cliente1.setEmail("LauraB@gmail.com");
cliente1.visualizar();
System.out.println("\n\n\n");

System.out.println("\nAlterar telefone : ");
cliente1.setTelefone("967849091");
cliente1.visualizar();		
		
	}

}
