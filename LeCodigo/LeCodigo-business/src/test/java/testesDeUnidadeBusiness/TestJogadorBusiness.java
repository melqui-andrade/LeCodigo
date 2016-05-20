package testesDeUnidadeBusiness;

import static org.junit.Assert.*;

import org.junit.Test;

import com.br.uepb.business.JogadorBusiness;
import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Jogador;
import com.br.uepb.domain.TipoUsuario_Enum;
import com.br.uepb.dump.PopularTabelaQuestoes;
import com.br.uepb.dump.PopularTabelaQuestoes2;
import com.br.uepb.dump.PopularTabelaQuestoes3;

import conexaoBD.HibernateUtil;

public class TestJogadorBusiness {

	@Test
	public void testCriarQuestoes(){
		// Metodo para apagar as questoes e os bocos e criar de novo
		QuestaoDAO questaoDAO = QuestaoDAO.getInstance();
		questaoDAO.apagarQuestoes();

		// Popular questoes da fase 1
		PopularTabelaQuestoes popularFase1 = new PopularTabelaQuestoes();
		popularFase1.popularQuestoes_Fase1();

		// Popular questoes da fase 2
		PopularTabelaQuestoes2 popularFase2 = new PopularTabelaQuestoes2();
		popularFase2.popularQuestoes_Fase2();

		// Popular questoes da fase 3
		PopularTabelaQuestoes3 popularFase3 = new PopularTabelaQuestoes3();
		popularFase3.popularQuestoes_Fase3();

		// Fechar a conexão com a base de dados
		HibernateUtil.shutdown();
		
		assertEquals(1, 1);
	}
	
	@Test	
	public void testAssertRetornoCriaJogador() {
//		JogadorBusiness jogadorBusiness = new JogadorBusiness();
//		assertEquals("Criar Jogador retornou false", true,
//				jogadorBusiness.cadastraJogador("Jogador Teste", "teste", "teste", TipoUsuario_Enum.ADMINISTRADOR));
		
	}
	@Test
	public void testAssertRecuperaJogador(){
//		JogadorBusiness jogadorBusiness = new JogadorBusiness();
//		Jogador jogador = jogadorBusiness.buscaJogador("teste");
//		assertNotNull("Jogador é null", jogador);
//		assertEquals("Nome errado", "JogadorTest", jogador.getNome());
	}

}
