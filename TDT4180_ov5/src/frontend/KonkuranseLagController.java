package frontend;

import java.io.IOException;

import backend.Konkuranse;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class KonkuranseLagController {
	
	@FXML private ListView<Konkuranse> compListView;
	
	private Konkuranse activeComp;
	
	@FXML
	void initialize() {
		populateCompList();
	}
	
	@FXML
	public void gotoHome() throws IOException {
		Login.login();
	}
	
	@FXML
	public void populateCompList() {
		ObservableList<Konkuranse> compListTemp = FXCollections.observableArrayList(Login.database.getCompetitions());
		compListView.setItems(compListTemp);
	}
	
	@FXML
	public void joinTeamCompetition() throws IOException {
		activeComp = compListView.getSelectionModel().getSelectedItem();
		LagController.activeTeam.setKonkuranse(activeComp);
		Login.gotoTeamAdmin();
	}

}
