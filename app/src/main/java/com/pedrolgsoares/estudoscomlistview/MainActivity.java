package com.pedrolgsoares.estudoscomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listFilmes;
    private String[] filmes = {
            "Astroboy", "Babe - O Porquinho Atrapalhado na Cidade",
            "Cabras da Peste", "Din e o dragão genial",
            "Eclipse Mortal", "Frozen: Uma Aventura Congelante",
            "G.I. Joe: A Origem de Cobra", "Homem-Aranha no Aranhaverso",
            "It - Capítulo 1", "It - Capítulo 2", "Jogos Mortais",
            "Karate Kid", "Ladrões", "Mulan", "Na Batida do Coração",
            "Os Vingadores", "Paciente Zero"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listFilmes = findViewById(R.id.listFilmes);

//      Criando adaptador para a lista: Adaptação de uma coisa para outra
        ArrayAdapter<String> adapFilmes = new ArrayAdapter<>(
                getApplicationContext(), // Primeiro parâmetro é o contexto da aplicação
                android.R.layout.simple_list_item_1, // Segundo parâmetro será o layout do android
                android.R.id.text1, // Por fim o id onde ficará as informações da lista
                filmes
        );
//      Adicionando adaptador para a lista
        listFilmes.setAdapter(adapFilmes);
        
//      Adicionando  clique na lista
        listFilmes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String valorDaLista = listFilmes.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(), valorDaLista, Toast.LENGTH_SHORT).show();
            }
        });
    }
}