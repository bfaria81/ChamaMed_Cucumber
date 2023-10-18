import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

//@SpringBootTest
//@CucumberOptions(
//        feature = "/Users/brunofaria/Desktop/Pasta Sem Título/Chamadas/src/test/resources/features",
//        glue = "ChamadasLeitos/chamadas/ChamadasApplication.java"
//)


public class TesteLogin {

    private WebDriver driver;


    @Dado("que estou na tela de login")
    public void queEstouNaTelaDeLogin() {
        driver = new SafariDriver();
       System.setProperty("webdriver.safari.driver", "/System/Cryptexes/App/usr/bin/safaridriver");


        driver.get("http://localhost:8080/");
        driver.manage().window().maximize();
    }



    @E("digito no campo matrícula o número {string}")
    public void digitoNoCampoMatrículaONúmero(String arg0) {
    }

    @E("digito no campo senha a senha {string}")
    public void digitoNoCampoSenhaASenha(String arg0) {
    }

    @Quando("clico no botão login")
    public void clicoNoBotãoLogin() {
    }

    @Então("eu entro na aplicação")
    public void euEntroNaAplicação() {
    }

    @E("digito no campo matrícula o nome {string}")
    public void digitoNoCampoMatrículaONome(String arg0) {
    }

    @Então("a mensagem erro é exibida")
    public void aMensagemErroÉExibida() {
    }
}
