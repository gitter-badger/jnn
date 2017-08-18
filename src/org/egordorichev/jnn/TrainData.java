package org.egordorichev.jnn;


public class TrainData {
	/**
	 * Given inputs
	 */
	private Double[][] inputs;
	/**
	 * Expected outputs
	 */
	private Double[][] outputs;

	public TrainData(String file) {
		/*
		 * TODO
		 */
	}

	public TrainData(Double[][] inputs, Double[][] outputs) {
		this.setInputs(inputs);
		this.setOutputs(outputs);
	}

	/**
	 * Sets network inputs
	 *
	 * @param inputs New inputs
	 */
	public void setInputs(Double[][] inputs) {
		this.inputs = inputs;
	}

	/**
	 * Sets expected outputs
	 *
	 * @param outputs New outputs
	 */
	public void setOutputs(Double[][] outputs) {
		this.outputs = outputs;
	}
}