package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SampleController {
	
	@FXML
	private TextField tfCalculate,tfResult;
	
	@FXML
	private TextArea taHistory;
	
	@FXML
	public void btNum9(ActionEvent event) {
		String word=tfCalculate.getText();
		word=word+9;
		tfCalculate.setText(word);
	}
	@FXML
	public void btNum8(ActionEvent event) {
		
	}
	@FXML
	public void btNum7(ActionEvent event) {
		
	}
	@FXML
	public void btNum6(ActionEvent event) {
		
	}
	@FXML
	public void btNum5(ActionEvent event) {
		
	}
	@FXML
	public void btNum4(ActionEvent event) {
		
	}
	@FXML
	public void btNum3(ActionEvent event) {
		
	}
	@FXML
	public void btNum2(ActionEvent event) {
		
	}
	@FXML
	public void btNum1(ActionEvent event) {
		
	}
	@FXML
	public void btNum0(ActionEvent event) {
		
	}
	@FXML
	public void btOpm(ActionEvent event) {
		
	}

	@FXML
	public void btOps(ActionEvent event) {

	}

	@FXML
	public void btOpscl(ActionEvent event) {

	}

	@FXML
	public void btOpsml(ActionEvent event) {

	}

}
