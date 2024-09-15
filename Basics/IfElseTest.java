class IfElseTest
{
	public static void main(String args[])
	{
		int number[] = {5,60,70,80,90};
		int even = 0, odd = 0;
			for (int i = 0; i < number.length;i++)
				{
					if((number[i]%2)==0)
						{
							even += 1;
						}
					else
						{
							odd += 1;

						}
				}
				System.out.println("Even Numbers : "+even + " Odd Numbers : "+odd);
		}
}