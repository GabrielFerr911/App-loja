package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Criando as variaveis
    public Button btnInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInicio = (Button) findViewById(R.id.inicialButtonEnter);
        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trocarTela();
            }
        });
    }
    //Criando o metodo que irá trocar as telas
    public void trocarTela(){
        //Dentro do segundo Intent você irá aplicar dois parametros da onde você está saindo para aonde você quer ir
        Intent obj = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(obj);
    }
}