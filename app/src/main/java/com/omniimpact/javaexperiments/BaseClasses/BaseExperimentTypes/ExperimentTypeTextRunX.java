package com.omniimpact.javaexperiments.BaseClasses.BaseExperimentTypes;

import com.omniimpact.javaexperiments.BaseClasses.BaseExperiment;
import com.omniimpact.javaexperiments.Interfaces.IExperimentTextRunX;

public abstract class ExperimentTypeTextRunX extends BaseExperiment implements IExperimentTextRunX {

	protected int mRequestedIterations = 0;
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

}
