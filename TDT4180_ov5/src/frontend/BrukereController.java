package frontend;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class BrukereController {
	
	@FXML TextField userSearchbar;
	
	@FXML
	public void gotoHome() throws IOException {
		Login.login();
	}
	
	@FXML
	public void searchForUsers() throws IOException {
		Login.login();
	}

}
