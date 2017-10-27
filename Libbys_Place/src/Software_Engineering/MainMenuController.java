package Software_Engineering;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainMenuController implements Initializable{

	@FXML
	Button loginButton;
	@FXML
	TextField auid;
	@FXML
	TextField password;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		loginButton.setOnAction(e ->{
		System.exit(-1);
		});
		
		
		
	}
}
