package application;


public class ArrayListFunctions {
	private ReceipeList[] array; // start an array
	private int usedIndicies;  // used to show how much of the array is in use
	
	ArrayListFunctions()
	{
		array = new ReceipeList[10]; // initialized
		usedIndicies = 0; //start value 
	}
	
	ArrayListFunctions(int size)
	{
		if (size < 0)
		{
			array = new ReceipeList[10];
		}
		else
		{
			array = new ReceipeList[size]; //allows for the array size to be modified 
		}
		
		usedIndicies = 0;
	}
	
	public void appendElement(ReceipeList element)
	{
		if(usedIndicies >= array.length)
		{
			doubleArray();//calls double array if the userindicies is to big for the array
		}
		
		array[usedIndicies] = element;
		usedIndicies++;
	}
	
	private void doubleArray()
	{
		ReceipeList[] temp = new ReceipeList[array.length * 2];
		
		for(int i = 0; i < array.length; ++i)
		{
			temp[i] = array[i];
		}
		
		array = temp;
	}
	
	public void printArray()
	{
		for(int i = 0; i < usedIndicies; ++i)
		{
			System.out.println(array[i]);
		}
	}
	
	int findElementByTime(int value) {
		for(int i = 0; i < array.length; ++i) {
			if(array[i].getTime() == value) {
				System.out.println(array[i].getName() + ": ");
				array[i].printIngredients();
				
				return i;
			}
		}
		
		return -1;
	}
	/*Work on later
	int findElementByIngredient(String value) {
		for(int i = 0; i < array.length; ++i) {
			f(array[i].getTime() == value) {
				System.out.println(i);
				return i;
			}
		}
		
		return -1;
	}*/

}
