
public class Task12 {
	public static void main(String[] args) {
		//3、输出九九乘法表
		/*
		int line = 1;
		for(int i = 1;i<=line;i++){
			System.out.print(i+"*"+line+"="+(i*line)+"\t");
		}
		System.out.println();
		
		line++;
		for(int i = 1;i<=line;i++){
			System.out.print(i+"*"+line+"="+(i*line)+"\t");
		}
		System.out.println();
		
		line++;
		for(int i = 1;i<=line;i++){
			System.out.print(i+"*"+line+"="+(i*line)+"\t");
		}
		System.out.println();
		*/
		
		for(int line = 1;line<=9;line++){
			for(int i = 1;i<=line;i++){
				System.out.print(i+"*"+line+"="+(i*line)+"\t");
			}
			System.out.println();
		}
		
		
	}

}
