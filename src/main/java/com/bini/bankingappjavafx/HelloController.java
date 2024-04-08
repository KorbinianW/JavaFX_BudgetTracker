package com.bini.bankingappjavafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;

import java.io.IOException;

public class HelloController {
    static double amount;
    static double budget = 5000;

    @FXML
    PieChart chart;

    ObservableList<PieChart.Data> datenliste = FXCollections.observableArrayList(

    );

    @FXML
    public void onRefreshButtonClicked() {
        datenliste.add(new PieChart.Data("Test", toPercent(amount, budget)));
        datenliste.add(new PieChart.Data("Budget", 100 - toPercent(amount, budget)));
        chart.getData().addAll(datenliste);
    }

    @FXML
    private void onInputClicked() throws IOException {
        HelloApplication sceneChange = new HelloApplication();
        sceneChange.changeScene("input-view.fxml");
    }

    public double toPercent(double a, double b) {
        return (a / b) * 100;
    }

}