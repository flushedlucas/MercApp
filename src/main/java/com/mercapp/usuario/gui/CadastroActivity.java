package com.mercapp.usuario.gui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mercapp.R;

public class CadastroActivity extends AppCompatActivity {

    EditText etEmail, etSenha, etConfirmar;
    Button btnEfetuarCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etSenha = (EditText) findViewById(R.id.etSenha);
        etConfirmar = (EditText) findViewById(R.id.etConfirmaSenha);
        btnEfetuarCadastro = (Button) findViewById(R.id.btnEfetuarCadastro);



    }

    public void efetuarCadastro(View view){
        Intent cadastro = new Intent(CadastroActivity.this, LoginActivity.class);
        startActivity(cadastro);
        finish();
    }
}
