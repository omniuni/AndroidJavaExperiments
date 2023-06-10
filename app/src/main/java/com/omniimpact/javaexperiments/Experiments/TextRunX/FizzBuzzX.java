package com.omniimpact.javaexperiments.Experiments.TextRunX;

import com.omniimpact.javaexperiments.BaseClasses.BaseExperimentTypes.ExperimentTypeTextRunX;

public class FizzBuzzX extends ExperimentTypeTextRunX {
	@Override
	public String experimentName() {
		return "FizzBuzz X Times";
	}

	@Override
	public String experimentDescription() {
		return "FizzBuzz but you can specify the number of times it runs.";
	}

	@Override
	public void run(){
		// Placeholder, will be executed before getText()
	}

	@Override
	public String getText(int line) {
		return "";
	}

}
