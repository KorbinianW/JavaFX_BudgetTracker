package com.bini.bankingappjavafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.SnapshotResult;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Input {
    @FXML
    TextField Spending = new TextField();
    @FXML
    TextField Display = new TextField();


    @FXML
    ObservableList<String>spendings = FXCollections.observableArrayList("Test1", "Test2", "Test3");
    @FXML
    ListView<String> Overview = new ListView<>(spendings);


    @FXML
    public void onSubmitButtonClicked() {
        String budget = Spending.getText();
        Display.setText(budget);
        Spending.setText("");

    }


}
