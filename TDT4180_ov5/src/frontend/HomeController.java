package frontend;

import java.io.IOException;
import javafx.fxml.FXML;

public class HomeController {
	
	@FXML
	public void gotoSettings() throws IOException {
		Login.gotoSettings();
	}

}
