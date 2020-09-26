package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Recomendacion extends AppCompatActivity {

    TextView txtImc,txtReco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomendacion);
    txtImc = (TextView)findViewById(R.id.txt_Imc);
    txtReco = (TextView)findViewById(R.id.txt_recomendacion);

        Intent i = getIntent();
        double altura = i.getDoubleExtra("altura",0);
        double peso = i.getDoubleExtra("peso",0);
        double imc = (peso/Math.pow(altura,2));
        txtImc.setText(String.valueOf(imc));

         if(imc<18.5){ txtReco.setText(R.string.texto1);}
        else if(imc>=18.5 && imc<=24.9){txtReco.setText(R.string.texto2);}
        else if(imc>=24.9 && imc<=29.9){txtReco.setText(R.string.texto3);}
        else if(imc>30){
            txtReco.setText(R.string.texto4);
        }
    }
}