package Testngpract;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailedtestdemo {
//@Test(retryAnalyzer = RetryAnalyser.class)
@Test
    public  void Testcase01(){
        Assert.assertTrue(false);// this will failed
    }
    @Test
    public  void Testcase02(){
        Assert.assertTrue(false);// this will failed
    }
    @Test
    public  void Testcase03(){
        Assert.assertTrue(true);// this will pass
    }
}
