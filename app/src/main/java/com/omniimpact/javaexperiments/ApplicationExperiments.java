package com.omniimpact.javaexperiments;

import android.app.Application;

import com.omniimpact.javaexperiments.Utilities.UtilityGetExperiments;

public class ApplicationExperiments extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		UtilityGetExperiments.getInstance(); // Instantiate the Experiments utility singleton
	}
}
