package frontend;

import java.io.IOException;

import backend.LagBackend;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.scene.control.ListView;

public class LagController {
	
	@FXML private ListView<LagBackend> teamListView;
	
	@FXML
	void initialize() {
		populateTeamList();
	}
	
	@FXML
	public void populateTeamList() {
		ObservableList<LagBackend> teamListTemp = FXCollections.observableArrayList(Login.currentUser.getTeams());
		teamListView.setItems(teamListTemp);
	}
	
	@FXML
	public void gotoHome() throws IOException {
		Login.login();
	}
	
	@FXML
	public void newTeam() throws IOException {
		Login.createNewTeam();
	}
	
	@FXML
	public void searchTeams() throws IOException {
		Login.searchTeams();
	}

}
