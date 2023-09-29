package com.example.calculadoraac1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double n1, n2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bnt_soma=(Button)findViewById(R.id.btn_soma);
        Button bnt_div=(Button)findViewById(R.id.btn_div);
        Button bnt_multi=(Button)findViewById(R.id.btn_multi);
        Button bnt_sub=(Button)findViewById(R.id.btn_sub);

        TextView resultado=(TextView) findViewById(R.id.resultado);
        EditText valor1=(EditText) findViewById(R.id.valor1);
        EditText valor2=(EditText) findViewById(R.id.valor2);

        bnt_soma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                n1=Double.parseDouble(valor1.getText().toString());
                n2=Double.parseDouble(valor2.getText().toString());
                res=n1+n2;
                resultado.setText(String.valueOf(res));
            }
        });

        bnt_div.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                n1=Double.parseDouble(valor1.getText().toString());
                n2=Double.parseDouble(valor2.getText().toString());
                res=n1/n2;
                resultado.setText(String.valueOf(res));
            }
        });

        bnt_multi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                n1=Double.parseDouble(valor1.getText().toString());
                n2=Double.parseDouble(valor2.getText().toString());
                res=n1*n2;
                resultado.setText(String.valueOf(res));
            }
        });

        bnt_sub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                n1=Double.parseDouble(valor1.getText().toString());
                n2=Double.parseDouble(valor2.getText().toString());
                res=n1-n2;
                resultado.setText(String.valueOf(res));
            }
        });
    }
}