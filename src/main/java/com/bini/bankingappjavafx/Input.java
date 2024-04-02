package com.bini.bankingappjavafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Input {
    @FXML
    TextField Spending = new TextField();
    @FXML
    TextField Display = new TextField();
    @FXML
    ObservableList<String> spendings = FXCollections.observableArrayList("Test1", "Test2", "Test3");
    @FXML
    ListView<String> Overview = new ListView<>(spendings);


    @FXML
    public void onSubmitButtonClicked() throws NumberFormatException {
        try {
            String budget = Spending.getText();
            Display.setText(budget);
            HelloController.amount = Double.parseDouble(budget);
            Spending.setText("");

        } catch (NumberFormatException e) {
            Spending.setText("Enter a valid Number!");
        }
    }

    @FXML
    public void onBackButtonPressed() throws IOException {
        HelloApplication sceneChange = new HelloApplication();
        sceneChange.changeScene("hello-view.fxml");
    }


}
