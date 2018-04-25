package frontend;

import java.io.IOException;
import javafx.fxml.FXML;

public class HomeController {
	
	@FXML
	public void gotoSettings() throws IOException {
		Login.gotoSettings();
	}
	
	@FXML
	public void gotoTeams() throws IOException {
		Login.gotoTeams();
	}
	
	@FXML
	public void gotoUsers() throws IOException {
		Login.gotoUsers();
	}
	
	@FXML
	public void gotoTrophies() throws IOException {
		Login.gotoTrophies();
	}

}
