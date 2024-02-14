package Testngpract;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesfile {
    Properties properties;
    String path="S:\\Eclipse\\TestngPractice\\config.properties";

    public ReadPropertiesfile() throws IOException {
        properties= new Properties();
        FileInputStream fis= new FileInputStream(path);
        properties.load(fis);
    }

    public String getURL(){
        String url= properties.getProperty("url");
         if (url!=null) {
             return url;
         }
         else
              throw new RuntimeException("url not specified");
         }
    public String getusername(){
        String user= properties.getProperty("username");
        if (user!=null) {
            return user;
        }
        else
            throw new RuntimeException("url not specified");
    }

    public String getpassword(){
        String pass= properties.getProperty("password");
        if (pass!=null) {
            return pass;
        }
        else
            throw new RuntimeException("url not specified");
    }

}
