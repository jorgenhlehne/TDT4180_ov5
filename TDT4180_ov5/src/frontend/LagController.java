package frontend;

import java.io.IOException;
import javafx.fxml.FXML;

import javafx.scene.control.ListView;

public class LagController {
	
	@FXML private ListView<String> teamListView;
	
	@FXML
	void initialize() {
		
	}
	
	@FXML
	public void gotoHome() throws IOException {
		Login.login();
	}
	
	@FXML
	public void newTeam() throws IOException {
		Login.login();
	}
	
	@FXML
	public void searchTeams() throws IOException {
		Login.login();
	}

}
