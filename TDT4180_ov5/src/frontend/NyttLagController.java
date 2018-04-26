package frontend;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import backend.Bruker;
import backend.LagBackend;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class NyttLagController {
	
	@FXML private TextField newTeamName;
	
	@FXML private Label errorLabel;
	
	@FXML
	public void gotoHome() throws IOException{
		Login.login();
	}
	
	@FXML
	public void goBack() throws IOException{
		Login.gotoTeams();
	}
	
	//Lager et lag og legger til naavaerende bruker som admin
	@FXML
	public void createTeam() throws IOException {
		if (newTeamName.getText().isEmpty()) {
			errorLabel.setText("Vennligst skriv et navn");
		} else {
			List<Bruker> userListTemp = new ArrayList<Bruker>();
			LagBackend newTeam = new LagBackend(newTeamName.getText(), null, userListTemp, Login.currentUser);
			newTeam.addMember(Login.currentUser);
			Login.database.addTeam(newTeam);
			Login.gotoTeams();
		}
	}

}
