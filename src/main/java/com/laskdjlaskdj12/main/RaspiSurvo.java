package com.laskdjlaskdj12.main;

import com.pi4j.wiringpi.Gpio;
import com.pi4j.wiringpi.SoftPwm;

public class RaspiSurvo {

	private int pinNumber;

	public RaspiSurvo(){
		Gpio.wiringPiSetup();
		SoftPwm.softPwmCreate(7, 0, 100);
		pinNumber = 0;
	}

	public void setPin(int pinNumber){
		this.pinNumber = pinNumber;
	}
	public void move(int range){
		SoftPwm.softPwmWrite(7, range);
	}

	public static class Builder{

		private int pinNumber;
		private int range;

		public Builder setPinNumber(int number){
			this.pinNumber = number;
			return this;
		}

		public Builder setRange(int range){
			this.range = range;
			return this;
		}
	}
}
