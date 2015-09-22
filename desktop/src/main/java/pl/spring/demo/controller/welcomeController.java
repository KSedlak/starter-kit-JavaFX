package pl.spring.demo.controller;




import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import pl.spring.demo.SceneMaker;


public class welcomeController {


	@FXML
	Button enterButton;







	@FXML
	public void enterButtonAction(ActionEvent event) throws IOException {
		  Stage stage = (Stage) enterButton.getScene().getWindow();
		  stage.setScene(SceneMaker.getSceneFromFXML("firstPage"));
	}



}
