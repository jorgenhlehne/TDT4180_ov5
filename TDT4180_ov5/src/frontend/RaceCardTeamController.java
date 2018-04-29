package frontend;

import java.io.IOException;

import backend.Konkuranse;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class RaceCardTeamController {
	
	@FXML private Label compName;
	
	@FXML private Button joinATeamCompButton;
	
	@FXML
	void initialize() {
		Konkuranse activeComp = LagController.activeTeam.getKonkuranse();
		compName.setText(activeComp.toString());
		setButtonText();
	}
	
	@FXML
	public void setButtonText() {
		if (Login.currentUser.teamCompetition == LagController.activeTeam.getKonkuranse()) {
			joinATeamCompButton.setText("Forlat konkurranse");
		} else {
			joinATeamCompButton.setText("Meld deg på denne konkurransen");
		}
	}
	
	@FXML
	public void leaveCompetition() throws IOException {
		LagController.activeTeam.setKonkuranse(null);
		Login.gotoTeamAdmin();
	}
	
	@FXML
	public void joinLeaveButton() throws IOException {
		if (Login.currentUser.teamCompetition == LagController.activeTeam.getKonkuranse()) {
			Login.currentUser.leaveTeamCompetition();
			Login.gotoTeamAdmin();
		} else {
			Login.currentUser.joinTeamCompetition(LagController.activeTeam.getKonkuranse());
			Login.gotoTeamAdmin();
		}
		
	}

}
