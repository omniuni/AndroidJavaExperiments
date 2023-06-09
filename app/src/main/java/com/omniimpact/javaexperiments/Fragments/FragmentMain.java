package com.omniimpact.javaexperiments.Fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.omniimpact.javaexperiments.Models.ModelMetaExperiment;
import com.omniimpact.javaexperiments.Models.ModelMetaExperimentType;
import com.omniimpact.javaexperiments.R;
import com.omniimpact.javaexperiments.UI.Adapters.AdapterExperimentsList;
import com.omniimpact.javaexperiments.Utilities.UtilityGetExperiments;

import java.util.ArrayList;

/**
 * This class represents the main Fragment UI element, which
 * is the main screen that users start on and return to when
 * using the application.
 */
public class FragmentMain extends Fragment {

	private View mRootView;

	/**
	 * Occurs when creating a new FragmentMain object.
	 * In this case, since it is the main Fragment, it loads
	 * the main fragment layout to show the user.
	 * <p>
	 * inflater is a special service provided by Android that
	 * lets you create views that will appear on the screen.
	 * <p>
	 * container is the parent container that is provided to the
	 * layout inflater in order to make sure that the view is
	 * displayed at the correct size and proportions.
	 * <p>
	 * savedInstanceState stores a saved state to a Bundle. If a
	 * saveState bundle was provided, this will return it so that
	 * the Fragment can be updated as necessary.
	 *
	 * @return View object of the current UI
	 */
	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		mRootView = inflater.inflate(R.layout.layout_fragment_main, container, false);
		return mRootView;
	}

	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		ArrayList<ModelMetaExperimentType> experimentTypeList = UtilityGetExperiments.getInstance().getExperimentTypesList();
		for(ModelMetaExperimentType experimentType : experimentTypeList){
			Log.d(getTag(), "Experiment Type: "+experimentType.getName());
		}

		ArrayList<ModelMetaExperiment> experimentsList = UtilityGetExperiments.getInstance().getExperiments();
		for(ModelMetaExperiment experiment : experimentsList){
			Log.d(getTag(), experiment.getExperimentName()+": "+experiment.getExperimentDescription());
		}

		ListView myList = mRootView.findViewById(R.id.id_lv_experiments);
		AdapterExperimentsList myAdapter = new AdapterExperimentsList(requireContext());
		myList.setAdapter(myAdapter);

		myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Toast.makeText(getContext(), "Clicked item: "+position, Toast.LENGTH_SHORT).show();
			}
		});

	}

}