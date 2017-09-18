package com.etc._05UDPDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class AskClient {
	public static void main(String[] args) throws IOException {
		//1.确定要发送什么,   "下班,约吗?"
		String str = "下班,约吗";
		byte[] buf = str.getBytes();
		InetAddress ia = InetAddress.getByName("localhost");
		DatagramPacket dp = new DatagramPacket(buf, buf.length, ia, 6666);
		
		//2创建套接字
		DatagramSocket ds = new DatagramSocket();
		
		ds.send(dp);
		
		
		ds.close();
		
	}

}
