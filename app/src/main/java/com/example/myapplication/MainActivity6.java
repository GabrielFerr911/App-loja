package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {
    public Button finalizar, quitFinalizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        finalizar = findViewById(R.id.finalizeButton);
        quitFinalizar = findViewById(R.id.cancelBuy);

        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        quitFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sairFinalizar();
            }
        });
    }
    public void sairFinalizar(){
        Intent obj = new Intent(MainActivity6.this, MainActivity2.class);
        startActivity(obj);
    }
}