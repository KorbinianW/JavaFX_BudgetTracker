package com.bini.bankingappjavafx;

import com.fasterxml.jackson.core.JsonProcessingException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Input {
    public Input() throws IOException {

    }
    @FXML
    TextField Spending = new TextField();
    @FXML
    TextField Name = new TextField();
    @FXML
    TextField Display = new TextField();
    @FXML
    PieChart testChart = new PieChart();
    @FXML
    ObservableList<String> spendings = FXCollections.observableArrayList("Test1", "Test2", "Test3");
    @FXML
    ListView<String> Overview = new ListView<>(spendings);

    ObservableList<PieChart.Data> list = FXCollections.observableArrayList();

    Data data = new Data();



    Json json = new Json();
    @FXML
    public void onSubmitButtonClicked() throws NumberFormatException {
        try {
            String budget = Spending.getText();
            Display.setText(budget);
            data.setAmount(Double.parseDouble(budget));
            data.setName(Name.getText());
            list.add(new PieChart.Data(Name.getText(), Double.parseDouble(budget)));
            testChart.setData(list);
            Name.setText("");
            Spending.setText("");

            json.toFile();

        } catch (NumberFormatException e){
            Spending.setPromptText("Enter a valid Number!");
        }catch (Exception e){

        }
    }

    @FXML
    public void onBackButtonPressed() throws IOException {
        HelloApplication sceneChange = new HelloApplication();
        sceneChange.changeScene("hello-view.fxml");
        json.bufferedWriter.close();
    }
}
