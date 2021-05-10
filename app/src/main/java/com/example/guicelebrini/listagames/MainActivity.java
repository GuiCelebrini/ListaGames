package com.example.guicelebrini.listagames;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.guicelebrini.listagames.adapter.Adapter;
import com.example.guicelebrini.listagames.model.Game;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Game> listaGames = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        montarLista();

        recyclerView = findViewById(R.id.recyclerView);

        Adapter adaptador = new Adapter(listaGames);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adaptador);



    }

    public void montarLista(){
        Game game1 = new Game("God of War", "2018","94", "https://cdn.pocket-lint.com/r/s/1200x/assets/images/143881-games-review-review-god-of-war-screens-image1-hcyb5z2mg0.jpg");
        listaGames.add(game1);

        Game game2 = new Game("The Last of Us Part II", "2020", "93", "https://1.bp.blogspot.com/-EEeSRpUuYmQ/XuLnaVAvHJI/AAAAAAAAWBw/GFJzSGtnI4Q8uidPhbdcti36kx-JE-5FgCLcBGAsYHQ/s1600/CAPA.png");
        listaGames.add(game2);

        Game game3 = new Game("Ghost of Tsushima", "2020", "83","https://m.media-amazon.com/images/S/aplus-media/vc/877cb42f-1e4e-4c78-89e8-3b2204f48df0.__CR0,0,1464,600_PT0_SX1464_V1___.jpg");
        listaGames.add(game3);
    }
}
