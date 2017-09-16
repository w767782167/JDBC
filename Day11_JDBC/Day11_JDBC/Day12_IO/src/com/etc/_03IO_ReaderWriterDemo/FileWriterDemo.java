package com.etc._03IO_ReaderWriterDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	//"世界那么大,我想去看看"  ----->  D:/test.txt
	public static void main(String[] args) {
		
		File file = new File("D:/test.txt");
		try {
			FileWriter fw = new FileWriter(file);
			fw.write("世界那么大,我想去看看");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("OK......");
	}

}
