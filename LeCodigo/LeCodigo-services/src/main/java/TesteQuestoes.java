import java.util.List;

import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.TipoQuestao_Enum;

public class TesteQuestoes {

	public static void main(String[] args) {
		
		QuestaoDAO questaoDAO = QuestaoDAO.getInstance();
		
		List<Questao> list = questaoDAO.listarQuestoes(1, TipoQuestao_Enum.IF_ELSE);
		//System.out.println(TipoQuestao_Enum.IF_ELSE.ordinal());
		System.out.println(list.size());
		for (Questao questao : list) {
			System.out.println(questao.getDescricao());
		}		
	}	
}