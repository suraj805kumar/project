package com.ok.example.dp.structural.decorator;

public class FlatDecorator implements Flat {

	protected Flat flat;

	public FlatDecorator(Flat flat) {
		this.flat = flat;
	}

	@Override
	public void getName() {
		this.flat.getName();
	}

	@Override
	public void getFeatures() {
		this.flat.getFeatures();
	}

}
