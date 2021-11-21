package sk.lukasdancak.bmicalculator;

import javax.swing.*;

public class Calculate {
    public static String calculateBmi(Double w, Double h) {
        return String.valueOf( w/((h/100)*(h/100)) );
    }

    public static Double getDouble(JTextField textfield) {
        return Double.parseDouble(textfield.getText());
    }
}
