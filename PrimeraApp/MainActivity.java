package com.androidavanzado.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button sumar, restar, masdiez, menosdiez, signos, limpiar;
    TextView texto;
    int num=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sumar = (Button) findViewById(R.id.btnsumar);
        restar = (Button) findViewById(R.id.btnrestar);
        masdiez = (Button) findViewById(R.id.btnDiezmas);
        menosdiez = (Button) findViewById(R.id.btnDiezmenos);
        signos = (Button) findViewById(R.id.btnSigno);
        limpiar = (Button) findViewById(R.id.btnClean);
        texto = (TextView) findViewById(R.id.txt);
        sumar.setOnClickListener(this);
        restar.setOnClickListener(this);
        masdiez.setOnClickListener(this);
        menosdiez.setOnClickListener(this);
        signos.setOnClickListener(this);
        limpiar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnsumar:
                num++;
                texto.setText(num+"");
                break;

            case R.id.btnrestar:
                num--;
                texto.setText(num+"");
                break;

            case R.id.btnDiezmas:
                 num = num + 10;
                 texto.setText(num+"");
                 break;

            case R.id.btnDiezmenos:
                num = num - 10;
                texto.setText(num+"");
                break;

            case R.id.btnSigno:
                num = num - (num*2);
                texto.setText(num+"");
                break;
                
            case R.id.btnClean:
                num = 0;
                texto.setText(num+"");
                break;
        }
    }

}