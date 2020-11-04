package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configReader {
    private static Properties configFile;
    static{
        try{
            //to acces config properties
            FileInputStream fileInputStream = new FileInputStream("config.properties");
            //initialize properties object
            configFile = new Properties();
            //to load config.properties file
            configFile.load(fileInputStream);
            fileInputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static String getProperty(String key) {

        return configFile.getProperty(key);
    }

}
