
package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Valida_Pesquisa {

	
	public void executar() throws InterruptedException {
		

				
		//Conexao com o tipo driver browser 
	 //System.setProperty("webdriver.chrome.driver", "C://Users//ITALY SOFTWARE//Documents//Desenvolvimento//chromedriver.exe");
      // WebDriver driver = new ChromeDriver();          
		
       
     WebDriver driver = new FirefoxDriver();
		 	
     
        driver.manage().window().maximize();
        driver.get("http://www.walmart.com/");
		
        @SuppressWarnings("unused")
		WebDriverWait wait = new WebDriverWait(driver, 50);
        
        driver.findElement(By.id("suggestion-search")).click();
        driver.findElement(By.id("suggestion-search")).sendKeys("tv");
        
        //Validar que a busca da tv obteve resultado
        driver.findElement(By.cssSelector("button.search-icon")).click();

        
      Thread.sleep(1000);      
        //Clica no item TV - //Validar que a busca da tv obteve resultado
       WebElement itemBusca = driver.findElement(By.xpath("//*[@id='category-products']/section/ul/li[1]/figure/a/img"));
        
      if (itemBusca.isDisplayed()){	
    	   driver.findElement(By.xpath("//*[@id='category-products']/section/ul/li[1]/figure/a/img")).click();
    	    	   
        }else{      	
        	System.out.println("Elemento não encontrado");
        }
        
        
        
       
        //Clica para adicionar ao carrinho
        driver.findElement(By.xpath("//*[@id='buybox-Walmart']/div[2]/div/div[5]/button")).click();
        
       Thread.sleep(5000);
        //Clica no botao para ir ao carrinho
        driver.findElement(By.id("navegaCarrinho")).click();
        
        
          
        //Clica no carrinho para abrir //Validar que a busca da tv obteve resultado  
        driver.findElement(By.xpath("//*[@id='site-topbar']/div[2]/div[1]/a/span[2]")).click();
        
        Thread.sleep(5000); 
        
         WebElement  itemCarrinho = driver.findElement(By.xpath("//*[@id='main']/div/section/div/article/ul/li/ul/li[2]/div/div[1]/a"));      
      if (itemCarrinho.isDisplayed()){  	   	
    	   driver.findElement(By.id("btn-finalize-cart")).click();  	
    	
    }else{
    	
    	System.out.println("Elemento não encontrado no carrinho");
    }

    
      //IDENTIFICA MODALLOGIN
    driver.switchTo().frame("iframeLogin");
    
    // BUSCA OS DADOS PARA LOGIN
    Login login=new Login(driver);
    login.Usuario();
    login.Senha();
    login.clicarbotaologin();
    
    
       
    System.out.println("Teste finalizado com sucesso");
		
	}	
		
		
		
}
