
public class ArrayListFunctions {
	private String[] array; // start an array
	private int usedIndicies;  // used to show how much of the array is in use
	
	ArrayListFunctions()
	{
		array = new String[10]; // initialized
		usedIndicies = 0; //start value 
	}
	
	ArrayListFunctions(int size)
	{
		if (size < 0)
		{
			array = new String[10];
		}
		else
		{
			array = new String[size]; //allows for the array size to be modified 
		}
		
		usedIndicies = 0;
	}
	
	public void appendElement(String element)
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
		String[] temp = new String[array.length * 2];
		
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
	

}
