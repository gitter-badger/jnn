package org.egordorichev.jnn;

public class Network {
	/**
	 * Data, used for network training
	 */
	private TrainData data;

	public Network(TrainData data) {
		this.data = data;
	}

	/**
	 * Trains the network
	 *
	 * @param times How much times to train it
	 */
	public void train(int times) {

	}

	/**
	 * Passes given inputs to the network
	 * and returns output
	 *
	 * @param inputs Given inputs
	 * @return Network output
	 */
	public Double[] run(Double[] inputs) {
		/*
		 * TODO
		 */
		return new Double[] { 0.0 };
	}
}