package com.omniimpact.javaexperiments.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.omniimpact.javaexperiments.R;

/**
 * This class represents the main Fragment UI element, which
 * is the main screen that users start on and return to when
 * using the application.
 */
public class FragmentMain extends Fragment {

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
		return inflater.inflate(R.layout.layout_fragment_main, container, false);
	}
}
