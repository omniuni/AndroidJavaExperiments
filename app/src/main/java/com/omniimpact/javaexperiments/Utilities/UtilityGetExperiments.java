package com.omniimpact.javaexperiments.Utilities;

import com.omniimpact.javaexperiments.Interfaces.IMetaExperimentType;
import com.omniimpact.javaexperiments.Models.ModelMetaExperimentType;

import java.util.ArrayList;

public class UtilityGetExperiments {

	private static UtilityGetExperiments mInstance = null;

	private UtilityGetExperiments() {

	}

	public static UtilityGetExperiments getInstance() {
		if (mInstance == null) {
			mInstance = new UtilityGetExperiments();
		}
		return mInstance;
	}

	public ArrayList<ModelMetaExperimentType> getExperimentTypesList() {
		ArrayList<ModelMetaExperimentType> experimentTypes = new ArrayList<>();
		for (String experimentClassName : ConstantExperimentsList.experimentTypes) {
			try {
				Class<?> experimentClass = Class.forName(experimentClassName);
				IMetaExperimentType experimentInstance = (IMetaExperimentType) experimentClass.newInstance();
				experimentTypes.add(new ModelMetaExperimentType(experimentInstance.experimentTypeName()));
			} catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
				e.printStackTrace();
			}
		}
		System.gc(); // Clean up unneeded class instances.
		return experimentTypes;
	}

}
