package com.omniimpact.javaexperiments.Models;

public class ModelMetaExperiment {

	private final ModelMetaExperimentType mExperimentType;
	private final String mExperimentName;
	private final String mExperimentDescription;
	private final Class<?> mExperimentClass;


	public ModelMetaExperiment(
			ModelMetaExperimentType experimentType,
			String experimentName,
			String experimentDescription,
			Class<?> experimentClass) {
		mExperimentType = experimentType;
		mExperimentName = experimentName;
		mExperimentDescription = experimentDescription;
		mExperimentClass = experimentClass;
	}

	public ModelMetaExperimentType getExperimentType() {
		return mExperimentType;
	}

	public String getExperimentName() {
		return mExperimentName;
	}

	public String getExperimentDescription() {
		return mExperimentDescription;
	}

	public Class<?> getExperimentRunnerClass() {
		return mExperimentClass;
	}

}
