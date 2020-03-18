package com.example.android.milepeale.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.milepeale.R;
import com.example.android.milepeale.model.Model;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity {

    private Model model = new Model();

    EditText insertText;
    TextView showText;
    Button clickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertText = (EditText) findViewById(R.id.insertText);
        insertText.setText(model.getData());

        showText = (TextView) findViewById(R.id.showText);
        showText.setText(model.getData());

        clickMe = (Button) findViewById(R.id.clickMe);

        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showText.setText(insertText.getText().toString());

            }
        });
    }

    private void observeModel(Model model) {
        model.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                if (o instanceof Model) {
                    String data = ((Model) o).getData();
                    TextView showText = (TextView) findViewById(R.id.showText);
                    showText.setText(data);
                }
            }
        });
    }

    public void enterInput(View view) {

        EditText insertText = (EditText) findViewById(R.id.insertText);
        TextView showText = (TextView) findViewById(R.id.showText);

        String input = insertText.getText().toString();
        model.setData(input);
        showText.setText(model.getData());

    }
}


