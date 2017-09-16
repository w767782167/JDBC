package com.etc._05UDPDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class AskServer {
	
	public static void main(String[] args) {
		
		try {
			//1.创建套接字
			DatagramSocket ds = new DatagramSocket(6666);
			
			//2.创建数据包
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			
			//3.接收数据包
			ds.receive(dp);
			
			//4.解析数据包
			String mess = new String(buf, 0, dp.getLength());
			System.out.println("客户端说:"+mess);
			
			//5.关闭资源
			ds.close();
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
