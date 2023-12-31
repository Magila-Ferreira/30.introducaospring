package fatec.introducaospring;

import java.rmi.server.UID;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fatec.introducaospring.models.Cliente;

@SpringBootApplication
public class IntroducaospringApplication {
	// Cria uma lista de clientes
	public static List<Cliente> listaClientes;

	public static void main(String[] args) {
	
	listaClientes = new ArrayList<Cliente>();
	// Cria um objeto cliente
	Cliente c = new Cliente();
	
	c.setId(new UID());
	c.setNome("João");
	c.setNascimento(LocalDateTime.of(1985, 5, 30, 0, 0, 0, 0));
	listaClientes.add(c);	

	c = new Cliente();
	c.setId(new UID());
	c.setNome("Maria");
	c.setNascimento(LocalDateTime.of(1996, 3, 18, 0, 0, 0, 0));
	listaClientes.add(c);

	SpringApplication.run(IntroducaospringApplication.class, args);
	}

}
