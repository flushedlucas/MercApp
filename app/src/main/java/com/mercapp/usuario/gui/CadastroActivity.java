package com.mercapp.usuario.gui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mercapp.R;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        final Button btnEfetuarCadastro = (Button) findViewById(R.id.btnEfetuarCadastro);

        btnEfetuarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cadastro = new Intent(CadastroActivity.this, LoginActivity.class);
                startActivity(cadastro);
            }
        });



    }

    public void cadastrar(){
        finish();
    }
}
