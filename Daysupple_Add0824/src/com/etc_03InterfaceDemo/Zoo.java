package com.etc_03InterfaceDemo;

public class Zoo {
	
//	public void showCat(Cat c){
//		c.walk();
//	}
//	
//	public void showFrog(Frog f){
//		f.walk();
//	}
	
	
	
	//多态
	public void show(IWalkable i){
		i.walk();
	}

}
