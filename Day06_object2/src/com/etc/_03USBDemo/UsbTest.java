package com.etc._03USBDemo;

public class UsbTest {

	public static void main(String[] args) {
		MotherBoard mb = new MotherBoard();
		Iusb m = new Mouse();
		//mb.doMouse(m);
		mb.doWork(m);
		
		Iusb k = new KeyBoard();
		mb.doWork(k);
		
		
	}
}
