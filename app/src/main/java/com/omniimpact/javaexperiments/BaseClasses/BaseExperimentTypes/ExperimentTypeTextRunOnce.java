package com.omniimpact.javaexperiments.BaseClasses.BaseExperimentTypes;

import android.app.Activity;
import android.app.Application;

import com.omniimpact.javaexperiments.BaseClasses.BaseExperiment;
import com.omniimpact.javaexperiments.Interfaces.IExperimentTextRunOnce;

public abstract class ExperimentTypeTextRunOnce extends BaseExperiment implements IExperimentTextRunOnce {

	protected Application mApplication;
	protected Activity mActivity;

	@Override
	public String experimentTypeName() {
		return "Text, Run Once";
	}

	@Override
	public Class<?> experimentRunnerInterface() {
		return IExperimentTextRunOnce.class;
	}

	@Override
	public void provideApplicationContext(Application application) {
		mApplication = application;
	}

	@Override
	public void provideActivityContext(Activity activity) {
		mActivity = activity;
	}

	@Override
	public void run() {
		// Do nothing. Since this only will return text, we can just do whatever we need there.
	}
}
