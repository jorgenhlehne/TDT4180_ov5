package frontend;

import java.io.IOException;

import javafx.fxml.FXML;

public class LoginController {
	
	@FXML
	public void login() throws IOException{
		Login.login();
	}
	
}
