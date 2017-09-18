package com.etc._05UDPDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class AskClient {
	public static void main(String[] args) throws IOException {
		
		System.out.println("我是客户端........");
		//1.确定要发送什么,   "下班,约吗?"
		String str = "下班,约吗";
		byte[] buf = str.getBytes();
		InetAddress ia = InetAddress.getByName("localhost");
		DatagramPacket dp = new DatagramPacket(buf, buf.length, ia, 6666);
		
		//2创建套接字
		DatagramSocket ds = new DatagramSocket();
		
		//3.发送信息 给服务端
		ds.send(dp);
		
		
		//-------接收服务端发过来的信息.....
		byte[] buf1 = new byte[1024];
		DatagramPacket dp1 = new DatagramPacket(buf1, buf1.length);
		ds.receive(dp1);
		
		String reply = new String(buf1, 0, dp1.getLength());
		System.out.println("服务端说:"+reply);
		
		
		
		//4.关闭资源
		ds.close();
		
	}

}
