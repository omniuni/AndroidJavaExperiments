package com.omniimpact.javaexperiments.Utilities;

import com.omniimpact.javaexperiments.Experiments.TextRunOnce.DateAndTime;
import com.omniimpact.javaexperiments.Experiments.TextRunOnce.AboutThisApp;
import com.omniimpact.javaexperiments.Experiments.TextRunX.FibonacciX;
import com.omniimpact.javaexperiments.Experiments.TextRunX.FizzBuzzX;

import java.util.ArrayList;

public final class ConstantExperimentsList {

	public static ArrayList<Class<?>> experiments = new ArrayList<>() {
		{

			add(AboutThisApp.class);
			add(DateAndTime.class);

			add(FizzBuzzX.class);
			add(FibonacciX.class);

		}
	};

}
