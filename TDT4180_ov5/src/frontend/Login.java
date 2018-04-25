package frontend;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application {
	
	private static Stage stage;
	
	//Kjoer denne filen for aa launche appen

    @Override
    public void start(Stage stage) throws Exception {
        Login.stage = stage;
        Login.stage.setTitle("MOSJON");
        
        loadApp();
    }
    
    public void loadApp() throws Exception{
    	Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("MOSJON");
        stage.show();
    }
    
    public static void login() throws IOException {
    	Parent root = FXMLLoader.load(Login.class.getResource("Home.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("MOSJON");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
