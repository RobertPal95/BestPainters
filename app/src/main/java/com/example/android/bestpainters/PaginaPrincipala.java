package com.example.android.bestpainters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PaginaPrincipala extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principala);
        afiseazaPictori();
    }

    void afiseazaPictori() {
        TextView pictori_tvj = findViewById(R.id.pictori_tvx);
        String[] pictori_s = pictori_f();

        for (String pictor_s : pictori_s) {
            pictori_tvj.append(pictor_s + "\n\n\n");
        }
    }

    String[] pictori_f() {
        return new String[] {
                "Pablo Picasso",
                "Vincent van Gogh",
                "Leonardo da Vinci",
                "Michelangelo Buonarroti",
                "Rafael",
                "Claude Monet",
                "Caravaggio",
                "El Greco",
                "Jackson Pollock",
                "Paul Cezanne",
                "Salvador Dali",
                "Sandro Botticeli",
                "Johannes Vermeer",
                "Peter Paul Rubens",
                "Giorgione",
                "Rembrandt",
                "Tintoretto"
        };
    }
}
