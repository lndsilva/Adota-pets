package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class MenuActivity extends AppCompatActivity {
    MaterialCardView idMenuPets, idMenuAlimentos,
            idMenuDoacoes, idMenuServicos,
            idMenuLocalizar, idMenuParceiros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        idMenuPets = findViewById(R.id.idMenuPets);
        idMenuAlimentos = findViewById(R.id.idMenuAlimentos);
        idMenuDoacoes = findViewById(R.id.idMenuDoacoes);
        idMenuServicos = findViewById(R.id.idMenuServicos);
        idMenuParceiros = findViewById(R.id.idMenuParceiros);
        idMenuLocalizar = findViewById(R.id.idMenuLocalizar);




    }


}