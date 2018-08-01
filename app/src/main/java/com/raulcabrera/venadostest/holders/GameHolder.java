package com.raulcabrera.venadostest.holders;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.raulcabrera.venadostest.R;


/**
 * Created by Raul C. A. on 31/07/2018.
 * <p>
 * raaul-@live.com.mx
 *
 * @author Raul Cabrera Aguilar.
 */

public class GameHolder extends RecyclerView.ViewHolder {

	public GameHolder(View itemView) {
		super(itemView);
		TableLayout tbl = itemView.findViewById(R.id.games_of_the_month_tbl);
		for (int i = 0; i < 3; i++) {
			TableRow row = (TableRow) LayoutInflater.from(itemView.getContext()).inflate(R.layout.tbl_row_game, null);
			tbl.addView(row);
		}

	}

	private void addRows() {

	}
}
