package com.tamanna.webbrowser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etxtUrl;
    Button btnGo,btnFb,btnGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtUrl = findViewById(R.id.etxt_url);

        btnGo = findViewById(R.id.btn_go);
        btnFb = findViewById(R.id.btn_fb);
        btnGoogle= findViewById(R.id.btn_google);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=etxtUrl.getText().toString();
                if(url.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "plz input url", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, WebActivity.class);
                    intent.putExtra("URL",url);
                    startActivity(intent);
                }

            }
        });

        btnFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("URL", "www.facebook.com");
                startActivity(intent);

            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("URL", "www.google.com");
                startActivity(intent);

            }
        });

    }
}
