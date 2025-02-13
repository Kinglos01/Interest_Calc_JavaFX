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
        scene.getStylesheets().add(getClass().getResource("MyStyle.css").toExternalForm());

        stage.setTitle("Interest calculator for dummies");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}