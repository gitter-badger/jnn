package org.egordorichev.jnn.example;

import org.egordorichev.jnn.Network;
import org.egordorichev.jnn.TrainData;

public class Example {
	public static final void main(String[] args) {
		TrainData data = new TrainData(new Double[][] {
				{ 0.0, 0.0 }, { 1.0, 0.0 },
				{ 0.0, 1.0 }, { 1.1, 1.1 }
			}, new Double[][] {
				{ 0.0 }, { 1.0 }, { 1.0 }, { 0.0 }
		});

		Network network = new Network(data);
		network.train(1000);

		System.out.println("Finished training");
		System.out.println("Results:");
		System.out.println("-----------------");
		System.out.println("0, 0 : " + network.run(new Double[]{ 0.0, 0.0 })[0]);
		System.out.println("1, 0 : " + network.run(new Double[]{ 1.0, 0.0 })[0]);
		System.out.println("0, 1 : " + network.run(new Double[]{ 0.0, 1.0 })[0]);
		System.out.println("1, 1 : " + network.run(new Double[]{ 1.0, 1.0 })[0]);
	}
}