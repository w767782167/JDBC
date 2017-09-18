package com.etc._01InetAddressDemo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * IP操作
 * @author Administrator
 *
 */
public class InetAddressDemo {
	public static void main(String[] args) throws IOException {
		InetAddress ip =  InetAddress.getByName("MNBAUV1MW3IICTF");
//		InetAddress ip =  InetAddress.getByName("www.baidu.com");
		System.out.println(ip);
		
		//获取主机名称
		System.out.println(ip.getHostName());
		
		//获取IP地址
		System.out.println(ip.getHostAddress());
		
		
		//boolean isReachable(int timeout)  测试是否可以达到该地址。 
		System.out.println(ip.isReachable(5000));
		
		System.out.println(InetAddress.getLocalHost());
		
		
		
	}

}
