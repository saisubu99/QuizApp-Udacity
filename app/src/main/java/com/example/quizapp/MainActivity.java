package com.example.quizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    int points = 0;
    /*
    Method for the submit button
     */

    public void submit(View view) {


        /*
        If condition for checking the answer for the first question
         */
        RadioButton question1_ans1 = findViewById(R.id.question1_ans1);
        RadioButton question1_ans2 = findViewById(R.id.question1_ans2);
        RadioButton question1_ans3 = findViewById(R.id.question1_ans3);
        RadioButton question1_ans4 = findViewById(R.id.question1_ans4);

        if (!question1_ans1.isChecked() && !question1_ans2.isChecked() && question1_ans3.isChecked() && !question1_ans4.isChecked()) {
            points += 10;
            question1_ans3.setBackgroundColor(Color.GREEN);
        } else if (question1_ans1.isChecked()) {
            question1_ans1.setBackgroundColor(Color.RED);
            question1_ans3.setBackgroundColor(Color.GREEN);
        } else if (question1_ans2.isChecked()) {
            question1_ans2.setBackgroundColor(Color.RED);
            question1_ans3.setBackgroundColor(Color.GREEN);

        } else if (question1_ans4.isChecked()) {
            question1_ans4.setBackgroundColor(Color.RED);
            question1_ans3.setBackgroundColor(Color.GREEN);
        }
        RadioButton question2_ans1 = findViewById(R.id.question2_ans1);
        RadioButton question2_ans2 = findViewById(R.id.question2_ans2);
        RadioButton question2_ans3 = findViewById(R.id.question2_ans3);
        RadioButton question2_ans4 = findViewById(R.id.question2_ans4);
        /*
        If condition for checking the answer for the second question
         */

        if (!question2_ans1.isChecked() && question2_ans2.isChecked() && !question2_ans3.isChecked() && !question2_ans4.isChecked()) {
            points += 10;
            question2_ans2.setBackgroundColor(Color.GREEN);
        } else if (question2_ans1.isChecked()) {
            question2_ans1.setBackgroundColor(Color.RED);
            question2_ans2.setBackgroundColor(Color.GREEN);
        } else if (question2_ans3.isChecked()) {
            question2_ans3.setBackgroundColor(Color.RED);
            question2_ans2.setBackgroundColor(Color.GREEN);

        } else if (question2_ans4.isChecked()) {
            question2_ans4.setBackgroundColor(Color.RED);
            question2_ans2.setBackgroundColor(Color.GREEN);
        }

        EditText ans3 = findViewById(R.id.text1);
        String Correct3 = ans3.getText().toString().trim();
        /*
        If condition for checking the answer for the third question
         */
        if (Correct3.equalsIgnoreCase("Satyameva Jayate")) {
            points += 10;
            ans3.setBackgroundColor(Color.GREEN);
        } else {
            ans3.setBackgroundColor(Color.RED);
        }
        EditText ans4 = findViewById(R.id.text2);
        String Correct4 = ans4.getText().toString().trim();
        /*
        If condition for checking the answer for the fourth question
         */
        if (Correct4.equalsIgnoreCase("Jana Gana Mana")) {
            points += 10;
            ans4.setBackgroundColor(Color.GREEN);
        } else {
            ans4.setBackgroundColor(Color.RED);
        }
        // Check which radio button was clicked
        RadioButton YesRadioButton = findViewById(R.id.yes_radio_button);
        RadioButton NoRadioButton = findViewById(R.id.no_radio_button);
        /*
        If condition for checking the answer for the fifth question
         */
        if (YesRadioButton.isChecked()) {
            points += 10;
            YesRadioButton.setBackgroundColor(Color.GREEN);
        } else if (NoRadioButton.isChecked()) {
            NoRadioButton.setBackgroundColor(Color.RED);
        }

        CheckBox question6_ans1 = findViewById(R.id.question6_ans1);
        CheckBox question6_ans2 = findViewById(R.id.question6_ans2);
        CheckBox question6_ans3 = findViewById(R.id.question6_ans3);
        CheckBox question6_ans4 = findViewById(R.id.question6_ans4);
/*
        If condition for checking the answer for the sixth question
         */
        if (question6_ans1.isChecked() && !question6_ans2.isChecked() && question6_ans3.isChecked() && question6_ans4.isChecked()) {
            points += 10;
            question6_ans1.setBackgroundColor(Color.GREEN);
            question6_ans3.setBackgroundColor(Color.GREEN);
            question6_ans4.setBackgroundColor(Color.GREEN);
        } else if (question6_ans2.isChecked()) {

            question6_ans2.setBackgroundColor(Color.RED);
        } else if (question6_ans2.isChecked()) {

            question6_ans2.setBackgroundColor(Color.RED);
        }
        /*
        If condition for checking the answer to display the final Toast
         */

        if (points < 30) {
            String Pointsmessage = "Total points: " + points + " Try again";
            Toast.makeText(this, Pointsmessage, Toast.LENGTH_SHORT).show();
            points = 0;
        } else if (points > 30 && points < 60) {
            String Pointsmessage = "Total points: " + points + " You are almost there. Keep Trying :)";
            Toast.makeText(this, Pointsmessage, Toast.LENGTH_SHORT).show();
            points = 0;
        } else {
            String Pointsmessage = "Total points: " + points + " Well done Champ !!!";
            Toast.makeText(this, Pointsmessage, Toast.LENGTH_SHORT).show();
            points = 0;
        }
        points = 0;
    }

    public void retake(View view) {
        points = 0;
        RadioGroup question1 = findViewById(R.id.question1);
        RadioButton question1_ans1 = findViewById(R.id.question1_ans1);
        question1_ans1.setBackgroundColor(Color.TRANSPARENT);
        RadioButton question1_ans2 = findViewById(R.id.question1_ans2);
        question1_ans2.setBackgroundColor(Color.TRANSPARENT);
        RadioButton question1_ans3 = findViewById(R.id.question1_ans3);
        question1_ans3.setBackgroundColor(Color.TRANSPARENT);
        RadioButton question1_ans4 = findViewById(R.id.question1_ans4);
        question1_ans4.setBackgroundColor(Color.TRANSPARENT);
        question1.clearCheck();

        RadioGroup question2 = findViewById(R.id.question2);
        RadioButton question2_ans1 = findViewById(R.id.question2_ans1);
        question2_ans1.setBackgroundColor(Color.TRANSPARENT);
        RadioButton question2_ans2 = findViewById(R.id.question2_ans2);
        question2_ans2.setBackgroundColor(Color.TRANSPARENT);
        RadioButton question2_ans3 = findViewById(R.id.question2_ans3);
        question2_ans3.setBackgroundColor(Color.TRANSPARENT);
        RadioButton question2_ans4 = findViewById(R.id.question2_ans4);
        question2_ans4.setBackgroundColor(Color.TRANSPARENT);
        question2.clearCheck();

        EditText ans3 = findViewById(R.id.text1);
        ans3.getText().clear();
        ans3.setBackgroundColor(Color.TRANSPARENT);
        EditText ans4 = findViewById(R.id.text2);
        ans4.getText().clear();
        ans4.setBackgroundColor(Color.TRANSPARENT);

        RadioButton YesRadioButton = findViewById(R.id.yes_radio_button);
        RadioButton NoRadioButton = findViewById(R.id.no_radio_button);
        RadioGroup question5 = findViewById(R.id.question5);
        question5.clearCheck();
        YesRadioButton.setBackgroundColor(Color.TRANSPARENT);
        NoRadioButton.setBackgroundColor(Color.TRANSPARENT);

        CheckBox question6_ans1 = findViewById(R.id.question6_ans1);
        CheckBox question6_ans2 = findViewById(R.id.question6_ans2);
        CheckBox question6_ans3 = findViewById(R.id.question6_ans3);
        CheckBox question6_ans4 = findViewById(R.id.question6_ans4);
        if (question6_ans1.isChecked() || !question6_ans1.isChecked()) {
            question6_ans1.setChecked(false);
            question6_ans1.setBackgroundColor(Color.TRANSPARENT);
        }

        if (question6_ans2.isChecked() || !question6_ans2.isChecked()) {
            question6_ans2.setChecked(false);
            question6_ans2.setBackgroundColor(Color.TRANSPARENT);
        }
        if (question6_ans3.isChecked() || !question6_ans3.isChecked()) {
            question6_ans3.setChecked(false);
            question6_ans3.setBackgroundColor(Color.TRANSPARENT);
        }
        if (question6_ans4.isChecked() || !question6_ans4.isChecked()) {
            question6_ans4.setChecked(false);
            question6_ans4.setBackgroundColor(Color.TRANSPARENT);
        }
    }

}



