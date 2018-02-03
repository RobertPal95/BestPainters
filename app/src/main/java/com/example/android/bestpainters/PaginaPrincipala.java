package com.example.android.bestpainters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PaginaPrincipala extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principala);
        scrieInFirebase();
    }

    void scrieInFirebase() {
        DatabaseReference referintaFB = FirebaseDatabase.getInstance().getReference(); // pentru a scrie in FireBase
        String[] pictori_s = pictori_f(); // iau lista de pictori
        String[] tablouri_s = tablouri_f(); // iau lista de tablouri

        int i = 0; // incarc pentru fiecare pictor tabloul cu acelasi indice
        for (String pictor_s : pictori_s) { // parcurg lista de pictori
            String tablou_s = tablouri_s[i]; // iau tabloul de pe pozitia i
            referintaFB.child(pictor_s).setValue(tablou_s); // scriu in Firebase perechea pictor - tablou
            i++; // trec la tabloul urmator (pentru ca in "for" voi trece si la pictorul urmator)
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

    String[] tablouri_f() {
        return new String[] {
                "Guernica",
                "Noapte instelata",
                "Mona Lisa",
                "Judecata de apoi",
                "Scoala ateniana",
                "La scaldat pe La Grenouillere",
                "Chemarea Sfantului Matei",
                "Inmormantarea contelui de Orgaz",
                "Ritmul toamnei",
                "Jucatorii de carti",
                "Persistenta memoriei",
                "Nasterea lui Venus",
                "Fata cu turban",
                "Coborarea de pe cruce",
                "Furtuna",
                "Rondul de noapte",
                "Cina cea de taina"
        };
    }
}
