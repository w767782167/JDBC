package com.etc._05Printer;
/**
 * 多态
 * @author Administrator
 *
 */

public class PrinterTest {
	public static void main(String[] args) {
		Person p = new Person();
		Printer bPrinter = new BlackPrinter();
		Printer cPrinter = new ColorPrinter();
		
		//  1.没有使用多态
//		p.doBlackPrinter(bPrinter);
//		p.doColorPrinter(cPrinter);
		
		//  2.使用多态
		Printer tDPrinter = new ThreeDPrinter();
		p.doPrinter(tDPrinter);
		
		//多态的条件:
//		1.继承
//		2.重写
//		3.父类引用指向子类对象
		
		
		//instanceof  运算符: 判断该对象是否是某一个类的实例.
		
		boolean isOK = bPrinter instanceof ColorPrinter;
		System.out.println(isOK);
		
		
		boolean isOK1 = bPrinter instanceof Printer;
		System.out.println(isOK1);
		
	}

}
