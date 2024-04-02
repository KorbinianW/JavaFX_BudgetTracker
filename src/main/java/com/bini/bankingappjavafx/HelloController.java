package com.bini.bankingappjavafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    static double amount;


    @FXML
    PieChart chart;

    ObservableList<PieChart.Data> datenliste = FXCollections.observableArrayList(
            new PieChart.Data("Budget", 5000)
    );


    @FXML
    public void onRefreshButtonClicked() {
        datenliste.add(new PieChart.Data("Test", amount));
        chart.getData().addAll(datenliste);
    }

    @FXML
    private void onInputClicked() throws IOException {
        HelloApplication sceneChange = new HelloApplication();
        sceneChange.changeScene("input-view.fxml");
    }


}