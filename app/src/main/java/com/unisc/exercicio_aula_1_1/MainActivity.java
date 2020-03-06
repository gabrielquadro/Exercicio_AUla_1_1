package com.unisc.exercicio_aula_1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Conversor de Temperatura");
    }

    public void ConverterTemp(View view) {
        Log.d("texto","clciou");
        EditText edit = (EditText) findViewById(R.id.editText);
        Editable resposta = edit.getText();
        float intResposta = Float.parseFloat(String.valueOf(resposta));

        Intent intent = new Intent (this, Tela2.class);
        intent.putExtra("resposta",intResposta);
        startActivity(intent);


    }



}
