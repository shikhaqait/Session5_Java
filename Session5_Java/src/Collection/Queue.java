package Collection;

import java.util.Scanner;

public class Queue implements List {
	
	int arr[]= new int[5];
	int capacity = 5;
	 int size = 0;  
	 int top = -1;  
	 int rear = 0;  

	@Override
	public boolean insertElement() {
		System.out.println("Enter Number : ");
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
		  if (top < capacity - 1) {  
			   top++;  
			   int value = scan.nextInt();
			   arr[top] = value;  
//			   System.out.println("Element " + value  
//			     + " is pushed to Queue !");  
		  }}
			   printElement();  
			  
		return false;
	}

	@Override
	public int deleteElement() {
		 if (top >= rear) {  
			   rear++;  
			   System.out.println("Pop operation done !");  
			   printElement();
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
		  if (top >= rear) {  
			   System.out.println("Elements in Queue : ");  
			   for (int i = rear; i <= top; i++) {  
			    System.out.println(arr[i]);  
			   }  
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
	Queue da = new Queue();
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
