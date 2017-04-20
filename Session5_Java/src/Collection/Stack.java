package Collection;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Stack implements List {
	
	int arr[]= new int[5];
	int top=-1, size=arr.length, len=0;

	@Override
	public boolean insertElement() {
	
		System.out.println("Enter Number : ");
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			if(top + 1 >= size)
	            throw new IndexOutOfBoundsException("Overflow Exception");
	        if(top + 1 < size ){
	         int value = scan.nextInt();
	            arr[++top] = value;
	        len++ ;
	        }
		}
		printElement();
		return false;
	}
	public boolean isEmpty()
    {
        return top == -1;
    }

	@Override
	public int deleteElement() {
		if( isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        len-- ;
        printElement();
      return arr[top--]; 
		
	}

	@Override
	public int getSize() {
		System.out.println(len);
		return len;
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
		for (int i = top; i >= 0; i--)
            System.out.print(arr[i]+" ");
        System.out.println();
		
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
		Stack da = new Stack();
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
