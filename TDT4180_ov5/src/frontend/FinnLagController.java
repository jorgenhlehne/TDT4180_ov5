package frontend;

import java.io.IOException;
import java.util.List;

import backend.LagBackend;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class FinnLagController {
	
	private LagBackend activeTeam;
	
	@FXML private ListView<LagBackend> teamListView;
	
	@FXML private TextField teamSearchbar;
	
	@FXML
	public void gotoHome() throws IOException {
		Login.login();
	}
	
	@FXML
	public void goBack() throws IOException{
		Login.gotoTeams();
	}
	
	@FXML
	public void findTeams() {
		if (teamSearchbar.getText().isEmpty()) {
			ObservableList<LagBackend> teamListTemp = FXCollections.observableArrayList(Login.database.getTeams());
			teamListView.setItems(teamListTemp);
		} else {
			String searchTerm = teamSearchbar.getText();
			List<LagBackend> returnedList = Login.database.searchTeams(searchTerm);
			ObservableList<LagBackend> teamListTemp = FXCollections.observableArrayList(returnedList);
			teamListView.setItems(teamListTemp);
		}	
	}
	
	@FXML
	public void clickTeam() throws IOException {
		LagController.activeTeam = teamListView.getSelectionModel().getSelectedItem();
		activeTeam = LagController.activeTeam;
		if (activeTeam.getLeader() == Login.currentUser) {
			Login.gotoTeamAdmin();
		} else {
			Login.gotoTeamMember();
		}
	}
	
	

}
