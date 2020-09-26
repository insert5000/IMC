package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    public  void calcularOnClick(View v){

        EditText editPeso = (EditText) findViewById(R.id.txt_peso);
        TextView editAltura = (TextView) findViewById(R.id.txt_altura);

        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());

        Intent i = new Intent(this, Recomendacion.class);
        i.putExtra("peso",peso);
        i.putExtra("altura",altura);
        startActivity(i);

    }
}