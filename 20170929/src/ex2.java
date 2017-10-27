
public class ex2 {
	
	public static void main(String[] args) {
		
		int[] coinUnit = { 500,100,50,10};
		
		int money = 2600;
		int cnt ;
		System.out.println("money =" + money);
		
		for(int i =0 ; i< coinUnit.length;i++)
		{
			
		    cnt = money/coinUnit[i];
		     			
			System.out.println(coinUnit[i] + " = " + cnt);
			
			money = money - cnt * coinUnit[i];
		}

	
	
	
	}

}
