package BatchTestingdemo;
import org.testng.annotations.*;
public class PaymentTest {

    @Test
    public void Cashondelivery(){
        System.out.println("Cash on delivery passed");
    }
    @Test
    public void Netbanking(){
        System.out.println("Net banking passed");
    }
}
