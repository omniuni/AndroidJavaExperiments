package com.omniimpact.javaexperiments.Experiments.TextRunOnce;

import com.omniimpact.javaexperiments.BaseClasses.BaseExperimentTypes.ExperimentTypeTextRunOnce;

import java.util.ArrayList;

public class Fibonacci18 extends ExperimentTypeTextRunOnce {

	@Override
	public String experimentName() {
		return "Fibonacci 18";
	}

	@Override
	public String experimentDescription() {
		return "Displays the first 18 numbers in the Fibonacci Sequence";
	}

	@Override
	public ArrayList<String> getText() {
		ArrayList<String> output = new ArrayList<>();
		output.add("0");
		output.add("1");
		output.add("1");
		output.add("2");
		output.add("3");
		output.add("5");
		output.add("8");
		output.add("...");
		return output;
	}

}
