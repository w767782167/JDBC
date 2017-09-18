
public class Task11 {
	public static void main(String[] args) {
		/*2、输出三角形图案
		*
		**
		***
		****
		*/
		/*
		int line = 1;
		for(int i = 0;i<line;i++){
			System.out.print("*");
		}
		System.out.println();
		
		line++;
		for(int i = 0;i<line;i++){
			System.out.print("*");
		}
		System.out.println();
		
		line++;
		for(int i = 0;i<line;i++){
			System.out.print("*");
		}
		System.out.println();
		*/
		
		for(int line = 1;line<=5;line++){
			for(int i = 1;i<=line;i++){
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
