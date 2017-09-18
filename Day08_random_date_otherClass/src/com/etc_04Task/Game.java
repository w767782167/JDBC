package com.etc_04Task;
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
		
		int cnum = 0;
		int unum = 0;
		for(int i = 0;i<5;i++){  //5局  胜
			int  cfist =  c.showFist();
			int  ufist =  u.showFist();
			if(ufist==cfist){
				System.out.println("平局");
			}else if((cfist==1 && ufist==2)||(cfist==2 && ufist==3)||(cfist==3 && ufist==1)){
				System.out.println("恭喜"+c.getNickName());
				
				c.setScore(c.getScore()+1);//积分
				cnum++;
			}else{
				System.out.println("恭喜"+u.getNickName());
				
				u.setScore(u.getScore()+1);//积分
				unum++;
			}
		}
		
		
//		调用最终结果的方法
		showResult(cnum, unum);
		
		
	}
	
	public void showResult(int cnum,int unum){
	    System.out.println("--------最终结果-----------------");
	    System.out.println(cnum+"  VS   "+unum);
		if(cnum>unum){
			System.out.println("最终结果:恭喜"+c.getNickName()+"score:"+c.getScore());
		}else if(cnum<unum){
			System.out.println("最终结果:恭喜"+u.getNickName()+"score:"+u.getScore());
		}else{
			System.out.println("最终结果:平局");
		}
	}
	
	

}
