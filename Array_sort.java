package javaPRG;

import java.util.Scanner;
public class Array_sort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int [] score = new int [10];
		
		for(int i = 0; i < score.length; i++) {
			 do {
				 System.out.print("숫자를 입력하시오: ");
				 score[i] = sc.nextInt();
		  		}while(score[i] < 0 || score[i] > 100);
		}

	      for(int i = 0; i < score.length; i++) {
	    	  	for(int j = i + 1; j < score.length; j++) {
	    	  		if(score[i] > score[j]) {	
	    	  			int temp = score[i];
	    	  			score[i] = score[j];
	    	  			score[j] = temp;
	    	  		}
	    	  	}
	      	}
	      for(int i = 0; i < score.length; i++) {
	         System.out.print(score[i] + "\t");
	      }

		
	}
}

