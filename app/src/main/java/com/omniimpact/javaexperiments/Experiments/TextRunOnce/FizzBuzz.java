package com.omniimpact.javaexperiments.Experiments.TextRunOnce;

import com.omniimpact.javaexperiments.BaseClasses.BaseExperimentTypes.ExperimentTypeTextRunOnce;

import java.util.ArrayList;

public class FizzBuzz extends ExperimentTypeTextRunOnce {

	@Override
	public String experimentName() {
		return "FizzBuzz";
	}

	@Override
	public ArrayList<String> getText() {
		ArrayList<String> output = new ArrayList<>();
		output.add("Hello FizzBuzz!");
		return output;
	}

}
