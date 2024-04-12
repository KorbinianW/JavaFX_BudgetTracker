package com.bini.bankingappjavafx;

import com.fasterxml.jackson.core.JsonProcessingException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;

import java.io.IOException;

public class HelloController {
    Json json = new Json();

    @FXML
    PieChart chart;
    ObservableList<PieChart.Data> datalist = FXCollections.observableArrayList(

    );


    @FXML
    public void onRefreshButtonClicked() throws Exception {
//        datalist.add(new PieChart.Data(Data.getName(), toPercent(Data.getAmount(), Data.budget)));
//        datalist.add(new PieChart.Data("Budget", 100 - toPercent(Data.getAmount(), Data.budget)));
//        chart.getData().addAll(datalist);
        json.toJson();
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