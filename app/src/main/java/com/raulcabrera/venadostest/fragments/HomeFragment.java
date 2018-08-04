package com.raulcabrera.venadostest.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.raulcabrera.venadostest.R;
import com.raulcabrera.venadostest.adapters.GamesRecyclerAdapter;

public class HomeFragment extends Fragment {


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View homeFragment = inflater.inflate(R.layout.fragment_home, container, false);
		RecyclerView gamesListView = homeFragment.findViewById(R.id.recycler_games);
		gamesListView.setHasFixedSize(true);
		GamesRecyclerAdapter adapter = new GamesRecyclerAdapter();
		gamesListView.setAdapter(adapter);
		LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
		gamesListView.setLayoutManager(layoutManager);



		return homeFragment;
	}

}
