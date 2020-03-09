package com.unisc.exercicio_aula_1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        setTitle("Resultado da Conversão");

        Intent intent = getIntent();
        float valor = intent.getFloatExtra("resposta",0);

        float conversao = ((valor * 9)/5) + 32;
        Log.d("texto","Resposta: " + conversao);

        TextView text = (TextView) findViewById(R.id.textViewTela2);
        text.setText("Valor em Fahreinheit: " + conversao);
    }
}
