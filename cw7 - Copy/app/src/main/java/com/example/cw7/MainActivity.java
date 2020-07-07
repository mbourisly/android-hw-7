package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList <Pokemon> mePokemons = new ArrayList<>();

        Pokemon P1 = new Pokemon("Bulbasaur",R. drawable.bulbasaur,49,49,318);
        Pokemon P2= new Pokemon("Ivysaur",R.drawable.ivysaur,50,50,400);
        mePokemons.add(P1);
        mePokemons.add(P2);

        RecyclerView rv = findViewById(R.id.recyclerview);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);




    }
}