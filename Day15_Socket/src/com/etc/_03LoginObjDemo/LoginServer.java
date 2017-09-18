package com.etc._03LoginObjDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 * @author Administrator
 *
 */
public class LoginServer {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("服务端准备好了.....");
//		1.	建立服务器端Socket绑定指定端口并开始监听
		ServerSocket server = new ServerSocket(8888);//大于1024 65535
//		2.	使用accept()方法阻塞等待监听，获得新的连接
		Socket client = server.accept();
		System.out.println("连接过来的客户端:"+client.getInetAddress());
//		3.	获得输入流
		InputStream inputStream = client.getInputStream();
	    ObjectInputStream ois = new ObjectInputStream(inputStream);
//		4.	获得输入流里客户端的信息
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
	    server.close();

	}

}
