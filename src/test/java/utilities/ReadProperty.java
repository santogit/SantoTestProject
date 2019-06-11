package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	public Properties prop;
	public FileInputStream fis;

	public ReadProperty() throws IOException {
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir") + "/Config.properties");
		prop.load(fis);
	}

	public String getBrowser() {
		return prop.getProperty("browser");

	}

	public String getUrl() {
		return prop.getProperty("url");

	}

}
