package pl.spring.demo.desktop.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.concurrent.Worker;
import javafx.concurrent.Worker.State;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import pl.spring.demo.desktop.SceneMaker;
import pl.spring.demo.desktop.dataProvider.DataProvider;
import pl.spring.demo.to.AuthorTo;
import javafx.scene.control.TableView;

public class bookSearchPageController {
	@FXML
	Button backButton;
	@FXML Button searchButton;
	@FXML TableView tableBook;




	@FXML
	public void backButtonAction(ActionEvent event) throws IOException {
		  Stage stage = (Stage) backButton.getScene().getWindow();
		  stage.setScene(SceneMaker.getSceneFromFXML("booksMenu"));
	}


	@FXML
	public void searchButtonAction(ActionEvent event){

	
		Task<Collection<AuthorTo>> backgroundTask = new Task<Collection<AuthorTo>>() {

			@Override
			protected Collection<AuthorTo> call() throws Exception {
				return DataProvider.INSTANCE.findAllAuthors();
			}
		};


		backgroundTask.stateProperty().addListener(new ChangeListener<Worker.State>() {
			@Override
			public void changed(ObservableValue<? extends State> observable, State oldValue, State newValue) {
				if (newValue == State.SUCCEEDED) {
				succes();
				}
			}
			
			public void succes(){
				Collection<AuthorTo> list =backgroundTask.getValue();
				for(AuthorTo a:list){
					System.out.println(a.getFirstName()+"  "+ a.getLastName());
				}
			}
		});


		new Thread(backgroundTask).start();
		
				}

}
