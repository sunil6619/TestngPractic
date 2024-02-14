package BatchTestingdemo;
import org.testng.annotations.*;
public class ProductpageTest {

    @Test
    public void Addproducttowishlist(){
        System.out.println("Add product to wishlist passed");
    }
    @Test
    public void AddproducttoCart(){
        System.out.println("Add product to Cart  passed");
    }
    @Test
    public void SelectQuantity(){
        System.out.println("Select Quantity passed");
    }
}
