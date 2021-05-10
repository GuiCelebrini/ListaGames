package com.example.guicelebrini.listagames.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.guicelebrini.listagames.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GamesFragment extends Fragment {

    public GamesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_games, container, false);
    }

}
