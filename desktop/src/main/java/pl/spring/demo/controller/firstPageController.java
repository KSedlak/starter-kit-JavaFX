package pl.spring.demo.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import pl.spring.demo.SceneMaker;
import pl.spring.demo.dataProvider.DataProvider;

public class firstPageController {
	@FXML
	Button books;

	@FXML
	Button authors;



	@FXML
	public void booksButtonAction(ActionEvent event) throws IOException {
		  Stage stage = (Stage) books.getScene().getWindow();
		  stage.setScene(SceneMaker.getSceneFromFXML("booksMenu"));
		  DataProvider.INSTANCE.findAllBooks();
	}

	@FXML
	public void authorsButtonAction(ActionEvent event) throws IOException {
		  Stage stage = (Stage) authors.getScene().getWindow();
		  stage.setScene(SceneMaker.getSceneFromFXML("authorsMenu"));
	}
}
