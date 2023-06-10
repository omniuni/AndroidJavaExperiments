package com.omniimpact.javaexperiments.UI.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.omniimpact.javaexperiments.Models.ModelMetaExperiment;
import com.omniimpact.javaexperiments.R;
import com.omniimpact.javaexperiments.Utilities.UtilityGetExperiments;

import java.util.ArrayList;

public class AdapterExperimentsList extends ArrayAdapter {

	private final ArrayList<ModelMetaExperiment> mExperiments;
	private final int mViewResourceid;
	public AdapterExperimentsList(@NonNull Context context){
		super(context, R.layout.layout_item_textview_simple);
		mExperiments = UtilityGetExperiments.getInstance().getExperiments();
		mViewResourceid = R.layout.layout_item_textview_simple;
	}

	@Override
	public int getCount() {
		return mExperiments.size();
	}

	@NonNull
	@Override
	public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

		LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View itemView = inflater.inflate(mViewResourceid, parent, false);

		ModelMetaExperiment thisExperiment = mExperiments.get(position);

		TextView tagView = itemView.findViewById(R.id.id_tv_list_item_tag);
		TextView titleView = itemView.findViewById(R.id.id_tv_list_item_title);
		TextView subTitleView = itemView.findViewById(R.id.id_tv_list_item_subtitle);

		tagView.setText(thisExperiment.getExperimentType().getName());
		titleView.setText(thisExperiment.getExperimentName());
		subTitleView.setText(thisExperiment.getExperimentDescription());

		return itemView;
	}
}
