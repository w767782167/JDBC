package com.etc_02showfist;

public class GameTest {
	
	public static void main(String[] args) {
		User u = new User("柯洁");
		//u.setNickName("柯洁");
		
		Computer c = new Computer("alphago");
		//c.setNickName("alphago");
		
//		Game g = new Game(c,u);
//		g.pk();
		
		Game g = new Game();
		g.pk(c,u);
		
		
	}

}
