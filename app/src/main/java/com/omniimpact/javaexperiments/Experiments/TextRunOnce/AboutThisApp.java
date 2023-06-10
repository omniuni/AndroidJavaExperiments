package com.omniimpact.javaexperiments.Experiments.TextRunOnce;

import com.omniimpact.javaexperiments.BaseClasses.BaseExperimentTypes.ExperimentTypeTextRunOnce;

import java.util.ArrayList;

public class AboutThisApp extends ExperimentTypeTextRunOnce {

	@Override
	public String experimentName() {
		return "About This App";
	}

	@Override
	public String experimentDescription() {
		return "Display Information About this App";
	}

	@Override
	public ArrayList<String> getText() {
		ArrayList<String> output = new ArrayList<>();
		output.add(mActivity.getPackageName());
		return output;
	}

}
