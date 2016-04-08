import java.util.ArrayList;
import java.util.List;
import com.br.uepb.dao.QuestaoDAO;
import com.br.uepb.domain.Bloco;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.TipoQuestao_Enum;

public class PopularTabelaQuestoes {
	public static void main(String[] args) {

		QuestaoDAO dao = new QuestaoDAO();

		Questao questao = new Questao(
				"Como deve-se verificar se um número qualquer é par ou impar? Organize blocos para estabelecer a ordem que considerar correta.",
				"1-6-3-4", 1, TipoQuestao_Enum.IF_ELSE, null); 

		List<Bloco> blocos = new ArrayList<>();

		blocos.add(new Bloco(questao.getId(), "1-int numero; String resposta;"));
		blocos.add(new Bloco(questao.getId(), "2-if(numero){"));
		blocos.add(new Bloco(questao.getId(), "3-resposta = “O número é par”;}"));
		blocos.add(new Bloco(questao.getId(), "4-else{ resposta = “O número é impar”;}"));
		blocos.add(new Bloco(questao.getId(), "5-if(numero%3==0){"));
		blocos.add(new Bloco(questao.getId(), "6-if(numero%2==0){"));

		questao.setBlocos(blocos);

		dao.adicionarQuestao(questao);
	}
}