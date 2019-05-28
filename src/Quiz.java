
public class Quiz {
	public static void main(String args[]) {

		String s1 = "copyandpastecopyandpastecopyandpastecopyandpastecopyandpastecopyandpastecommitandpushcommitandpushcommitandpushcommitandpushpushcccccommmitttsss";
		//The total number of characters in the sentence
		int num = s1.length();
		System.out.println("Length of string s1 is : " + num);
		
		//part 2
		int index=s1.length()-15;
		String sub=s1.substring(index);
		System.out.println("The last 15 characters in the string is "+sub);

		// part 3
		int count=0;
		int count1=0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='c')
			{
				count++;
			}
			else if(s1.charAt(i)=='p')
			{
				count1++;
			}
			
		}
		
		System.out.println("Number of time c appears is "+count);
		System.out.println("Number of time p appears is "+count1);
		
		
	}

}
