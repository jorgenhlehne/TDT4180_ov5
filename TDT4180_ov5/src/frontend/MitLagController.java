package frontend;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class MitLagController {
	
	@FXML AnchorPane teamPane;
	
	@FXML
	void initialize() throws IOException {
		if (false) {
			AnchorPane raceCard = FXMLLoader.load(getClass().getResource("RaceCard.fxml"));
	        teamPane.getChildren().add(raceCard);
		} else {
			AnchorPane noRace = FXMLLoader.load(getClass().getResource("RaceCardEmpty.fxml"));
	        teamPane.getChildren().add(noRace);
		}
	}
	
	@FXML
	public void gotoHome() throws IOException {
		Login.login();
	}

}
