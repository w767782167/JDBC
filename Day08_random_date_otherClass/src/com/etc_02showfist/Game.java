package com.etc_02showfist;
/**
 * 人机对战
 * @author Administrator
 *
 */


public class Game {
	private Computer c;
	private User u;
	
	
	public Game(Computer c, User u) {
		super();
		this.c = c;
		this.u = u;
	}


	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * 两个人比赛
	 */
	public void pk(){
		int  cfist =  c.showFist();
		int  ufist =  u.showFist();
		if(ufist==cfist){
			System.out.println("平局");
		}else if((cfist==1 && ufist==2)||(cfist==2 && ufist==3)||(cfist==3 && ufist==1)){
			System.out.println("恭喜"+c.getNickName());
		}else{
			System.out.println("恭喜"+u.getNickName());
		}
		
	}
	
	public void pk(Computer c, User u){
		int  cfist =  c.showFist();
		int  ufist =  u.showFist();
		if(ufist==cfist){
			System.out.println("平局");
		}else if((cfist==1 && ufist==2)||(cfist==2 && ufist==3)||(cfist==3 && ufist==1)){
			System.out.println("恭喜"+c.getNickName());
		}else{
			System.out.println("恭喜"+u.getNickName());
		}
		
	}

}
