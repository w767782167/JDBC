package com.etc._04LoginMcDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
/**
 * 服务端多线程
 * @author Administrator
 *
 */


public class ServerThread extends Thread{
	private Socket client;
	
	public ServerThread(Socket client){
		this.client = client;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			
//		1.	获得输入流
			InputStream inputStream = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(inputStream);
//		2.	获得输入流里客户端的信息
			Object object = ois.readObject();
			User user = (User)object;
			System.out.println("name="+user.getUserName()+",password="+user.getPassWord());
			
			//------服务端响应信息给客户端     登录成功   判断是否登录成功 数据库
			OutputStream outputStream = client.getOutputStream();
			PrintWriter pw = new PrintWriter(outputStream);
			String str = "登录成功";
			pw.write(str);
			pw.flush();
			
			
			
//		5.	使用close()关闭流和Socket
			ois.close();
			inputStream.close();
			pw.close();
			outputStream.close();
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

}
