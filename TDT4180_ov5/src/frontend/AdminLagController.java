package frontend;

import java.io.IOException;

import backend.Bruker;
import backend.Konkuranse;
import backend.LagBackend;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;

public class AdminLagController {
	
	private Bruker selectedUser;
	
	private Konkuranse selectedCompetition;
	
	private LagBackend activeTeam;
	
	@FXML private ListView<Bruker> memberListView;
	
//	@FXML private ListView<Konkuranse> competitionsListView; //Denne fungerer ikke av en eller annen grunn
	
	@FXML private Label teamNameLabel;
	
	@FXML
	void initialize() {
		activeTeam = LagController.getActiveTeam();
		populateUserList();
//		populateCompetitionList();
		teamNameLabel.setText(activeTeam.getName());
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
	public void gotoHome() throws IOException {
		Login.login();
	}
	
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
	
	

}
