package com.example.cdevise;


import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    float a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    void convertUsdTotnd()
    {  EditText usd= (EditText) findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText  tnd=(EditText) findViewById(R.id.tnd);
        tnd.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(usd.getText().toString());
        double result=a*3;
        tnd.setText(String.valueOf(result));

    }

    void convertBdtToUsd()
    {  EditText usd= (EditText) findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  tnd=(EditText) findViewById(R.id.tnd);
        tnd.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(tnd.getText().toString());
        double result=a/3;
        usd.setText(String.valueOf(result));
    }

    public void click(View view)
    {
        convertUsdTotnd();
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(false);
    }

    public void reset(View view)
    {
        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(true);
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(true);
        EditText usd= (EditText) findViewById(R.id.usd);
        EditText  bdt=(EditText) findViewById(R.id.tnd);
        usd.setText("");
        bdt.setText("");

    }

    public void click2(View view)
    {
        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(false);
        convertBdtToUsd();
    }



}
