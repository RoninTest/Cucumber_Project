package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;
    static {

        String filePath1="C:\\Users\\Eren\\Desktop\\Alieren\\TESTS\\CucumberProject\\";
        String filePath2="src\\main\\java\\configuration.properties";

        try{
            FileInputStream fis=new FileInputStream(filePath1+filePath2);
            properties=new Properties();
            properties.load(fis);

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
