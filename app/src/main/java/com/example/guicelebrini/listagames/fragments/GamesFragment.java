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
        Game game1 = new Game("Ocarina of Time", "1998","99", "https://www.wasd.pt/wp-content/uploads/2018/01/zelda-wasd-ocarina-time.png");
        listaGames.add(game1);

        Game game2 = new Game("Tony Hawk II", "2000", "98", "https://upload.wikimedia.org/wikipedia/pt/a/a9/Tony_Hawk%27s_Pro_Skater_2_n64_cover.png");
        listaGames.add(game2);

        Game game3 = new Game("Grand Theft Auto IV", "2008", "98","https://upload.wikimedia.org/wikipedia/pt/thumb/9/91/Grand_Theft_Auto_IV_capa.png/270px-Grand_Theft_Auto_IV_capa.png");
        listaGames.add(game3);

        Game game4 = new Game("Soul Calibur", "1999", "98","https://dropsdejogos.uai.com.br/wp-content/uploads/sites/10/2020/08/soul-950x695.jpg");
        listaGames.add(game4);

        Game game5 = new Game("Super Mario Galaxy", "2007","97", "https://uploads.jovemnerd.com.br/wp-content/uploads/2019/12/super-mario-galaxy-2-e-o-melhor-jogo-da-decada-segundo-o-metacritic.jpg");
        listaGames.add(game5);

        Game game6 = new Game("Super Mario Galaxy 2", "2010", "97", "https://d17lbu6bbzbdc8.cloudfront.net/wp-content/uploads/2020/08/23194420/super-mario-galaxy.original-scaled.jpg");
        listaGames.add(game6);

        Game game7 = new Game("Red Dead Redemption 2", "2018", "97","https://images4.kabum.com.br/produtos/fotos/140584/red-dead-redemption-2-rockstar-_1611085792653_g.jpg");
        listaGames.add(game7);

        Game game8 = new Game("Grand Theft Auto V", "2013", "97","https://cdn-products.eneba.com/resized-products/t0zqmqhdcxppyol3mtlg_350x200_1x-0.jpg");
        listaGames.add(game8);

        Game game9 = new Game("Breath of the Wild", "2017", "97","https://i.pinimg.com/originals/76/e2/c9/76e2c94e57bf13944928c97cdbca901d.jpg");
        listaGames.add(game9);

        Game game10 = new Game("Tony Hawk III", "2001", "97","https://images-na.ssl-images-amazon.com/images/I/5183anCzIkL._AC_SX425_.jpg");
        listaGames.add(game10);
    }

}
