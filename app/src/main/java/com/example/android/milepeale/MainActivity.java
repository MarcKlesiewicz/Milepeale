package com.example.android.milepeale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText insertText;
    TextView showText;
    Button clickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertText = (EditText)findViewById(R.id.insertText);
        showText = (TextView)findViewById(R.id.showText);
        clickMe = (Button)findViewById(R.id.clickMe);

        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showText.setText(insertText.getText().toString());


            }
        });






    }
}
