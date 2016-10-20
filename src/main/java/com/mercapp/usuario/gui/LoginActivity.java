package com.mercapp.usuario.gui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mercapp.R;


public class LoginActivity extends AppCompatActivity {

    private Button btnLogar, btnCadastrar;
    private EditText etEmail, etSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etSenha = (EditText) findViewById(R.id.etSenha);

        btnLogar = (Button) findViewById(R.id.btnEntrar);
        btnCadastrar = (Button) findViewById(R.id.btnCadastrar);

    }

    public void loginUsuario(View view){
            Intent changeToTelaPrincipal = new Intent(LoginActivity.this, TelaPrincipalActivity.class);
            LoginActivity.this.startActivity(changeToTelaPrincipal);
            finish();
    }

    public void cadastrarUsuario (View view){
        Intent cadastro = new Intent(LoginActivity.this, CadastroActivity.class);
        startActivity(cadastro);
    }

    private boolean validarCampos(){
        String email = etEmail.getText().toString().trim();
        String senha = etSenha.getText().toString();
        return (!verificaVazios(email, senha)  && !semEspaco(email));
    }

    private boolean verificaVazios(String email, String senha) {
        if (TextUtils.isEmpty(email)) {
            etEmail.requestFocus();
            etEmail.setError(getString(R.string.email_vazio));
            return true;
        } else if (TextUtils.isEmpty(senha)) {
            etSenha.requestFocus();
            etSenha.setError(getString(R.string.senha_vazio));
            return true;
        }
        return false;
    }

    private boolean semEspaco(String email) {
        int idx = email.indexOf(" ");
        if (idx != -1){
            etEmail.requestFocus();
            etEmail.setError(getString(R.string.email_invalido));
            return true;
        }return false;
    }




}