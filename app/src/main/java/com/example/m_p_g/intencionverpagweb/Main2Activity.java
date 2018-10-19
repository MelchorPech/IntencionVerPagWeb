package com.example.m_p_g.intencionverpagweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    WebView web1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnFinalizar;
        web1 = (WebView) findViewById(R.id.webView);

        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("direccion");
        web1.loadUrl("http://" + dato);


        btnFinalizar=(Button)findViewById(R.id.btnF);
        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalizar(v);
            }
        });
    }

    public void finalizar(View v) {
        finish();
    }
}
