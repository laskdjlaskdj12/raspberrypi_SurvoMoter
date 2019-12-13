package com.laskdjlaskdj12.main;

import com.pi4j.wiringpi.Gpio;
import com.pi4j.wiringpi.SoftPwm;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Gpio.wiringPiSetup();
		SoftPwm.softPwmCreate(7, 0, 100);

		while(true) {
			int position = (int) (Math.random() * 20);
			System.out.println("position : " + position);
			SoftPwm.softPwmWrite(7, position);
			Thread.sleep(1000);
		}
	}
}
