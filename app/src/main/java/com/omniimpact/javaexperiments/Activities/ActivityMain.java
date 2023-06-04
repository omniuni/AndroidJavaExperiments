package com.omniimpact.javaexperiments.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.omniimpact.javaexperiments.Fragments.FragmentMain;
import com.omniimpact.javaexperiments.R;

public class ActivityMain extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_content_view_single_fragment);
	}

	@Override
	protected void onStart() {
		super.onStart();
		Fragment mainScreen = new FragmentMain();
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.add(R.id.id_fragment_main, mainScreen);
		ft.commitNow();
	}
}
