package com.omniimpact.javaexperiments.Models;

import androidx.annotation.Nullable;

import java.util.Objects;

public class ModelMetaExperimentType {

	private final String mName;
	private final Class<?> mExperimentRunnerClass;


	public ModelMetaExperimentType(
			String name,
			Class<?> experimentRunnerClass) {
		mName = name;
		mExperimentRunnerClass = experimentRunnerClass;
	}

	public String getName() {
		return mName;
	}

	public Class<?> getExperimentRunnerClass() {
		return mExperimentRunnerClass;
	}

	@Override
	public boolean equals(@Nullable Object obj) {
		assert obj != null;
		assert obj.getClass() == this.getClass();
		return Objects.equals(this.mName, ((ModelMetaExperimentType) obj).getName()) && Objects.equals(this.mExperimentRunnerClass, ((ModelMetaExperimentType) obj).getExperimentRunnerClass());
	}
}
