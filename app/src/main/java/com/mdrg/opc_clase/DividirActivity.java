package com.mdrg.opc_clase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DividirActivity extends AppCompatActivity {
    EditText edNum1,edNum2,edResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dividir);
        edNum1=findViewById(R.id.txtNumD1);
        edNum2=findViewById(R.id.txtNumD2);
        edResultado=findViewById(R.id.txtTotal4);
    }
    public void Dividir(View v){
        double n1=Double.parseDouble(edNum1.getText().toString());
        double n2=Double.parseDouble(edNum2.getText().toString());
        double resultado=n1/n2;
        edResultado.setText(resultado+"");


    }
}