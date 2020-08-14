package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.Toast;


public class FirstActivity extends AppCompatActivity {

    Button btn;
    //String myExtra = "text";
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btn = findViewById(R.id.button);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
    }

    @Override
    protected void onResume() {

        super.onResume();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);


                Context context = getApplicationContext();

                CharSequence message = "You just clicked the ok button";

                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context ,message,duration);
                toast.show();
                toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);

                String nameValue1 = editText1.getText().toString();
                String nameValue2 = editText2.getText().toString();

                intent.putExtra("NAME1", nameValue1);
                intent.putExtra("NAME2",nameValue2);
                startActivity(intent);
            }
        });



    }

}