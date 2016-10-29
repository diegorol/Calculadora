package com.example.usuario.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

        char operator;
        float acumulado;
        private TextView oper1,oper2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addNumber(View view) {
        TextView Screen = (TextView)findViewById(R.id.resultado);
        Button buttonPushed = (Button) view;
        if(Screen.getText().equals(getString(R.string.initScreen))){
            Screen.setText("");
        }

        Screen.append(buttonPushed.getText());
    }

    public void addDot(View view) {
        TextView Screen = (TextView)findViewById(R.id.resultado);
        Button buttonPushed = (Button) view;
        String screenText = Screen.getText().toString();
        if(screenText.indexOf(".") == -1){
            Screen.append(buttonPushed.getText());
        }
    }


    public void clearNumber(View view) {
        TextView Screen = (TextView)findViewById(R.id.resultado);
        Screen.setText("");
    }

    public void addSuma(View view) {
        oper1=(TextView)findViewById(R.id.resultado);
        acumulado=Float.parseFloat(oper1.getText().toString());
        TextView Screen = (TextView)findViewById(R.id.resultado);
        Screen.setText("");
        operator = '+';
    }

    public void totalOperacion(View view) {
        if(operator== '+'){
            oper2=(TextView)findViewById(R.id.resultado);
            acumulado += Float.parseFloat(oper2.getText().toString());
            TextView Screen = (TextView)findViewById(R.id.resultado);
            Screen.setText("" + acumulado);
        }

        if(operator== '*'){
            oper2=(TextView)findViewById(R.id.resultado);
            acumulado *= Float.parseFloat(oper2.getText().toString());
            TextView Screen = (TextView)findViewById(R.id.resultado);
            Screen.setText("" + acumulado);
        }

        if(operator== '-'){
            oper2=(TextView)findViewById(R.id.resultado);
            acumulado -= Float.parseFloat(oper2.getText().toString());
            TextView Screen = (TextView)findViewById(R.id.resultado);
            Screen.setText("" + acumulado);
        }
    }

    public void productoTotal(View view) {
        oper1=(TextView)findViewById(R.id.resultado);
        acumulado=Float.parseFloat(oper1.getText().toString());
        TextView Screen = (TextView)findViewById(R.id.resultado);
        Screen.setText("");
        operator = '*';
    }

    public void restaTotal(View view) {
        oper1=(TextView)findViewById(R.id.resultado);
        acumulado=Float.parseFloat(oper1.getText().toString());
        TextView Screen = (TextView)findViewById(R.id.resultado);
        Screen.setText("");
        operator = '-';
    }
}
