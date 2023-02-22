package Aulajava8;

public class Cliente {

	//declaração de atributos de classe
	
	private String nomeCliente;
	private String nascimento;
	private String cpfCliente;
	private String telefone;
	private String email;
	private String endereco;
	
	
	public Cliente(String nomeCliente, String nascimento, String cpfCliente, String telefone, String email,String endereco) {
		super();
		
		this.nomeCliente = nomeCliente;
		this.nascimento = nascimento;
		this.cpfCliente = cpfCliente;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}
	
	public Cliente () {		
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void visualizar () {
		System.out.println("\nNome do Cliente : "+nomeCliente);
		System.out.println("\nData de nascimento : "+nascimento);
		System.out.println("\nCPF do cliente : "+cpfCliente);
		System.out.println("\nTelefone do Cliente : "+telefone);
		System.out.println("\nEmail do cliente : "+email);
		System.out.println("\nEndereço do cliente : "+endereco);
		}
	
	
	
}
