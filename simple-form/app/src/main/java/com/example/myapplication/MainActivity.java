package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setText(View view){
        //Untuk EditText
        final EditText editTextNama = findViewById(R.id.inputName);
        final EditText editTextEmail = findViewById(R.id.inputEmail);
        final EditText editTextNoTelp = findViewById(R.id.inputPhone);

        //Untuk Button
        final Button tombol = findViewById(R.id.button);

        //Untuk TextView
        final TextView textName = findViewById(R.id.setTextName);
        final TextView textEmail = findViewById(R.id.setTextEmail);
        final TextView textPhone = findViewById(R.id.setTextPhone);

        // Ketika Tombol Diklik
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Variabel" yang isinya diambil dari isi setiap editText
                final String textValueNama = editTextNama.getText().toString();
                final String textValueEmail = editTextEmail.getText().toString();
                final String textValueNoTelp = editTextNoTelp.getText().toString();

                // Ganti text jadi isi yang udah diambil dari setiap editText
                textName.setText(textValueNama);
                textEmail.setText(textValueEmail);
                textPhone.setText(textValueNoTelp);
            }
        });
    }
}