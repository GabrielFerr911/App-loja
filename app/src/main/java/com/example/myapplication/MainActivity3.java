package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    public Button plusItem1, plusItem2, plusItem3, minumItem1, minumItem2, minumItem3, conlcluir, quit;
    public EditText quantItem1K, quantItem2K, quantItem3K;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //Botões que vão mudar a quantidade de item respectivamente
        plusItem1 = findViewById(R.id.plusItem1Monitor);
        plusItem2 = findViewById(R.id.plusItem2Monitor);
        plusItem3 = findViewById(R.id.plusItem3Monitor);
        minumItem1 = findViewById(R.id.minunItem1Monitor);
        minumItem2 = findViewById(R.id.minunItem2Monitor);
        minumItem3 = findViewById(R.id.minunItem3Monitor);

        //Aplicando as variaveis nos edit text
        quantItem1K = findViewById(R.id.quantItem1Monitores);
        quantItem2K = findViewById(R.id.quantItem2Monitores);
        quantItem3K = findViewById(R.id.quantItem3Monitores);


        conlcluir = findViewById(R.id.endMonitor);
        quit =  findViewById(R.id.quitMonitor);

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

       //Aumentar a quantidade de itens com os botões
        plusItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float quantItem1 = Float.parseFloat(quantItem1K.getText().toString());
                quantItem1K.setText(String.valueOf(quantItem1 + 1));
            }
        });

        plusItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float quantItem2 = Float.parseFloat(quantItem2K.getText().toString());
                quantItem2K.setText(String.valueOf(quantItem2 + 1));
            }
        });
        plusItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float quantItem3 = Float.parseFloat(quantItem3K.getText().toString());
                quantItem3K.setText(String.valueOf(quantItem3 + 1));
            }
        });


        //Diminuir o valor dos itens que você quer comprar
        minumItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float quantItem1 = Float.parseFloat(quantItem1K.getText().toString());
                quantItem1K.setText(String.valueOf(quantItem1 - 1));
                if(quantItem1 < 1){
                    quantItem1K.setText(String.valueOf(0));
                }
            }
        });
        minumItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float quantItem2 = Float.parseFloat(quantItem2K.getText().toString());
                quantItem2K.setText(String.valueOf(quantItem2 - 1));
                if(quantItem2 < 1){
                    quantItem2K.setText(String.valueOf(0));
                }
            }
        });
        minumItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float quantItem3 = Float.parseFloat(quantItem3K.getText().toString());
                quantItem3K.setText(String.valueOf(quantItem3 - 1));
                if(quantItem3 < 1){
                    quantItem3K.setText(String.valueOf(0));
                }
            }
        });
    }




    public void irTelaFinal(){
        Intent obj = new Intent(MainActivity3.this, MainActivity6.class);
        startActivity(obj);
    }
    public void quitCategoria(){
        Intent obj = new Intent(MainActivity3.this, MainActivity2.class);
        startActivity(obj);
    }
}