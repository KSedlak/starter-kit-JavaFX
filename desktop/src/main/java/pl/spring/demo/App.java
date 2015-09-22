package pl.spring.demo;




import com.aquafx_project.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App  extends Application
{
	   public static void main(String[] args) {
	        launch(args);
	    }

	@Override
	public void start(Stage primaryStage) throws Exception {

    	Scene primaryScene=SceneMaker.getSceneFromFXML("welcomePage");
        primaryStage.setScene(primaryScene);
        primaryStage.show();
        primaryScene.getStylesheets().add(getClass().getResource("css/standard.css").toExternalForm());
        AquaFx.style();
	}


}
