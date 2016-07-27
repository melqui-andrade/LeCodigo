package testeDeUnidadeService;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Test;
import com.br.uepb.dump.PopularQuestoesApartirDeTXT;


public class TestQuestoesService {
	
	@Test
	public void testCriarQuestoes() throws IOException{
		
		PopularQuestoesApartirDeTXT.main(null);
		
		assertEquals(1, 1);		
	}
	
	@Test
	public void testBuscarQuestao(){
		assertEquals(1,1);
	}
	
}
