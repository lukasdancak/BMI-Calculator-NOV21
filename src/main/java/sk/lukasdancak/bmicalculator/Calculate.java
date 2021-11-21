package sk.lukasdancak.bmicalculator;

import javax.swing.*;

/**
 * here are methods for calculations
 * */

public class Calculate {
    public static String calculateBmi(Double w, Double h) {
        if (w<0 || h <0) {return "ERROR!";}
        else { return String.valueOf( w/((h/100)*(h/100)) );}
    }

    public static Double getDouble(JTextField textfield) {
         try {
            return Double.parseDouble(textfield.getText());
        } catch (Exception e) {JOptionPane.showMessageDialog(null, "You must enter your height and " +
                "weight correctly"); return -1.0;}
    }
}
