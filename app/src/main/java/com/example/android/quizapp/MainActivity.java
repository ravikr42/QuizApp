package com.example.android.quizapp;

import android.content.Context;


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


    /**
     * This method is called when the Submit Answer button is clicked.
     * This will populate Test Result Score in Toast message
     */
    public void submitAnswer(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Your Total Score: " + scoreBuilder() + "/5";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * This method will return response of question 1
     *
     * @return answer
     */
    public String getQues1Response() {
        EditText text = (EditText) findViewById(R.id.name_question_1_answerBox);
        String answer = text.getText().toString();
        return answer;
    }

    /**
     * This method will return response of question 2 checkbox 1
     *
     * @return isChecked
     */
    public boolean getQues2Option1Response() {
        CheckBox checkBox = (CheckBox) findViewById(R.id.quiz_question_2_chbox_1);
        boolean isChecked = checkBox.isChecked();
        return isChecked;
    }


    /**
     * This method will return response of question 2 checkbox 2
     *
     * @return isChecked
     */
    public boolean getQues2Option2Response() {
        CheckBox checkBox = (CheckBox) findViewById(R.id.quiz_question_2_chbox_2);
        boolean isChecked = checkBox.isChecked();
        return isChecked;
    }

    /**
     * This method will return response of question 2 checkbox 3
     *
     * @return isChecked
     */
    public boolean getQues2Option3Response() {
        CheckBox checkBox = (CheckBox) findViewById(R.id.quiz_question_2_chbox_3);
        boolean isChecked = checkBox.isChecked();
        return isChecked;
    }

    /**
     * This method will return response of question 2
     *
     * @return answer
     */
    public String getQuestion3Response() {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.quiz_question_3_radioBox);
        int selectId = radioGroup.getCheckedRadioButtonId();
        RadioButton button = (RadioButton) findViewById(selectId);
        String answer = button.getText().toString();
        return answer;
    }

    /**
     * This method will return response of question 4 checkbox 1
     *
     * @return isChecked
     */
    public boolean getQues4Option1Response() {
        CheckBox checkBox = (CheckBox) findViewById(R.id.quiz_question_4_chbox_1);
        boolean isChecked = checkBox.isChecked();
        return isChecked;

    }

    /**
     * This method will return response of question 4 checkbox 2
     *
     * @return isChecked
     */
    public boolean getQues4Option2Response() {
        CheckBox checkBox = (CheckBox) findViewById(R.id.quiz_question_4_chbox_2);
        boolean isChecked = checkBox.isChecked();
        return isChecked;

    }

    /**
     * This method will return response of question 4 checkbox 3
     *
     * @return isChecked
     */
    public boolean getQues4Option3Response() {
        CheckBox checkBox = (CheckBox) findViewById(R.id.quiz_question_4_chbox_3);
        boolean isChecked = checkBox.isChecked();
        return isChecked;

    }

    /**
     * This method will return response of question 4 checkbox 4
     *
     * @return isChecked
     */
    public boolean getQues4Option4Response() {
        CheckBox checkBox = (CheckBox) findViewById(R.id.quiz_question_4_chbox_4);
        boolean isChecked = checkBox.isChecked();
        return isChecked;

    }

    /**
     * This method will return response of question 5
     *
     * @return answer
     */
    public String getQuestion5Response() {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.quiz_question_5_radioBox);
        int selectId = radioGroup.getCheckedRadioButtonId();
        RadioButton button = (RadioButton) findViewById(selectId);
        String answer = button.getText().toString();
        return answer;
    }


    /**
     * This method will evaluate the answers submitted and calculate the score obtained
     *
     * @return markesObtained
     */
    public int scoreBuilder() {
        int markesObtained = 0;

        if (getQues1Response().equalsIgnoreCase("James Gosling")) {
            markesObtained++;
        }

        if (getQues2Option1Response() && getQues2Option2Response() && !getQues2Option3Response()) {
            markesObtained++;
        }

        if (getQuestion3Response().equalsIgnoreCase("LowerCase")) {
            markesObtained++;
        }

        if (getQues4Option1Response() && !getQues4Option2Response() && !getQues4Option3Response() && getQues4Option4Response()) {
            markesObtained++;
        }

        if (getQuestion5Response().equalsIgnoreCase("create")) {
            markesObtained++;
        }
        return markesObtained;
    }
}
