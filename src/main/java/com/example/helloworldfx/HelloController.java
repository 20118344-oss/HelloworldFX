package com.example.helloworldfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField inputText;

    @FXML
    private Label resultLabel;

    @FXML
    protected void onCountButtonClick() {
        String text = inputText.getText().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            }
        }

        resultLabel.setText(vowels + " vowels and " + consonants + " consonants");
    }
}