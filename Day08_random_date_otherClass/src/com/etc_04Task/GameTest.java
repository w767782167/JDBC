package com.etc_04Task;

import java.util.Scanner;

public class GameTest {
	
	public static void main(String[] args) {
		User u = new User("柯洁");
		//u.setNickName("柯洁");
		
		Computer c = new Computer("alphago");
		//c.setNickName("alphago");
		
		Game g = new Game(c,u);
		
		while (true) {
			g.pk();
			System.out.println("是否继续游戏:y继续/非y退出");
			Scanner sc = new Scanner(System.in);
			String res = sc.next();
			if(!res.equalsIgnoreCase("y")){
				break;
				//System.exit(0);
			}
			
		}
		
		System.out.println("Game Over");
		
		
		
		
		
	}

}
