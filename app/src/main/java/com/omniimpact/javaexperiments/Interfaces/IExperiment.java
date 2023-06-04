package com.omniimpact.javaexperiments.Interfaces;

import android.app.Activity;
import android.app.Application;

public interface IExperiment {

	String experimentName();
	String experimentDescription();
	void run();
	void provideApplicationContext(Application application);
	void provideActivityContext(Activity activity);

}
