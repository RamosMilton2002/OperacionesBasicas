package com.mdrg.opc_clase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void ir(View v){

        Intent x=new Intent(this, SumActivity.class);
        startActivity(x);
    }

    public void re(View v){

        Intent y=new Intent(this, RestaActivity.class);
        startActivity(y);
    }

    public void mul(View v){

        Intent z=new Intent(this, MultiplicacionActivity.class);
        startActivity(z);
    }

    public void div(View v){

        Intent w=new Intent(this, DividirActivity.class);
        startActivity(w);
    }







}