package com.omniimpact.javaexperiments.Experiments.TextRunOnce;

import com.omniimpact.javaexperiments.BaseClasses.BaseExperimentTypes.ExperimentTypeTextRunOnce;

import java.util.ArrayList;

public class Fibonacci100 extends ExperimentTypeTextRunOnce {

	@Override
	public String experimentName() {
		return "Fibonacci 100";
	}

	@Override
	public String experimentDescription() {
		return "Displays the first 100 numbers in the Fibonacci Sequence";
	}

	@Override
	public ArrayList<String> getText() {
		return null;
	}

}
