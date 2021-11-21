package sk.lukasdancak.bmicalculator;

import javax.swing.*;
import java.awt.*;

public class GuiBmiCalculator {

    GuiBmiCalculator(){
        JFrame frameBmiCalculator = new JFrame("BMI Calculator v. NOV 2021");

        JPanel panelBmiCalculator = new JPanel();
        panelBmiCalculator.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panelBmiCalculator.setLayout(new GridLayout(10,1));

        frameBmiCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameBmiCalculator.add(panelBmiCalculator);
        frameBmiCalculator.pack(); // 65  The pack method sizes the frame so that all its contents are at or above their preferred sizes.
        frameBmiCalculator.setVisible(true);

        JButton btCalculate = new JButton("Calculate");
        panelBmiCalculator.add(btCalculate);

        // text field for height
        JLabel weightLabel = new JLabel("Input your weight in kg:");
        panelBmiCalculator.add(weightLabel);

        // text field for weight
        JTextField weightText = new JTextField("e.g.: 85");
        panelBmiCalculator.add(weightText);

        // label for height
        JLabel heightLabel = new JLabel("Input our weight in cm:");
        panelBmiCalculator.add(heightLabel);

        // text field for height
        JTextField heightText = new JTextField("e.g.: 180");
        panelBmiCalculator.add(heightText);

        // label with answer INTRO
        JLabel answerLabel = new JLabel("Your calculated BMI is:");
        panelBmiCalculator.add(answerLabel);
        answerLabel.setHorizontalAlignment(JLabel.CENTER);

        // label with answer
        JLabel calculationLabel = new JLabel("Insert data an press CALCULATE button");
        calculationLabel.setForeground(Color.red);
        panelBmiCalculator.add(calculationLabel);








    }
}
