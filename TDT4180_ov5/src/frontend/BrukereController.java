package frontend;

import java.io.IOException;
import java.util.List;

import backend.Bruker;
import backend.LagBackend;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class BrukereController {
	
	private Bruker activeUser;
	
	@FXML TextField userSearchbar;
	
	@FXML private ListView<Bruker> userListView;
	
	@FXML
	public void gotoHome() throws IOException {
		Login.login();
	}
	
	@FXML
	public void findUsers() {
		if (userSearchbar.getText().isEmpty()) {
			ObservableList<Bruker> teamListTemp = FXCollections.observableArrayList(Login.database.getUsers());
			userListView.setItems(teamListTemp);
		} else {
			String searchTerm = userSearchbar.getText();
			List<Bruker> returnedList = Login.database.searchUsers(searchTerm);
			ObservableList<Bruker> teamListTemp = FXCollections.observableArrayList(returnedList);
			userListView.setItems(teamListTemp);
		}	
	}
	
	@FXML
	public void clickUser() throws IOException {
		Login.database.activeUser = userListView.getSelectionModel().getSelectedItem();
		activeUser = Login.database.activeUser;
		Login.gotoUser();
	}

}
