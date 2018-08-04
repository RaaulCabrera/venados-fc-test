package com.raulcabrera.venadostest.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.raulcabrera.venadostest.R;
import com.raulcabrera.venadostest.activities.PlayerDetailsActivity;

public class PlayersFragment extends Fragment {


	// Temporal variable just for the prototype
	private int[] playerIds = {R.id.test_player_1, R.id.test_player_2, R.id.test_player_3, R.id.test_player_4, R.id.test_player_5, R.id.test_player_6 };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View root = inflater.inflate(R.layout.fragment_players, container, false);
		PlayerDetailsClick listener = new PlayerDetailsClick();
		for (int playerViewId : playerIds) {
			View playerView = root.findViewById(playerViewId);
			playerView.setOnClickListener(listener);
		}
		return root;
	}

	class PlayerDetailsClick implements View.OnClickListener {

		@Override
		public void onClick(View view) {
			Intent detailsIntent = new Intent(getContext(), PlayerDetailsActivity.class);
			startActivity(detailsIntent);
		}
	}
}
