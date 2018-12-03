// Nuestro selenium de siempre
import org.openqa.selenium.WebDriver;
// Este seria la libreria para las teclas especiales en sikuli
import org.sikuli.hotkey.Keys;
// Esta clase es la que utilizamos para arrojar la excepcion si no encuentra un elemento 
import org.sikuli.script.FindFailed;
// Esta clase es para crear el patron o el elemento que va a buscar
import org.sikuli.script.Pattern;
// Esta clase la utilizamos para crear un robot que controle la pantalla
import org.sikuli.script.Screen;
// Nuestro driver de siempre
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.Robot;

public class SikuliDemo {

    public static void main(String[] args) throws FindFailed {
    	
    	//Colocamos el driver
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        
        String filepath = "C:\\Users\\SBMEDADMIN\\eclipse-workspace\\MiPrimerSikuliSinGradle\\imagenes\\";
        
        Screen screen = new Screen();
        
        Pattern googleSearchBar = new Pattern(filepath + "GoogleSearchBar.PNG");
        //Pattern googleSearchButton = new Pattern(filepath + "GoogleSearchButton.PNG");
        WebDriver driver;

        // Abrir el navegador    
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        
        
        // magia *-*
        screen.wait(googleSearchBar, 20);
        //s.click(googleSearchBar);
        screen.type(googleSearchBar, "The end is near"+Keys.ENTER);
        //s.type(googleSearchBar, "The end is near" + Keys.ESC);
        //s.click(googleSearchButton);

        // Cerrar el navegador
        //driver.close();

    }

}