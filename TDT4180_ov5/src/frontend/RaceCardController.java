package frontend;

import java.io.IOException;

import backend.Konkuranse;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RaceCardController {
	
	@FXML private Label compName;
	
	@FXML
	void initialize() {
		Konkuranse activeComp = Login.currentUser.individualCompetition;
		compName.setText(activeComp.toString());
	}
	
	@FXML
	public void leaveCompetition() throws IOException {
		Login.currentUser.leaveIndividualCompetition();
		Login.login();
	}

}
