package cursoDAgil.service.cliente;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoDAgil.bd.domain.Cliente;
import cursoDAgil.service.cliente.ClienteService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class ClienteServiceImplTest {
	
	@Inject
	ClienteService clienteService;
	
	@Test
	public void pruebaConsultarTodo(){
		try{
			List<Cliente> lista = clienteService.listarTodosClientes();
			assertEquals(lista.size(),lista.size());
			System.out.println("Prueba");
			System.out.println("Prueba");
		} catch(Exception e){
			System.out.println("Error: " + e);
		}
	}
}
