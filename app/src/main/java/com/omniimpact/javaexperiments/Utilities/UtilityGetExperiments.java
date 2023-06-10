package com.omniimpact.javaexperiments.Utilities;

import com.omniimpact.javaexperiments.BaseClasses.BaseExperiment;
import com.omniimpact.javaexperiments.Models.ModelMetaExperiment;
import com.omniimpact.javaexperiments.Models.ModelMetaExperimentType;

import java.util.ArrayList;

public class UtilityGetExperiments {

	private static UtilityGetExperiments mInstance = null;
	private final ArrayList<ModelMetaExperimentType> mExperimentTypes = new ArrayList<>();
	private final ArrayList<ModelMetaExperiment> mExperiments = new ArrayList<>();

	private UtilityGetExperiments() {
		// Set up the Experiments and Experiment Types
		for (Class<?> experimentClass : ConstantExperimentsList.experiments) {
			try {
				BaseExperiment experimentInstance = (BaseExperiment) experimentClass.newInstance();
				ModelMetaExperimentType experimentTypeMetadataModel =
						new ModelMetaExperimentType(
								experimentInstance.experimentTypeName(),
								experimentInstance.experimentRunnerInterface()
						);
				if (!mExperimentTypes.contains(experimentTypeMetadataModel)) {
					mExperimentTypes.add(experimentTypeMetadataModel);
				}
				mExperiments.add(
						new ModelMetaExperiment(
								experimentTypeMetadataModel,
								experimentInstance.experimentName(),
								experimentInstance.experimentDescription(),
								experimentInstance.getClass()
						)
				);
			} catch (IllegalAccessException | InstantiationException e) {
				e.printStackTrace();
			}
		}
		System.gc(); // Clean up unneeded class instances.
	}

	public static UtilityGetExperiments getInstance() {
		if (mInstance == null) {
			mInstance = new UtilityGetExperiments();
		}
		return mInstance;
	}

	public ArrayList<ModelMetaExperimentType> getExperimentTypesList() {
		return mExperimentTypes;
	}

	public ArrayList<ModelMetaExperiment> getExperiments() {
		return mExperiments;
	}

}
