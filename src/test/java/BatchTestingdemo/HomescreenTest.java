package BatchTestingdemo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class HomescreenTest {
    @Test
    public  void launchapplicattion(){
        System.out.println("Application launched passed");
    }

    @Test
    public  void Verifytitle(){
        System.out.println("Verify Title passed");
    }
    @Test
    public  void Verifylogo(){
        System.out.println("Verify logo passed");
    }
}
