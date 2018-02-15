package com.example.awesomefat.csc548_spring2018_baseconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DecimalToBase extends AppCompatActivity {

    private EditText inputET;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal_to_base);

        this.inputET = (EditText) this.findViewById(R.id.inputET);
        this.answerTV = (TextView) this.findViewById(R.id.answerTV);
    }

    public void base2ButtonPressed(View v) {

        String B2 = "";
        String sValue = this.inputET.getText().toString();
        int i = Integer.parseInt(sValue);
        Integer remainder = 0;
        while (i > 0) {
            remainder = i % 2;
            i = i / 2;
            B2 = remainder.toString() + B2;
        }
        this.answerTV.setText("" + B2);


    }

    public void base8ButtonPressed(View v) {

        String B8 = "";
        String sValue = this.inputET.getText().toString();
        int i = Integer.parseInt(sValue);
        Integer remainder = 0;
        while (i > 0) {
            remainder = i % 8;
            i = i / 8;
            B8 = remainder.toString() + B8;
        }
        this.answerTV.setText("" + B8);
    }


    public void base10ButtonPressed(View v) {

        String B10 = "";
        String sValue = this.inputET.getText().toString();
        int i = Integer.parseInt(sValue);
        Integer remainder = 0;
        while (i > 0) {
            remainder = i % 10;
            i = i / 10;
            B10 = remainder.toString() + B10;
        }
        this.answerTV.setText("" + B10);
    }



    public void base16ButtonPressed(View v) {
        String map = "0123456789ABCDEF";
        String B16 = "";
        String sValue = this.inputET.getText().toString();
        int i = Integer.parseInt(sValue);
        Integer remainder = 0;
        Character F = '0';
        while (i > 0) {
            remainder = i % 16;

            i = i / 16;
            F = map.charAt(remainder);
            B16 = F.toString() + B16;
        }
        this.answerTV.setText("" + B16);


    }
}



