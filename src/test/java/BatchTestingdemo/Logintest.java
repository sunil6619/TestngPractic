package BatchTestingdemo;
import org.testng.annotations.*;
public class Logintest {
@Test
    public void Loginbymobilenumber(){
        System.out.println("Login by mobile number passed");
    }
    @Test
    public void Loginbyemail(){
        System.out.println("Login by email  passed");
    }

}
