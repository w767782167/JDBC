
public class BubbleSortDemo03 {
	
	
	//打印数组
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
	
	static void swap(int[] arr,int index1,int index2){
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	static void bubbleSort(int[] arr){
		
		/*
		for(int i = 1;i<=arr.length-1;i++){
			if(arr[i-1]>arr[i]){
				swap(arr,i-1,i);
			}
		}
		
		for(int i = 1;i<=arr.length-2;i++){
			if(arr[i-1]>arr[i]){
				swap(arr,i-1,i);
			}
		}*/
		
		for(int times = 1;times<=arr.length-1;times++){
			for(int i = 1;i<=arr.length-times;i++){
				if(arr[i-1]>arr[i]){
					swap(arr,i-1,i);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,6,4,7,2};
		printArr(arr);
		System.out.println("-----------------");
		bubbleSort(arr);
		printArr(arr);
	}

}
