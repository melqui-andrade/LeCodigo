package testesDeUnidadeBusiness;

import static org.junit.Assert.*;

import org.junit.Test;

import com.br.uepb.business.JogadorBusiness;
import com.br.uepb.domain.Jogador;
import com.br.uepb.domain.TipoUsuario_Enum;

public class TestJogadorBusiness {

	@Test	
	public void testAssertRetornoCriaJogador() {
		JogadorBusiness jogadorBusiness = new JogadorBusiness();
		assertEquals("Criar Jogador retornou false", true,
				jogadorBusiness.cadastraJogador("Jogador Teste", "teste", "teste", TipoUsuario_Enum.ADMINISTRADOR));
		
	}
	@Test
	public void testAssertRecuperaJogador(){
		JogadorBusiness jogadorBusiness = new JogadorBusiness();
		Jogador jogador = jogadorBusiness.buscaJogador("teste");
		assertNotNull("Jogador é null", jogador);
		assertEquals("Nome errado", "JogadorTest", jogador.getNome());
	}

}
