package com.example.guicelebrini.listagames.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.guicelebrini.listagames.R;
import com.example.guicelebrini.listagames.adapter.Adapter;
import com.example.guicelebrini.listagames.model.Game;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class GamesFragment extends Fragment {

    public GamesFragment() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private List<Game> listaGames = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_games, container, false);
        montarLista();

        recyclerView = view.findViewById(R.id.recyclerView);

        Adapter adaptador = new Adapter(listaGames);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(view.getContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(view.getContext(), LinearLayout.VERTICAL));
        recyclerView.setAdapter(adaptador);


        // Inflate the layout for this fragment
        return view;
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
