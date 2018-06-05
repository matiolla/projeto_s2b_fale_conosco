package testeSenacrs;

import static org.junit.Assert.assertEquals;

//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	WebDriver driver;

	@Before
	public void setUp() {
		// setando o caminho do gecko

		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		// instanciando o firefox
		driver = new FirefoxDriver();
		// informando qual arquivo que vai abrir
		driver.get("https://senacrs.com.br/contato_faleconosco.asp");
		// maximizando as telas
		driver.manage().window().maximize();
	}

	@Test
	public void teste() {

		WebElement j = driver.findElement(By.id("nome"));
		j.sendKeys("156987452");

		WebElement datanasc = driver.findElement(By.id("datanasc"));
		datanasc.sendKeys("09/10/1991");

		WebElement estado = driver.findElement(By.id("estado"));
		estado.sendKeys(Keys.ARROW_DOWN);
		estado.sendKeys(Keys.ARROW_DOWN);
		estado.sendKeys(Keys.ENTER);
		
		

		WebElement cidade = driver.findElement(By.id("cidade"));
		cidade.sendKeys(Keys.ARROW_DOWN);
		cidade.sendKeys(Keys.ARROW_DOWN);
		cidade.sendKeys(Keys.ARROW_DOWN);
		cidade.sendKeys(Keys.ENTER);
		
		
		/*Cria-se um objeto do tipo Select*/ 			
		 Select dropdown = new Select(driver.findElement(By.id("cidade")));
		/*Seleciona-se por texto*/ 			
				 dropdown.selectByVisibleText("PORTO ALEGRE");

		
		//verifica se selecionou o bairro
		WebElement bairro = driver.findElement(By.id("bairro"));		
		//assertEquals(true, bairro.isEnabled());

		
		

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Repita seu e-mail aquiasasasasas@gmail.com");

		WebElement confemail = driver.findElement(By.id("confemail"));
		confemail.sendKeys("asasasasas@gmail.com");

		WebElement ddd = driver.findElement(By.id("ddd"));
		ddd.sendKeys("00");

		WebElement telefone = driver.findElement(By.id("telefone"));
		telefone.sendKeys("54645645656");

		//WebElement feminino = driver.findElement(By.xpath("//*[@id=\"formfale\"]/div[1]/div[2]/div[1]"));
		//feminino.click();/html/body/div/div[9]/div[1]/div/div/div[2]/div/form/div[1]/div[2]/div[1]
				
				WebElement feminino = driver.findElement(By.xpath("/html/body/div/div[9]/div[1]/div/div/div[2]/div/form/div[1]/div[2]/div[1]"));
		feminino.click();

		//WebElement confirmarsenha = driver.findElement(By.xpath("//*[@id=\"formfale\"]/div[1]/div[2]/div[2]"));
		//confirmarsenha.sendKeys("54645645656");

		//WebElement assunto = driver.findElement(By.id("assunto"));
		//assunto.click();

		WebElement mensagem = driver.findElement(By.id("mensagem"));
		mensagem.sendKeys("sasasasasasasasasasa");

		WebElement cpf = driver.findElement(By.id("cpf"));
		cpf.sendKeys("54645645656");

		
		WebElement codigo = driver.findElement(By.xpath("//*[@id=\"formfale\"]/div[5]/div[2]/p[2]/input"));
		codigo.sendKeys("54645645656");
		
		
		assertEquals(true, bairro.isEnabled());
		WebElement enviar = driver.findElement(By.xpath("/html/body/div/div[9]/div[1]/div/div/div[2]/div/form/input[5]"));
		enviar.click();

		
		
	}
	
	
	// buscar mensagem de sucesso
	//String texto = driver.getPageSource();
	//assertEquals(true, texto.contains("salvo com sucesso"));

	
	//buscar se os campos foram limpo
	//WebElement enviarD = driver.findElement(By.id("email"));
	
	//assertEquals("", enviarD.getAttribute("value"));
	
	
	/*@Test
	public void test2() {
		
		String titulo = driver.getTitle();
		
		String url = driver.getCurrentUrl();
		
		assertEquals(true, url.contains("globo"));
		assertEquals(true, titulo.contains("formulario"));
		
		String texto = driver.getPageSource();
		assertEquals(true, texto.contains("salvo com sucesso"));
		
		
		
	}*/
	

	@After
	public void fecha() {
		// driver.quit();

	}

}
