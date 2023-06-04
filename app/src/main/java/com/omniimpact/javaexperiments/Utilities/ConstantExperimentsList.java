package com.omniimpact.javaexperiments.Utilities;

import com.omniimpact.javaexperiments.Experiments.TextRunOnce.Fibonacci100;
import com.omniimpact.javaexperiments.Experiments.TextRunOnce.FizzBuzz;

import java.util.ArrayList;

public final class ConstantExperimentsList {

	public static ArrayList<Class<?>> experiments = new ArrayList<>() {
		{
			add(FizzBuzz.class);
			add(Fibonacci100.class);
		}
	};

}
