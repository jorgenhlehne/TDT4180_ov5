package frontend;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class HomeController {
	
	@FXML AnchorPane individualPane;
	
	@FXML AnchorPane teamPane;
	
	@FXML
	void initialize() throws IOException {
		if (false) {
			AnchorPane raceCard = FXMLLoader.load(getClass().getResource("RaceCard.fxml"));
	        individualPane.getChildren().add(raceCard);
		} else {
			AnchorPane noRace = FXMLLoader.load(getClass().getResource("RaceCardEmpty.fxml"));
	        individualPane.getChildren().add(noRace);
		}
		if (false) {
			AnchorPane raceCard = FXMLLoader.load(getClass().getResource("RaceCard.fxml"));
	        individualPane.getChildren().add(raceCard);
		} else {
			AnchorPane noRace = FXMLLoader.load(getClass().getResource("RaceCardEmpty.fxml"));
	        teamPane.getChildren().add(noRace);
		}
	}
	
	@FXML
	public void gotoSettings() throws IOException {
		Login.gotoSettings();
	}
	
	@FXML
	public void gotoTeams() throws IOException {
		Login.gotoTeams();
	}
	
	@FXML
	public void gotoUsers() throws IOException {
		Login.gotoUsers();
	}
	
	@FXML
	public void gotoTrophies() throws IOException {
		Login.gotoTrophies();
	}

}
