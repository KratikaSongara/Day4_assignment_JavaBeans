package com.masai;

public class Question4 {

	void number(int n)
	{
		if(n%2!=0)
		{
			System.out.println(n);
		}
		else if(n%2==0)
		{
			if(n%10==0)
			{
				System.out.println(n+10);
			}
			else
			{
				while(n%10!=0)
				{
					n++;
				}
				System.out.println(n);
			}
		}
		else if(n<0)
		{
			System.out.println("Error");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question4 obj = new Question4();
		obj.number(44);
		obj.number(45);
		obj.number(-5);
	}

}
