package languages;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import configuration.ConfigurationLoader;

public class LectorLanguage {
	
	private static String selectLanguagetoRead() {
		ConfigurationLoader conf = ConfigurationLoader.getConfiguration();
		String[] languages = conf.getLanguage();
		for (int i = 0; i < languages.length; i++) {
			if( new File(languages[i].concat(conf.getPostfix_language_file_name())).exists() ) {
				return languages[i].concat(conf.getPostfix_language_file_name());
			}
		}
		return conf.getLanguage_default();
	}
	
	public static Language getLanguage() {
		Language language = new Language();
		String line;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(selectLanguagetoRead()));
			while((line = reader.readLine()) != null) {
				String variableName = line.split("=")[0], variableText = line.split("=")[1];
				switch (variableName) {
				case "frameTitle":
					language.setFrameTitle(variableText);
					break;

				case "login":
					language.setLogin(variableText);
					break;
					
				case "password":
					language.setPassword(variableText);
					break;
										
				case "enter":
					language.setEnter(variableText);
					break;
					
				case "userVersion":
					language.setUserVersion(variableText);
					break;
					
				case "noUserVersion":
					language.setNoUserVersion(variableText);
					break;
					
				case "labelNombre":
					language.setLabelNombre(variableText);
					break;
					
				case "labelPrimerApellido":
					language.setLabelPrimerApellido(variableText);
					break;
					
				case "labelSegundoApellido":
					language.setLabelSegundoApellido(variableText);
					break;
					
				case "labelDireccion":
					language.setLabelDireccion(variableText);
					break;
					
				case "labelCorreo":
					language.setLabelCorreo(variableText);
					break;
					
				case "labelGenero":
					language.setLabelGenero(variableText);
					break;
					
				case "labelFecha":
					language.setLabelFecha(variableText);
					break;
					
				case "rbHombre":
					language.setRbHombre(variableText);
					break;
					
				case "rbMujer":
					language.setRbMujer(variableText);
					break;
					
				case "rbNoDeterminado":
					language.setRbNoDeterminado(variableText);
					break;
					
				case "botonGuardar":
					language.setBotonGuardar(variableText);
					break;
					
				case "botonSiguiente":
					language.setBotonSiguiente(variableText);
					break;
				
					
				case "labelDatosCliente":
					language.setLabelDatosCliente(variableText);
					break;
				
					
				case "labelUsuario":
					language.setLabelUsuario(variableText);
					break;
				
					
				case "titulo":
					language.setTitulo(variableText);
					break;
				
					
				case "btnAnterior":
					language.setBtnAnterior(variableText);
					break;
				
					
				case "lblTitulo":
					language.setLblTitulo(variableText);
					break;
				
					
				case "titleAccesorios":
					language.setTitleAccesorios(variableText);
					break;
				
					
				case "textArg":
					language.setTextArg(variableText);
					break;
				
					
				case "btnFinalizar":
					language.setBtnFinalizar(variableText);
					break;
				
					
				case "titulo_Resumen":
					language.setTitulo_Resumen(variableText);
					break;
				
					
				case "vueltaLogin":
					language.setVueltaLogin(variableText);
					break;
					
				case "invalidLogin":
					language.setInvalidLogin(variableText);
					break;
					
				case "rightOperation":
					language.setRightOperation(variableText);
					break;
				
				case "introRequired":
					language.setIntroRequired(variableText);
					break;
					
				case "incorrectEmail":
					language.setIncorrectEmail(variableText);
					break;
					
				case "wannaSave":
					language.setWannaSave(variableText);
					break;
					
				default:
					break;
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return language;
	}

}
