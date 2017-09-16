package com.etc._04LoginMcDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
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
		Socket client = null;
		int count = 0;
		while(true){
			client = server.accept();
			ServerThread thread = new ServerThread(client);
			//启动线程
			thread.start();
			count++;
			System.out.println("访问数量:"+count);
			
			//ip地址
			InetAddress ip = client.getInetAddress();
			
			System.out.println(ip.getHostAddress());
			
			System.out.println(ip.getHostName());
		}


	}

}
