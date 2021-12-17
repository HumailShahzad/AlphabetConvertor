package com.example.incrementapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import androidx.appcompat.widget.Toolbar;
public class MainActivity extends AppCompatActivity {
    Toolbar myToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button) findViewById(R.id.button);
        EditText t1=findViewById(R.id.textView);
        TextView t2=(TextView)findViewById(R.id.textView2);
        myToolbar = (Toolbar) findViewById(R.id.toolbar3);
        setSupportActionBar(myToolbar);
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
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/"));
                startActivity(intent);
            case R.id.action_tasks:
                Intent intent1 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/HumailShahzad/Assignment3.git"));
                startActivity(intent1);

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}