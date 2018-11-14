package configuration;

import java.util.ArrayList;

public class Configuration {
	private String car_configuration_path, car_configuration_file_name, specifications_file_path, 
		version, language, language_default, postfix_language_file_name;
	private String[] employee_list, employee_password;
	private int descompte;
	
	public Configuration() {
		
	}

	

	public Configuration(String car_configuration_path, String car_configuration_file_name,
			String specifications_file_path, String version, String language, String language_default,
			String postfix_language_file_name, String[] employee_list, String[] employee_password,
			int descompte) {
		this.car_configuration_path = car_configuration_path;
		this.car_configuration_file_name = car_configuration_file_name;
		this.specifications_file_path = specifications_file_path;
		this.version = version;
		this.language = language;
		this.language_default = language_default;
		this.postfix_language_file_name = postfix_language_file_name;
		this.employee_list = employee_list;
		this.employee_password = employee_password;
		this.descompte = descompte;
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

	public void setEmployee_password(String[] employee_password) {
		this.employee_password = employee_password;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}



	public String getLanguage() {
		return language;
	}



	public void setLanguage(String language) {
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



	public int getDescompte() {
		return descompte;
	}



	public void setDescompte(int descompte) {
		this.descompte = descompte;
	}

	
}
