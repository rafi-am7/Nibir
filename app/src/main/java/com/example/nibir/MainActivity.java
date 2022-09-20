package com.example.nibir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nibir1,nibir2;
    Button demoButton;
    EditText demoETdd;
    int x=0;
    String y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nibir1 = findViewById(R.id.demoTV);
        nibir2=findViewById(R.id.demo1TV);
        demoButton = findViewById(R.id.demoButton);
        demoETdd = findViewById(R.id.demoET);




        nibir1.setText("welcome");
        nibir2.setText("CSE");

        demoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  x++;
                y = demoETdd.getText().toString();
                nibir1.setText(y);

            }
        });





    }
}