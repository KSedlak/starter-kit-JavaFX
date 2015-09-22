package pl.spring.demo;

import java.io.IOException;



import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class SceneMaker {

	  public  static Scene getSceneFromFXML(String fxmlName) throws IOException{
		   	return  new Scene(FXMLLoader.load(App.class.getResource("fxml/"+fxmlName+".fxml")));

		    }
}
