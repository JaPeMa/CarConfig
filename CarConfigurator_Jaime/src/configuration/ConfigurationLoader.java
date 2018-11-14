package configuration;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class ConfigurationLoader {
	private String car_configuration_path, car_configuration_file_name, specifications_file_path, 
		version, language_default, postfix_language_file_name;
	private String[] language, employee_list, employee_password;
	private int descompte;
	
	private static ConfigurationLoader conf;
	

	private ConfigurationLoader() {
		
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			Configuration conf = new Configuration();
			try {
				DocumentBuilder builder = factory.newDocumentBuilder();
				Document doc = builder.parse(new File("cv_config.xml"));

				doc.getDocumentElement().normalize();
				car_configuration_path = doc.getElementsByTagName("car_configuration_path").item(0).getTextContent();
				
				car_configuration_file_name = doc.getElementsByTagName("car_configuration_file_name").item(0).getTextContent();
				employee_list = doc.getElementsByTagName("employee_list").item(0).getTextContent().split(",");
				employee_password = doc.getElementsByTagName("employee_password").item(0).getTextContent().split(",");
				specifications_file_path = doc.getElementsByTagName("specifications_file_path").item(0).getTextContent();
				version = doc.getElementsByTagName("version").item(0).getTextContent();
				language = doc.getElementsByTagName("language").item(0).getTextContent().split(",");
				language_default = doc.getElementsByTagName("language_default").item(0).getTextContent();
				postfix_language_file_name = doc.getElementsByTagName("postfix_language_file_name").item(0).getTextContent();

				descompte = comprobar(doc.getElementsByTagName("descompte").item(0).getTextContent()) ?
						Integer.parseInt(doc.getElementsByTagName("descompte").item(0).getTextContent()) :
						0;
				
				

			} catch (ParserConfigurationException | SAXException | IOException e) {
				e.printStackTrace();
			}

	}

	public static ConfigurationLoader getConfiguration() {// Comprueba que no hemos creado la clase
															// anteriormente

		if (configuration == null) {// Si no lo esta la crea

			conf = new ConfigurationLoader();

		}

		return conf;// Devuelve el archivo
	}
	
	private static boolean comprobar(String value) {
		int descompte;
		try {
			descompte = Integer.parseInt(value);
			if (descompte < 22 && descompte >= 0) {
				return true;	
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}
	
	public String getCar_configuration_path() {
		return car_configuration_path;
	}

	public void setCar_configuration_path(String car_configuration_path) {
		this.car_configuration_path = car_configuration_path;
	}

	public String getCar_configuration_file_name() {
		return car_configuration_file_name;
	}

	public void setCar_configuration_file_name(String car_configuration_file_name) {
		this.car_configuration_file_name = car_configuration_file_name;
	}

	public String getSpecifications_file_path() {
		return specifications_file_path;
	}

	public void setSpecifications_file_path(String specifications_file_path) {
		this.specifications_file_path = specifications_file_path;
	}

	public String[] getEmployee_list() {
		return employee_list;
	}

	public void setEmployee_list(String[] employee_list) {
		this.employee_list = employee_list;
	}

	public String[] getEmployee_password() {
		return employee_password;
	}

	public String[] getLanguage() {
		return language;
	}

	public void setLanguage(String[] language) {
		this.language = language;
	}

	public String getLanguage_default() {
		return language_default;
	}

	public void setLanguage_default(String language_default) {
		this.language_default = language_default;
	}

	public String getPostfix_language_file_name() {
		return postfix_language_file_name;
	}

	public void setPostfix_language_file_name(String postfix_language_file_name) {
		this.postfix_language_file_name = postfix_language_file_name;
	}

	public void setEmployee_password(String[] employee_password) {
		this.employee_password = employee_password;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	
	public int getDescompte() {
		return descompte;
	}

	public void setDescompte(int descompte) {
		this.descompte = descompte;
	}

	public static ConfigurationLoader getConf() {
		return conf;
	}

	public static void setConf(ConfigurationLoader conf) {
		ConfigurationLoader.conf = conf;
	}

	public File getFichero_coches() {
		return fichero_coches;
	}

	public void setFichero_coches(File fichero_coches) {
		this.fichero_coches = fichero_coches;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public static void setConfiguration(Configuration configuration) {
		ConfigurationLoader.configuration = configuration;
	}


	private File fichero_coches;
	private String ruta;
	private static Configuration configuration;

	

}
