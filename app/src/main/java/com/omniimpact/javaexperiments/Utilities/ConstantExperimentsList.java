package com.omniimpact.javaexperiments.Utilities;

import com.omniimpact.javaexperiments.BaseClasses.BaseExperimentTypes.ExperimentTypeTextRunOnce;
import com.omniimpact.javaexperiments.Experiments.TextRunOnce.FizzBuzz;

public final class ConstantExperimentsList {

	public static String[] experimentTypes = {
			ExperimentTypeTextRunOnce.class.getName()
	};

	public static String[] experiments = {
			FizzBuzz.class.getName()
	};

}
