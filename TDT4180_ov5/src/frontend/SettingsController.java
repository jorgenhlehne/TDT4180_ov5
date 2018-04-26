package frontend;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SettingsController {
	
	@FXML private ListView<String> settingsList;
	
	ObservableList<String> settingsTemp = FXCollections.observableArrayList(
			"Innstilling 1", "Innstilling 2", "Innstilling 3");
	
	@FXML
	void initialize() {
		settingsList.setItems(settingsTemp);
	}
	
	@FXML
	public void gotoHome() throws IOException {
		Login.login();
	}
	
	@FXML
	public void logout() throws Exception {
		Login.loadApp();
	}

}
