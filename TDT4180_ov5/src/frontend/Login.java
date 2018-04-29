package frontend;

import java.io.IOException;

import backend.Bruker;
import backend.DbFake;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application {
	
	private static Stage stage;
	
	//Oppretter en fake database for å lagre data, kan bli accessed fra overalt i koden
	public static DbFake database = new DbFake();
	
	//Tilegner personen som bruker appen et brukerobjekt, kan bli accessed fra overalt i koden
	public static Bruker currentUser = new Bruker(1, "TestBruker", 0);
	
	//Kjoer denne filen for aa launche appen

    @Override
    public void start(Stage stage) throws Exception {
        Login.stage = stage;
        Login.stage.setTitle("MOSJON");
        
        loadApp();
    }
    
    
    //Foelgende funksjoner laster inn de forskjellige vinduene og brukes av
    //alle de forskjellige controllerene
    public static void loadApp() throws Exception{
    	Parent root = FXMLLoader.load(Login.class.getResource("Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public static void login() throws IOException {
    	Parent root = FXMLLoader.load(Login.class.getResource("Home.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
    
    public static void gotoSettings() throws IOException {
    	Parent root = FXMLLoader.load(Login.class.getResource("Settings.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
    
    public static void gotoTeams() throws IOException {
    	Parent root = FXMLLoader.load(Login.class.getResource("Lag.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
    
    public static void gotoUsers() throws IOException {
    	Parent root = FXMLLoader.load(Login.class.getResource("Brukere.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
    
    public static void gotoTrophies() throws IOException {
    	Parent root = FXMLLoader.load(Login.class.getResource("Medaljer.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
    
    public static void createNewTeam() throws IOException {
    	Parent root = FXMLLoader.load(Login.class.getResource("NyttLag.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
    
    public static void searchTeams() throws IOException {
    	Parent root = FXMLLoader.load(Login.class.getResource("FinnLag.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
    
    public static void gotoTeamMember() throws IOException {
    	Parent root = FXMLLoader.load(Login.class.getResource("MitLag.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
    
    public static void gotoTeamAdmin() throws IOException {
    	Parent root = FXMLLoader.load(Login.class.getResource("AdminLag.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
    
    public static void gotoUser() throws IOException {
    	Parent root = FXMLLoader.load(Login.class.getResource("annenbruker.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
    
    public static void gotoPreviousCompetition() throws IOException {
    	Parent root = FXMLLoader.load(Login.class.getResource("Home.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
    
    public static void gotoCompetitions() throws IOException {
    	Parent root = FXMLLoader.load(Login.class.getResource("Konkuranse.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
    
    public static void gotoCompetitionsTeams() throws IOException {
    	Parent root = FXMLLoader.load(Login.class.getResource("KonkuranseLag.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
