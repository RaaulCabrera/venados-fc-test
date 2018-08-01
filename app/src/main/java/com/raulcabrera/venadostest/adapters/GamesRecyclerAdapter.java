package com.raulcabrera.venadostest.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.raulcabrera.venadostest.R;
import com.raulcabrera.venadostest.holders.GameHolder;

/**
 * Created by Raul C. A. on 31/07/2018.
 * <p>
 * raaul-@live.com.mx
 *
 * @author Raul Cabrera Aguilar.
 */

public class GamesRecyclerAdapter extends RecyclerView.Adapter<GameHolder> {

	@Override
	public GameHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View gameCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_game, parent, false);
		return new GameHolder(gameCard);
	}

	@Override
	public void onBindViewHolder(GameHolder holder, int position) {



	}

	@Override
	public int getItemCount() {
		return 20;
	}

}

