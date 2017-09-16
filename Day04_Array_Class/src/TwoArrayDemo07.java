import java.util.Arrays;


public class TwoArrayDemo07 {
	
	static void yangHuiTest(){
		int[][] yanghui = new int[10][10];
		for(int i = 0;i<yanghui.length;i++){
			for(int j=0;j<=i;j++){
				if(j==0 ||j==i){
					yanghui[i][j] = 1;
				}else{
					yanghui[i][j] = yanghui[i-1][j-1]+ yanghui[i-1][j];
				}
				System.out.print(yanghui[i][j]+" \t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5},{6}};
		System.out.println(arr.length);
		
		
		int[] a1 = {1,3,5};
		int[] a2 = {6,7};
		int[] a3 = {9};
		
		int[][] arrays = new int[][]{a1,a2,a3};
		System.out.println(arrays.length);
		
		System.out.println("arrays[1][0] ="+arrays[1][0]);
		
		
		//遍历数组
		for(int i=0;i<arrays.length;i++){
			System.out.println(Arrays.toString(arrays[i]));
			for(int j=0;j<arrays[i].length;j++){
				System.out.println(arrays[i][j]);
			}
		}
		
		
		
		yangHuiTest();
		
		
		
	}

}
