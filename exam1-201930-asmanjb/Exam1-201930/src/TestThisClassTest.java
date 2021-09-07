
public class TestThisClassTest
{	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int k = TestThisClass.countTwoMultiples(5);
		if(k == 0)
			System.out.println(true);
		k = TestThisClass.countTwoMultiples(8);
		if(k == 3)
			System.out.println(true);
		k = TestThisClass.countTwoMultiples(2);
		if(k == 1)
			System.out.println(true);
		k = TestThisClass.countTwoMultiples(100);
		if(k == 2)
			System.out.println(true);
		k = TestThisClass.countTwoMultiples(25);
		if(k == 0)
			System.out.println(true);
		k = TestThisClass.countTwoMultiples(70);
		if(k == 1)
			System.out.println(true);
	}

}
