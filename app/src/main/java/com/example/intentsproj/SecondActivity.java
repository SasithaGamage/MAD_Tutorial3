package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    EditText ed1,ed2;
    //String takeExtra;
    Button addBtn,subBtn,multiBtn,diviBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        ed1 = (EditText) findViewById(R.id.editText1);
        ed2 = (EditText) findViewById(R.id.editText2);
        addBtn = findViewById(R.id.button2);
        subBtn = findViewById(R.id.button3);
        multiBtn = findViewById(R.id.button4);
        diviBtn = findViewById(R.id.button5);

        //takeExtra = intent.getStringExtra("NAME1");



    }
    @Override
    protected void onResume() {

        super.onResume();
        ed1.setText(getIntent().getStringExtra("NAME1"));
        ed2.setText(getIntent().getStringExtra("NAME2"));

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String addStr1 = ed1.getText().toString();
                String addStr2 = ed2.getText().toString();

                TextView addAnswer = (TextView)findViewById(R.id.textView5);

                Integer addAns = addCalc(addStr1,addStr2);

                String addCal = String.valueOf(addAns);

                addAnswer.setText(addStr1 + " + " + addStr2 + " = " +addCal);

            }
        });
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String subStr1 = ed1.getText().toString();
                String subStr2 = ed2.getText().toString();

                TextView subAnswer = (TextView)findViewById(R.id.textView5);

                Integer subAns = subCalc(subStr1,subStr2);

                String subCal = String.valueOf(subAns);

                subAnswer.setText(subStr1 + " - " + subStr2 + " = " +subCal);
            }
        });

        multiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String multiStr1 = ed1.getText().toString();
                String multiStr2 = ed2.getText().toString();

                TextView multiAnswer = (TextView)findViewById(R.id.textView5);

                Integer multiAns = multiCalc(multiStr1,multiStr2);

                String multiCal = String.valueOf(multiAns);

                multiAnswer.setText(multiStr1 + " * " + multiStr2 + " = " +multiCal);
            }
        });

        diviBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String divStr1 = ed1.getText().toString();
                String divStr2 = ed2.getText().toString();

                TextView divAnswer = (TextView)findViewById(R.id.textView5);

                Integer divAns = divCalc(divStr1,divStr2);

                String divCal = String.valueOf(divAns);

                divAnswer.setText(divStr1 + " / " + divStr2 + " = " +divCal);
            }
        });
    }

    private Integer addCalc(String addStr1, String addStr2) {
        Integer add1 = Integer.parseInt(addStr1);
        Integer add2 = Integer.parseInt(addStr2);

        return  add1 + add2;
    }
    private Integer subCalc(String subStr1, String subStr2){
        Integer sub1 = Integer.parseInt(subStr1);
        Integer sub2 = Integer.parseInt(subStr2);

        return sub1 - sub2;
    }
    private Integer multiCalc(String multiStr1, String multiStr2){
        Integer multi1 = Integer.parseInt(multiStr1);
        Integer multi2 = Integer.parseInt(multiStr2);

        return multi1 * multi2;
    }
    private Integer divCalc(String divSta1, String divSta2){
        Integer div1 = Integer.parseInt(divSta1);
        Integer div2 = Integer.parseInt(divSta2);

        return div1 / div2;
    }
}