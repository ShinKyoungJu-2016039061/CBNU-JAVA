
class ExceiptionProblem {

	public static void main(String[] args) {
	
		int[] ar = {10,20,30};
		try
		{
			for(int i=0 ; i <= 3 ; i++)
			{
				System.out.println("ar[" + i + "] : " + ar[i]);	
			}
		}
		catch (Exception e)
		//���ܸ� Exception�̶�� �ص� �ǰ� ArrayIndexOutOfBoundsException �̶�� �ص� �˴ϴ�.
		{
			System.out.println("���ܰ� �߻��߽��ϴ�..");	
		}	

	}

}
