package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	
	WebDriver driver;
	
	By usuario=By.xpath("//*[@id='signinField']");
	By senha=By.xpath("//*[@id='password']");
	By botao = By.id("signinButtonSend");
	
	public Login(WebDriver driver){
		this.driver=driver;
		
	}
	
	
	public void Usuario(){
		
		driver.findElement(usuario).sendKeys("gg1885566@gmail.com");
		
	}
	
	public void Senha(){
		
		driver.findElement(senha).sendKeys("Sucesso");
		
	}
	
    public void clicarbotaologin(){
		
		driver.findElement(botao).click();
		
	}
	
	
	
	

	
	
}
