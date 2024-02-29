package com.neotech.lesson14;

public class phoneBehavior {

	public static void main(String[] args) {

		Phone ph1 = new Phone();

		ph1.brand = "iphone ";
		ph1.model = "15 pro max";
		ph1.color = "titanium";
		ph1.memory = 512;
		ph1.pixel = 2556;
		ph1.battery_life = "20 hours";

		Phone ph2 = new Phone();
		ph2.brand = "nokia ";
		ph2.model = "razer";
		ph2.color = "space gray";
		ph2.memory = 256;
		ph2.pixel = 2556;
		ph2.battery_life = "23 hours";

		Phone ph3 = new Phone();
		ph3.brand = "samsung ";
		ph3.model = "galaxy";
		ph3.color = "space gray";
		ph3.memory = 256;
		ph3.pixel = 3000;
		ph3.battery_life = "23 hours";

		ph1.brand();
		ph1.battery_life();
		ph1.memory();
		ph1.color();
		ph1.pixel();

		ph2.brand();
		ph2.battery_life();
		ph2.memory();
		ph2.color();
		ph2.pixel();

	}

}
