package com.etc._01fileDemo;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo03 {
	//案例3:在上面案例的基础上，希望能够遍历某个目录下的，直到整个目录下没有文件夹为止.
	
	public static void showFiles(File file){
		if(file.isFile()){ //文件
			System.out.println(file.getAbsolutePath()+","+
		file.getName()+",大小:"+file.length()+",最后修改时间:"+
					new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(new Date(file.lastModified())));
		}else{ //文件夹
			File[] listFiles = file.listFiles();//子目录和文件
			for (File file2 : listFiles) {
				showFiles(file2);//字节调用自己   递归
			}
		}
	}
	
	
	public static void main(String[] args) {
		File file = new File("E:/javaAll/01javase/课堂笔记");
		if(file.exists()){
			showFiles(file);
		}
		
		
	}

}
