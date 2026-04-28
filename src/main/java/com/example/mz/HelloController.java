package com.example.mz;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.sqrt;


public class HelloController {

    @FXML
    private TextField wartosca;

    @FXML
    private TextField wartoscb;

    @FXML
    private TextField wartoscc;

    @FXML
    private Label miejscazero;

    @FXML
    private Label delta;


    @FXML
    private void handleCalculate() {
        try {
            double a = Double.parseDouble(wartosca.getText());
            double b = Double.parseDouble(wartoscb.getText());
            double c = Double.parseDouble(wartoscc.getText());

            if (a == 0) {
                delta.setText("To nie jest f. kwadratowa");
                miejscazero.setText("");
                return;

            }

            double d = (b * b) - (4 * a * c);
            delta.setText("Delta = " + d);

            if (d > 0) {
                double m1 = (sqrt(d) - b) / (2 * a);
                double m2 = (sqrt(d) + b) / (2 * a);
                miejscazero.setText("Mz1= " + m1 + " Mz2= " + m2);
            } else if (d == 0) {

                double m0 = (-b / 2 * a);
                miejscazero.setText("Mz0= " + m0);
            } else {
                miejscazero.setText("Nie ma miejsc zerowych, delta<0");
            }


        } catch (NumberFormatException e) {

            delta.setText("Błąd danych!");
            miejscazero.setText("Podaj liczby!");

        }
    }
}