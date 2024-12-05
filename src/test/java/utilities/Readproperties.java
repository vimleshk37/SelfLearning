package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Readproperties {
	
	public String ReadConfig(String browser) throws IOException {
		FileReader fr = new FileReader(System.getProperty("user.dir") +"\\src\\main\\resources\\configfiles\\config.properties");
		Properties p = new Properties();
		p.load(fr);
		return p.getProperty(browser);
	}
}