package frontend;

import java.io.IOException;
import javafx.fxml.FXML;

public class SettingsController {
	
	@FXML
	public void gotoHome() throws IOException {
		Login.login();
	}
	
	@FXML
	public void logout() throws Exception {
		Login.loadApp();
	}

}
