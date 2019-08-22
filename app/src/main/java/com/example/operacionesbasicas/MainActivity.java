package com.example.operacionesbasicas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
//1. Importar
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//2. Atributos
    private EditText numero1, numero2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//3.
        numero1 = (EditText)findViewById(R.id.txtnumero1);
        numero2 = (EditText)findViewById(R.id.txtnumero2);
        resultado = (TextView)findViewById(R.id.lblresultado);
    }
//4.
    public void sumar(View view){ //View = clase, view Objeto
        double num1 = Double.parseDouble(numero1.getText().toString());
        double num2 = Double.parseDouble(numero2.getText().toString());
        resultado.setText(String.valueOf(num1+num2));
        resultado.setVisibility(View.VISIBLE);
    }

    public void restar(View view){ //View = clase, view Objeto
        double num1 = Double.parseDouble(numero1.getText().toString());
        double num2 = Double.parseDouble(numero2.getText().toString());
        resultado.setText(String.valueOf(num1-num2));
        resultado.setVisibility(View.VISIBLE);
    }

    public void multiplicar(View view){ //View = clase, view Objeto
        double num1 = Double.parseDouble(numero1.getText().toString());
        double num2 = Double.parseDouble(numero2.getText().toString());
        resultado.setText(String.valueOf(num1*num2));
        resultado.setVisibility(View.VISIBLE);
    }

    public void dividir(View view){ //View = clase, view Objeto
        double num1 = Double.parseDouble(numero1.getText().toString());
        double num2 = Double.parseDouble(numero2.getText().toString());
        resultado.setText(String.valueOf(num1/num2));
        resultado.setVisibility(View.VISIBLE);
    }


}
