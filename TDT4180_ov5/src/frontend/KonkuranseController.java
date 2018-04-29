package frontend;

import java.io.IOException;

import backend.Konkuranse;
import backend.LagBackend;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class KonkuranseController {
	
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
	public void joinCompetition() throws IOException {
		activeComp = compListView.getSelectionModel().getSelectedItem();
		Login.currentUser.joinIndividualCompetition(activeComp);
		Login.login();
	}

}
