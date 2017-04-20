package Collection;

import java.util.Scanner;


public class DynamicArray implements List {
	
	int arr[] = new int[5];
	//int newArray[] = new int[10];


	@Override
	public boolean insertElement() {
		System.out.println("Enter Number : ");
		Scanner scan = new Scanner(System.in);
		for (int i=0;i<arr.length+5;i++)
		{
		if(i<=4)
		{
		arr[i]= scan.nextInt();
		System.out.println(arr[i]);
		}
		else
		{
			int[] newArray = arr;
			newArray = new int[10];
			newArray[i]= scan.nextInt();
			System.out.println(newArray[i]);
		}
		}		
		return false;
	}

	@Override
	public int deleteElement() {
		System.out.println("Enter Index value for removal : ");
		Scanner scan = new Scanner(System.in);
		int j = scan.nextInt();
		for (int i=0; i<arr.length;i++)
		{
			if (arr[i]==arr[j])
			{
				int[] newArray = arr;
				System.out.println(newArray[i]);
			}
			else
				System.out.println(arr[i]);
		}
		return 0;
	}

	@Override
	public int getSize() {
		 int size = arr.length;
		  System.out.println(size);
		return 0;
	}

	@Override
	public int updateValue(int position) {
		System.out.println("Enter value : ");
		Scanner scan = new Scanner(System.in);
		int j = scan.nextInt();
		int index=position;
		arr[index]=j;
		for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		}
		return 0;
	}

	@Override
	public Object getElement(int position) {
		System.out.println("Element at position "+position+" is : "+arr[position]);
		return null;
	}

	@Override
	public void printElement() {
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}		
	}

	@Override
	public int getElementPosition(int value) {
		int element = value;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==value)
			{
				System.out.println(i);
			}
		}
		return 0;
	}
	
	public static void main(String args[])
	{
		DynamicArray da = new DynamicArray();
		System.out.println("You are in Insert Element");
		da.insertElement();
		System.out.println("You are in Delete Element");
		da.deleteElement();
		System.out.println("You are in GetSize");
		da.getSize();
		System.out.println("You are in Update value");
		da.updateValue(2);
		System.out.println("You are in GetElement");
		da.getElement(2);
		System.out.println("You are in Print Element");
		da.printElement();
		System.out.println("You are in GetElement Position");
		da.getElementPosition(2);
	}

}
