package com.example.converionkgtopounds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText editTextNumber;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn);
        editTextNumber=findViewById(R.id.editTextNumber);
        textView=findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //for user input in kilos
                String inputText = editTextNumber.getText().toString();
                //converting string into double
                double kilos = Double.parseDouble(inputText);
                //conerting kilos into pounds
                double pounds = con(kilos);
                //displaying result
                textView.setText(""+ pounds);
            }
        });

    }

    public double con(double kilos){
        //1kilo= 2.0462 pounds
        return kilos*2.205;
    }
}