package pl.spring.demo.desktop.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import pl.spring.demo.desktop.SceneMaker;

public class bookPageController {
	@FXML
	Button backButton;

	@FXML
	Button addButton;

	@FXML
	Button searchButton;


	@FXML
	public void addButtonAction(ActionEvent event) throws IOException {

		  Stage newStage = new Stage();
		  newStage.setScene(SceneMaker.getSceneFromFXML("addBook"));

		     newStage.initModality(Modality.APPLICATION_MODAL);
		     newStage.setTitle("Dodaj ksiazke");
		     newStage.showAndWait();

	}

	@FXML
	public void searchBookButtonAction(ActionEvent event) throws IOException {
		  Stage stage = (Stage) searchButton.getScene().getWindow();
		  stage.setScene(SceneMaker.getSceneFromFXML("searchBook"));

	}


	@FXML
	public void backButtonAction(ActionEvent event) throws IOException {
		  Stage stage = (Stage) backButton.getScene().getWindow();
		  stage.setScene(SceneMaker.getSceneFromFXML("firstPage"));
	}


}
