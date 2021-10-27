package configurations;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.springframework.beans.factory.annotation.Value;

@Set
@Get
public class ConfigurationFiles {

	PropertiesConfiguration config = new PropertiesConfiguration();

	public ConfigurationFiles() {
		setAddressUrlWithProperty();
	}

	private String addressUrl;

	@Value("addressZipFile")
	private String addressZipFile;

	@Value("destinyFolder")
	private String destinyFolder;

	public String getAddressUrl() {
		return this.addressUrl;
	}

	public void setAddressUrlWithProperty(){

		try {
			config.load("application.properties");
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.addressUrl = config.getString("addressUrl");
	}
	
	public String getAddressZipFile() {
		return this.addressZipFile;
	}
	

}
