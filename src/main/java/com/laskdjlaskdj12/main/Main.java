package com.laskdjlaskdj12.main;

import com.pi4j.io.gpio.*;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		final GpioController gpio = GpioFactory.getInstance();
		final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_17, "Power", PinState.HIGH);
		pin.setShutdownOptions(false, PinState.LOW);

		while (true) {
			System.out.println("Power On");
			pin.toggle();
			Thread.sleep(1000);

			System.out.println("Power Off");
			pin.toggle();
			Thread.sleep(1000);
		}
	}
}
