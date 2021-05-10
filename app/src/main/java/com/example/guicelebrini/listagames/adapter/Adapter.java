package com.example.guicelebrini.listagames.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guicelebrini.listagames.R;
import com.example.guicelebrini.listagames.model.Game;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    List<Game> listaGames;

    public Adapter(List<Game> listaGames){
        this.listaGames = listaGames;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Game game = listaGames.get(position);
        holder.titulo.setText(game.getTitulo());
        holder.lancamento.setText(game.getDataLancamento());
        Picasso.get().load(game.getImagem()).into(holder.imagem);
        holder.nota.setText("Metacritic: " + game.getNota());
    }

    @Override
    public int getItemCount() {
        return listaGames.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titulo, lancamento, nota;
        ImageView imagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textTitulo);
            lancamento = itemView.findViewById(R.id.textLancamento);
            nota = itemView.findViewById(R.id.textNota);
            imagem = itemView.findViewById(R.id.imageView);

        }
    }
}
