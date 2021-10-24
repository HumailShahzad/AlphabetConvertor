package com.example.incrementapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button) findViewById(R.id.button);
        EditText t1=findViewById(R.id.textView);
        TextView t2=(TextView)findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = t1.getText().toString();

                if (a.length() != 0) {
                    char b = t1.getText().charAt(0);
                    if (b >= 97)//it is small
                    {
                        t2.setText(a.toUpperCase());
                    } else if (b < 97 && b >= 65)
                        t2.setText(a.toLowerCase());
                    //else
                      //  Toast.makeText(MainActivity.this,"You can enter only an alphabet",Toast.LENGTH_LONG).show();
                }
                else
                    t2.setText("");

            }
        });



    }
}