package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Pessoa ps = new Pessoa();

        ps.nome = "Francisca Maria";
        ps.email = "fm@hotmail.com";
        ps.idade = 15;

        ps.fala();


    }
}