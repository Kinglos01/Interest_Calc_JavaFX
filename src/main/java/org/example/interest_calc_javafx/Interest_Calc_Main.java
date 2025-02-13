package org.example.interest_calc_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Interest_Calc_Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Interest_Calc_Main.class.getResource("InterestRate.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 440);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("Drip.css").toExternalForm());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}