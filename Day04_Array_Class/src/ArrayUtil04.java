/**
 * 数组工具类
 * @author Administrator
 *
 */

public class ArrayUtil04 {
	
	//1.打印数组元素:print方法
	static void printArr(int[] arr){
		if(arr==null){
			System.out.println("null");
			return;
		}
		String str="[";
		for(int index = 0;index<arr.length;index++){
			str = str+arr[index];
			if(index != arr.length-1){
				str = str+",";
			}
		}
		str = str+"]";
		System.out.println(str);
	}
	
	
	/*2.数组元素排序*/
	static void swap(int[] arr,int index1,int index2){
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	static void sort(int[] arr){
		for(int times = 1;times<=arr.length-1;times++){
			for(int i = 1;i<=arr.length-times;i++){
				if(arr[i-1]>arr[i]){
					swap(arr,i-1,i);
				}
			}
		}
	}
}
