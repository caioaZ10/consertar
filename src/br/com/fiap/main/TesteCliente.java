package br.com.fiap.main;

import br.com.fiap.modelo.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente objCliente = new Cliente();
		
		objCliente.setNome("Gustavo");
		objCliente.setIdade(20);
		objCliente.setPeso(70.5);
		
		System.out.println("Nome: " + objCliente.getNome() + "\n" + "Idade: " + 
		objCliente.getIdade() + "\n" + "Peso: " + objCliente.getPeso());
	}

}
