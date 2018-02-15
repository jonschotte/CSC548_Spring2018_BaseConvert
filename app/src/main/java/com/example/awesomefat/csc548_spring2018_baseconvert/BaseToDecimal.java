package com.example.awesomefat.csc548_spring2018_baseconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class BaseToDecimal extends AppCompatActivity
{
    private EditText inputET;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_to_decimal);

        this.inputET = (EditText)this.findViewById(R.id.inputET);
        this.answerTV = (TextView)this.findViewById(R.id.answerTV);
    }


    public void base2ButtonPressed(View v)
    {

        String B2 = this.inputET.getText().toString();
        int decimal = 0;
        int power = 0;
        while(B2.length()>0)
        {
            int i = Integer.parseInt(B2.charAt((B2.length())-1)+"");
            decimal += i * Math.pow(2, power++);
            B2 = B2.substring(0,B2.length()-1);
        }
        this.answerTV.setText("" + decimal);
    }


    public void base8ButtonPressed(View v)
    {

        String B8 = this.inputET.getText().toString();
        int decimal = 0;
        int power = 0;
        while(B8.length()>0)
        {
            int i = Integer.parseInt(B8.charAt((B8.length())-1)+"");
            decimal += i * Math.pow(8, power++);
            B8 = B8.substring(0,B8.length()-1);
        }
        this.answerTV.setText("" + decimal);
    }

    public void base10ButtonPressed(View v)
    {

        String B10 = this.inputET.getText().toString();
        int decimal = 0;
        int power = 0;
        while(B10.length()>0)
        {
            int i = Integer.parseInt(B10.charAt((B10.length())-1)+"");
            decimal += i * Math.pow(10, power++);
            B10 = B10.substring(0,B10.length()-1);
        }

        this.answerTV.setText("" + decimal);
    }

    public void base16ButtonPressed(View v)
    {
        String map = "0123456789ABCDEF";
        String S = this.inputET.getText().toString();


        String digits = "0123456789ABCDEF";

        S = S.toUpperCase();
        int B16 = 0;
        for (int i = 0; i < S.length(); i++) {
            char C = S.charAt(i);
            int D = digits.indexOf(C);
            B16 = 16 * B16 + D;
        }
        this.answerTV.setText("" + B16);
    }
}
