package com.example.m_p_g.intencionverpagweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    EditText edtURL;
    Button btnVerPagina;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnVerPagina =(Button) findViewById(R.id.btnVer);
        edtURL=(EditText) findViewById(R.id.edtDireccion);


        btnVerPagina.setOnClickListener(new View.OnClickListener() {
        @Override
           public void onClick(View v) {
                ejecutar(v);
            }
        });
    }
    public void ejecutar(View view) {
        Intent i = new Intent(getBaseContext(),Main2Activity.class);
        i.putExtra("direccion", edtURL.getText().toString());
        startActivity(i);
    }
}
