package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    public Button categoryPc, categoryKeyboard, categoryMonitor, quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //atribuindo valor as variaveis
        categoryPc =(Button) findViewById(R.id.catergoryPc);
        categoryKeyboard = (Button) findViewById(R.id.categoryKeyboard);
        categoryMonitor = (Button) findViewById(R.id.categoryMonitor);
        quit = (Button) findViewById(R.id.categoryQuit);

        //ir para categoria pc
        categoryPc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irCategoriaPc();
            }
        });

        //ir para categoria teclado
        categoryKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irCategoriaTeclado();
            }
        });

        //ir para categoria monitores
        categoryMonitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irCategoriaMonitores();
            }
        });

        //voltar para tela anterior
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voltar();
            }
        });
    }

    public void irCategoriaPc(){
        Intent obj = new Intent(MainActivity2.this, MainActivity4.class);
        startActivity(obj);
    }
    public  void irCategoriaTeclado(){
        Intent obj = new Intent(MainActivity2.this, MainActivity5.class);
        startActivity(obj);
    }
    public void irCategoriaMonitores(){
        Intent obj = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(obj);
    }
    public void voltar(){
        Intent obj = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(obj);
    }
}