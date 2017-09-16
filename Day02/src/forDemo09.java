
public class forDemo09 {
	public static void main(String[] args) {
		
		/*
		//老唐
		for(int i=1;i<=100;i++){
			System.out.println("i="+i);
		}
		//悟空
		for(int i=1;i<=100;i++){
			System.out.println("i="+i);
		}
		
		//八戒
		for(int i=1;i<=100;i++){
			System.out.println("i="+i);
		}
		
		//老沙
		for(int i=1;i<=100;i++){
			System.out.println("i="+i);
		}*/
		
		for(int j = 0;j<4;j++){
			for(int i=1;i<=100;i++){
				System.out.println("i="+i);
				
			}
		}
		
		
		//break
		
		for(int i = 0;i<10;i++){
			if(i==5){
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("----------------");
		//continue
		
		for(int i = 0;i<10;i++){
			if(i==5){
				continue;
			}
			System.out.println(i);
		}
		
	}

}
