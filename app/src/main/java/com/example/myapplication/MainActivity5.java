package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    public Button plusItem1, plusItem2, plusItem3, minumItem1, minumItem2, minumItem3, conlcluir, quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        //Botões que vão mudar a quantidade de item respectivamente
        plusItem1 = findViewById(R.id.plusItem1Keyboard);
        plusItem2 = findViewById(R.id.plusItem2Keyboard);
        plusItem3 = findViewById(R.id.plusItem3Keyboard);
        minumItem1 = findViewById(R.id.minunItem1Keyboard);
        minumItem2 = findViewById(R.id.minunItem2Keyboard);
        minumItem3 = findViewById(R.id.minunItem3Keyboard);

        conlcluir = findViewById(R.id.endKeyboard);
        quit =  findViewById(R.id.quitKeyboard);

        //ir para a tela de finalizar compra
        conlcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irTelaFinal();
            }
        });
        //Voltar para a pagina de categorias
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quitCategoria();
            }
        });
    }

    public void irTelaFinal(){
        Intent obj = new Intent(MainActivity5.this, MainActivity6.class);
        startActivity(obj);
    }
    public void quitCategoria(){
        Intent obj = new Intent(MainActivity5.this, MainActivity2.class);
        startActivity(obj);
    }
}