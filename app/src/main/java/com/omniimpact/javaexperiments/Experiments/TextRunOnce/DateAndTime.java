package com.omniimpact.javaexperiments.Experiments.TextRunOnce;

import com.omniimpact.javaexperiments.BaseClasses.BaseExperimentTypes.ExperimentTypeTextRunOnce;

import java.util.ArrayList;

public class DateAndTime extends ExperimentTypeTextRunOnce {

	@Override
	public String experimentName() {
		return "Date And Time";
	}

	@Override
	public String experimentDescription() {
		return "Displays the current Date and Time.";
	}

	@Override
	public ArrayList<String> getText() {
		ArrayList<String> output = new ArrayList<>();
		output.add("Date and Time");
		return output;
	}

}
