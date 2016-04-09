import java.util.ArrayList;

import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Questao;

public class TesteQuestoes {

	public static void main(String[] args) {
		QuestaoDAO dao = new QuestaoDAO();
		
		ArrayList<Questao> list = (ArrayList<Questao>) dao.listarQuestoes(1);
		
		for (Questao questao : list) {
			System.out.println(questao.getDescricao());
		}		
	}	
}