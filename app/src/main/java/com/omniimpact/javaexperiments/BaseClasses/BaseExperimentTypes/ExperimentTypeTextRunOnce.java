package com.omniimpact.javaexperiments.BaseClasses.BaseExperimentTypes;

import com.omniimpact.javaexperiments.BaseClasses.BaseExperiment;
import com.omniimpact.javaexperiments.Interfaces.IExperimentTextRunOnce;

public abstract class ExperimentTypeTextRunOnce extends BaseExperiment implements IExperimentTextRunOnce {

	@Override
	public String experimentTypeName() {
		return "Text Run Once";
	}

	@Override
	public Class<?> experimentRunnerInterface() {
		return IExperimentTextRunOnce.class;
	}

}