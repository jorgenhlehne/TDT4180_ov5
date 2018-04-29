package frontend;

import java.io.IOException;

import javafx.fxml.FXML;

public class KonkuranseController {
	
	@FXML
	public void gotoHome() throws IOException {
		Login.login();
	}

}
