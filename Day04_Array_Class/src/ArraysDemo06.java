import java.util.Arrays;

//java.lang  系统默认已经导入


/**
 * Arrays  系统提供工具类
 * @author Administrator
 *
 */

public class ArraysDemo06 {
	public static void main(String[] args) {
		int[] ages = {17,23,21,18};
		//打印数组
		Arrays.toString(ages); //只是字符串
		
		System.out.println(java.util.Arrays.toString(ages));
		
		
		
		Arrays.sort(ages);
		System.out.println(java.util.Arrays.toString(ages));
	}

}
