package frontend;

import java.io.IOException;

import backend.Bruker;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class annenbrukerController {
	
	private Bruker activeUser;
	
	@FXML private Label usernameLabel;
	
	@FXML
	void initialize() {
		activeUser = Login.database.activeUser;
		usernameLabel.setText(activeUser.toString());
	}
	
	@FXML
	public void gotoHome() throws IOException {
		Login.login();
	}

}
