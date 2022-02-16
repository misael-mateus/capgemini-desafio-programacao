import br.com.proway.capgemini.Desafio;
import org.testng.annotations.Test;

public class DesafioTest {

    Desafio desafio = new Desafio();

    @Test
    public void devePrintarNEstrelas(){
        desafio.questaoUm(6);
    }

    @Test
    public void devePrintarSenhaForte(){
        desafio.questaoDois("Teste@123");
    }

    @Test
    public void devePrintarSenhaFraca(){
        desafio.questaoDois("Teste123");
    }

    @Test
    public void devePrintarQuatidadeFaltanteDeCharacteres(){
        desafio.questaoDois("Test");
    }

    @Test
    public void devePrintarQuantidadeDeAnagramas(){
        desafio.questaoTres("ifailuhkqq");
    }

}
