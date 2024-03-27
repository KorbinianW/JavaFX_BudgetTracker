package com.bini.bankingappjavafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {



    @FXML
    PieChart chart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<PieChart.Data> datenliste = FXCollections.observableArrayList(
                new PieChart.Data("Test", 50),
                new PieChart.Data("Test2", 50)
        );
        chart.getData().addAll(datenliste);
    }

    @FXML
    private void onInputClicked() throws IOException {
        HelloApplication sceneChange = new HelloApplication();
        sceneChange.changeScene("input-view.fxml");
    }


}