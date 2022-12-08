package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    public Button plusItem1, plusItem2, plusItem3, minumItem1, minumItem2, minumItem3, conlcluir, quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //Botões que vão mudar a quantidade de item respectivamente
        plusItem1 = findViewById(R.id.plusItem1PC);
        plusItem2 = findViewById(R.id.plusItem2PC);
        plusItem3 = findViewById(R.id.plusItem3PC);
        minumItem1 = findViewById(R.id.minunItem1PC);
        minumItem2 = findViewById(R.id.minunItem2PC);
        minumItem3 = findViewById(R.id.minunItem3PC);

        conlcluir = findViewById(R.id.endPC);
        quit =  findViewById(R.id.quitPC);

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
        Intent obj = new Intent(MainActivity4.this, MainActivity6.class);
        startActivity(obj);
    }
    public void quitCategoria(){
        Intent obj = new Intent(MainActivity4.this, MainActivity2.class);
        startActivity(obj);
    }
}