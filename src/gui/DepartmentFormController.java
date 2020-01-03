package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable {
	
	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private Label lblErrorName;
	
	@FXML
	private Button btnSave;
	
	@FXML
	private Button btnCancell;
	
	@FXML
	public void onBtSaveAction() {
		System.out.println("Deu certo!");
	}
	
	@FXML
	public void onBtCancellAction() {
		System.out.println("Canceled!");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		InitializeNodes();		
	}

	private void InitializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtName, 30);
	}
}
