package pl.spring.demo.controller;

import javafx.scene.control.Button;
import javafx.stage.Stage;
import pl.spring.demo.SceneMaker;
import pl.spring.demo.to.AuthorTo;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class addAuthorController {
	@FXML
Button	backButton;
	@FXML TextField name;
	@FXML TextField lastName;
	@FXML Button saveButton;


	@FXML
	public void backButtonAction(ActionEvent event) throws IOException {
		  Stage stage = (Stage) backButton.getScene().getWindow();
		  stage.close();
	}


	@FXML public void saveButtonAction(ActionEvent event) {

		AuthorTo author=new AuthorTo(null, name.getText(), lastName.getText());
		  Stage stage = (Stage) saveButton.getScene().getWindow();
		stage.close();
	}


}
