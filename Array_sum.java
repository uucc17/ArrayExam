package javaPRG;

public class Array_sum {

	public static void main(String[] args) {
		int [] num = new int[100];
		for(int i = 0; i < num.length; i++) // 0부터 찍기
			num[i]=i+1;
		
		for(int i = 0; i < num.length; i++)
			System.out.println(num[i]);
			
		
	}

}
