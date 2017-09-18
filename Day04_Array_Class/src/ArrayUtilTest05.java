/**
 * 工具类的使用
 * @author Administrator
 *
 */

public class ArrayUtilTest05 {
	
	public static void main(String[] args) {
		int[] ages = {17,18,19,16,15};
		ArrayUtil04.printArr(ages);
		
		//地址传递
		ArrayUtil04.sort(ages);
		ArrayUtil04.printArr(ages);
		
	}

}
