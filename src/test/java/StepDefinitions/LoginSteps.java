package StepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginSteps {
    private WebDriver driver;

    @Dado("^que eu estou na pagina inicial$")
    public void QueEuEstouNaPaginaInicial() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.toroinvestimentos.com.br/");

    }

    @Quando("^eu clico em fazer login digitando dados invalidos$")
    public void EuClicoEmFazerLoginDigitandoDadosInvalidos() {
        driver.get("https://app.toroinvestimentos.com.br/entrar");
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.toroinvestimentos.com.br/entrar");

                WebElement input = new WebDriverWait(driver, Duration.ofSeconds(10))
                        .until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
                input.click();


                WebElement digitaEmail = new WebDriverWait(driver, Duration.ofSeconds(100))
                        .until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
                digitaEmail.sendKeys("email@errado.com");

                WebElement senha = new WebDriverWait(driver, Duration.ofSeconds(100))
                        .until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
                senha.click();

                WebElement digitaSenha = new WebDriverWait(driver, Duration.ofSeconds(100))
                        .until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
                digitaSenha.sendKeys("senhaerrada");


            }


            @Então("^aparece uma mensagem de dados incorretos$")
            public void ApareceUmaMensagemDeDadosIncorretos() {

                WebElement mensagemErro = new WebDriverWait(driver, Duration.ofSeconds(100))
                        .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn--md btn--full btn--solid btn-primary--solid']")));
                mensagemErro.click();

                WebElement mensagemErroTexto = new WebDriverWait(driver, Duration.ofSeconds(100))
                        .until(ExpectedConditions.visibilityOfElementLocated(By.className("form-error-message")));
                String mensagemAtual = mensagemErroTexto.getText();
                String mensagemEsperada = "Dados incorretos. Digite novamente.";
                Assertions.assertEquals(mensagemEsperada, mensagemAtual);
                driver.close();

            }

        }
