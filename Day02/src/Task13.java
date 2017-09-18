
public class Task13 {
	public static void main(String[] args) {
		/*4. 猴子吃桃:猴子第一天摘了若干个桃子，
		当即吃了一半，还不过瘾，又多吃了一个。
		第 2 天早上又将剩下的桃子吃掉一半，还不过瘾，
		又多吃了一个。以后每天早上都吃了前 一天剩下的一半加一个。
		到第 10 天早上再想吃的时候，就只剩下一个桃子了。
		请问第 一天共摘了多少个桃子。*/
		int total = 1;
		for(int i=9;i>=1;i--){
			total = (total+1)*2;
			System.out.println("第"+i+"天,没吃之前还有"+total+"个");
		}
		System.out.println("total =" +total);
		
		
		
	}

}
