package com.omniimpact.javaexperiments.Utilities;

import com.omniimpact.javaexperiments.Experiments.TextRunOnce.Fibonacci18;
import com.omniimpact.javaexperiments.Experiments.TextRunOnce.FizzBuzz20;
import com.omniimpact.javaexperiments.Experiments.TextRunX.FibonacciX;
import com.omniimpact.javaexperiments.Experiments.TextRunX.FizzBuzzX;

import java.util.ArrayList;

public final class ConstantExperimentsList {

	public static ArrayList<Class<?>> experiments = new ArrayList<>() {
		{

			add(FizzBuzz20.class);
			add(Fibonacci18.class);

			add(FizzBuzzX.class);
			add(FibonacciX.class);

		}
	};

}
