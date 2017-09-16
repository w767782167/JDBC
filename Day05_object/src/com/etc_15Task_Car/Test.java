package com.etc_15Task_Car;

/*3、	设计右边几个类，Car自定义初始化方法，
初始化方法传入引擎对象和车灯对象。当车启动的时候，
会调用引擎转动，车灯亮灯；
当车停止的时候调用引擎停止转动，车灯熄灭*/

public class Test {
	public static void main(String[] args) {
		Lamp l = new Lamp(500);
		Engine e = new Engine("六缸发动机",1.8f);
		Car c = new Car("宝马","888888",e,l);
		c.run();
		c.stop();
		
		
	}

}
