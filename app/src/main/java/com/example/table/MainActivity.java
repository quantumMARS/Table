package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button;
TextView textView2;
EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =findViewById(R.id.button);
        textView2=findViewById(R.id.textView2);
        e=findViewById(R.id.e);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText("");
                Toast.makeText(MainActivity.this, "Thanks", Toast.LENGTH_SHORT).show();
                int k=Integer.parseInt(e.getText().toString());
                for(int i=1;i<=10;i++){
                    textView2.append(k+"x"+i+"="+(k*i)+"\n");
                }
            }
        });

    }
}