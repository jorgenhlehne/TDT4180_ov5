package frontend;

import java.io.IOException;

import backend.Bruker;
import backend.Konkuranse;
import backend.LagBackend;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

public class MitLagController {
	
	@FXML AnchorPane teamPane;
	
	private Bruker selectedUser;
	
	private Konkuranse selectedCompetition;
	
	private static LagBackend activeTeam;
	
	@FXML private ListView<Bruker> memberListView;
	
//	@FXML private ListView<Konkuranse> competitionsListView; //Denne fungerer ikke av en eller annen grunn
	
	@FXML private Label teamNameLabel;
	
	@FXML
	void initialize() throws IOException {
		activeTeam = LagController.getActiveTeam();
		populateUserList();
//		populateCompetitionList();
		teamNameLabel.setText(activeTeam.getName());
		if (activeTeam.getKonkuranse() == null) {
			AnchorPane raceCard = FXMLLoader.load(getClass().getResource("RaceCardEmpty.fxml"));
	        teamPane.getChildren().add(raceCard);
		} else {
			AnchorPane noRace = FXMLLoader.load(getClass().getResource("RaceCard.fxml"));
	        teamPane.getChildren().add(noRace);
		}
	}
	
	public static void setActiveTeam(LagBackend team) {
		activeTeam = team;
	}
	
	@FXML
	public void populateUserList() {
		ObservableList<Bruker> userListTemp = FXCollections.observableArrayList(activeTeam.getMembers());
		memberListView.setItems(userListTemp);
	}
	
	/*
	@FXML
	public void populateCompetitionList() {
		ObservableList<Konkuranse> competitionListTemp = FXCollections.observableArrayList(activeTeam.getPreviousCompetitions());
		competitionsListView.setItems(competitionListTemp);
	}*/
	
	@FXML
	public void clickMember() throws IOException {
		selectedUser = memberListView.getSelectionModel().getSelectedItem();
		Login.gotoUser();
	}
	
	/*
	@FXML
	public void clickCompetition() throws IOException {
		selectedCompetition = competitionListView.getSelectionModel().getSelectedItem();
		Login.gotoPreviousCompetition();
	}*/
	
	@FXML
	public void gotoHome() throws IOException {
		Login.login();
	}

}
