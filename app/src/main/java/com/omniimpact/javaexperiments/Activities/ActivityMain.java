package com.omniimpact.javaexperiments.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.omniimpact.javaexperiments.Fragments.FragmentMain;
import com.omniimpact.javaexperiments.R;
import com.omniimpact.javaexperiments.Utilities.UtilityGetExperiments;

/**
 * Main activity for the application where we start execution.
 * <p>
 * Activities are individual "whole windows" of a Android application.
 */
public class ActivityMain extends AppCompatActivity {

	/**
	 * Occurs on the instantiation of the activity, creates the initial
	 * layout and sets it to the current content view.
	 * Note: onCreate is different from onStart because onCreate is called
	 * once while onStart can be called whenever you return to the activity.
	 * <p>
	 * savedInstanceState explicitly stores stateful information back to
	 * the activity if it is cleared from memory so that you can return a
	 * Bundle from onSaveInstanceState() that will be passed back to onCreate()
	 * to remember where you left off.
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_content_view_single_fragment);
	}

	/**
	 * Occurs on starting the activity (after instantiation). Creates
	 * the main screen Fragment objects, sets up the FragmentTransaction,
	 * and instantiates a new FragmentManager to handle the "stack" of
	 * screens. This adds the first Fragment to the transactions and
	 * commits it to start the application such that the user can
	 * begin interacting with it.
	 * <p>
	 * The Fragments in the FragmentManager are the UI elements that you
	 * navigate "forward" by opening more, then navigate "backwards"
	 * by using the system's "back" button. Using the "back" button on
	 * the root (first/main) element will exit the application (or prompt
	 * to exit).
	 */
	@Override
	protected void onStart() {
		super.onStart();
		UtilityGetExperiments.getInstance(); // Initialize the Experiments Utility
		Fragment mainScreen = new FragmentMain();
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.add(R.id.id_fragment_main, mainScreen);
		ft.commitNow();
	}

}