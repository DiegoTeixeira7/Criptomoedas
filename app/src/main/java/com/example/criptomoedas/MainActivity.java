package com.example.criptomoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {
    private TextView response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view) {
        String qtdBtc = ((EditText)findViewById(R.id.qtdBtc)).getText().toString();
        String valueBtc = ((EditText)findViewById(R.id.valueBtc)).getText().toString();

        String qtdEth = ((EditText)findViewById(R.id.qtdEth)).getText().toString();
        String valueEth = ((EditText)findViewById(R.id.valueEth)).getText().toString();

        String qtdXrp = ((EditText)findViewById(R.id.qtdXrp)).getText().toString();
        String valueXrp = ((EditText)findViewById(R.id.valueXrp)).getText().toString();

        double resp = (parseDouble(qtdBtc) * parseDouble(valueBtc)) +
                (parseDouble(qtdEth) * parseDouble(valueEth)) +
                (parseDouble(qtdXrp) * parseDouble(valueXrp));

        response = findViewById(R.id.textResp);
        response.setText("R$" + resp);
    }
}