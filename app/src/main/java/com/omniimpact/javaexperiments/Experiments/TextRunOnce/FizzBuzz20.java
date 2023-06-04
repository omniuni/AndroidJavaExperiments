package com.omniimpact.javaexperiments.Experiments.TextRunOnce;

import com.omniimpact.javaexperiments.BaseClasses.BaseExperimentTypes.ExperimentTypeTextRunOnce;

import java.util.ArrayList;

public class FizzBuzz20 extends ExperimentTypeTextRunOnce {

	@Override
	public String experimentName() {
		return "FizzBuzz 20";
	}

	@Override
	public String experimentDescription() {
		return "Classic FizzBuzz up to 20";
	}

	@Override
	public ArrayList<String> getText() {
		ArrayList<String> output = new ArrayList<>();
		output.add("Hello FizzBuzz 20!");
		return output;
	}

}
