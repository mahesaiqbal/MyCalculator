package com.mahesaiqbal.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public String str ="";
    Character op = 'q';
    float i, num, numtemp;
    EditText showResult;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showResult = (EditText) findViewById(R.id.result_id);

    }
    public void one(View v){
        insert(1);
    }

    public void two(View v){
        insert(2);
    }

    public void three(View v){
        insert(3);
    }

    public void four(View v){
        insert(4);
    }

    public void five(View v){
        insert(5);
    }

    public void six(View v){
        insert(6);
    }

    public void seven(View v){
        insert(7);

    }

    public void eight(View v){
        insert(8);
    }

    public void nine(View v){
        insert(9);
    }

    public void plus(View v){
        perform();
        op = '+';
    }

    public void minus(View v){
        perform();
        op = '-';
    }

    public void division(View v){
        perform();
        op = '/';
    }

    public void multiplication(View v){
        perform();
        op = '*';
    }

    public void equal(View v){
        calculate();
    }

    public void clear(View v){
        reset();
    }

    private void reset() {
        // TODO Auto-generated method stub
        str ="";
        op ='q';
        num = 0;
        numtemp = 0;
        showResult.setText("");
    }

    private void insert(int j) {
        // TODO Auto-generated method stub
        str = str + Integer.toString(j);
        num = Integer.valueOf(str).intValue();
        showResult.setText(str);
    }

    private void perform() {
        // TODO Auto-generated method stub
        str = "";
        calculateNoShow();
        numtemp = num;
    }

    private void calculate() {
        // TODO Auto-generated method stub
        if(op == '+')
            num = numtemp+num;
        else if(op == '-')
            num = numtemp-num;
        else if(op == '/')
            num = numtemp/num;
        else if(op == '*')
            num = numtemp*num;
        showResult.setText(""+num);
    }

    private void calculateNoShow() {
        // TODO Auto-generated method stub
        if(op == '+')
            num = numtemp+num;
        else if(op == '-')
            num = numtemp-num;
        else if(op == '/')
            num = numtemp/num;
        else if(op == '*')
            num = numtemp*num;
    }

}
