package com.omniimpact.javaexperiments.BaseClasses.BaseExperimentTypes;

import android.app.Activity;
import android.app.Application;

import com.omniimpact.javaexperiments.BaseClasses.BaseExperiment;
import com.omniimpact.javaexperiments.Interfaces.IExperimentTextRunX;

public abstract class ExperimentTypeTextRunX extends BaseExperiment implements IExperimentTextRunX {

	protected int mRequestedIterations = 0;
	protected Application mApplication;
	protected Activity mActivity;
	@Override
	public String experimentTypeName() {
		return "Text, Run X Times";
	}

	@Override
	public Class<?> experimentRunnerInterface() {
		return IExperimentTextRunX.class;
	}

	@Override
	public void provideRequestedIterations(int iterations) {
		mRequestedIterations = iterations;
	}

	@Override
	public void provideApplicationContext(Application application) {
		mApplication = application;
	}

	@Override
	public void provideActivityContext(Activity activity) {
		mActivity = activity;
	}

}
