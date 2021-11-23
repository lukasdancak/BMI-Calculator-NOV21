package sk.lukasdancak.bmicalculator;

import javax.swing.*;

/**
 * @author Lukas Dancak SVK
 * here are methods for calculations
 * */

public class Calculate {

    // return string with BM index + category description
    public static String calculateBmi(Double w, Double h) {
        if (w<0 || h <0) {return "ERROR!";}
        else {  String result ="";
                double d =  w/((h/100)*(h/100));
                 result = result +  String.valueOf( Math.round(d*10.0)/10.0 ) ;
                 result = result+" => "+ Calculate.info(d);
                return result;  }
    }

    // return bmi category description
    private static String info(double d) {
            if(d<16.0){ return "Underweight (Severe thinness) [ < 16.0 ]"; }
            else if(d <17.0) { return "Underweight (Moderate thinness) [ 16.0 – 16.9 ]";}
            else if( d <18.5) { return "Underweight (Mild thinness) [ 17.0 – 18.4 ]";}
            else if(d <25.5) { return "Normal range [ 18.5 – 24.9 ]";}
            else if(d <30.0) { return "Overweight (Pre-obese) [ 25.0 – 29.9 ]";}
            else if(d <35) { return "Obese (Class I) [ 30.0 – 34.9 ]";}
            else if(d <40) { return "Obese (Class II) [ 35.0 – 39.9 ]";}
            else { return "Obese (Class III) [ ≥ 40.0 ]";}
    }

    // return double from JTextField
    public static Double getDouble(JTextField textfield) {
         try {
            return Double.parseDouble(textfield.getText());
        } catch (Exception e) {JOptionPane.showMessageDialog(null, "You must enter your height and " +
                "weight correctly"); return -1.0;}
    }
}
