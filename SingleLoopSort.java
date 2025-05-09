class SingleLoopSort 
{
    public static void main(String[] args)
    {
        int[] array = {5, 3, 8, 4, 2};//l=5
        for (int i = 0; i < array.length * array.length; i++) //i=0;i<5*5=25;
	{
            int j = i % (array.length - 1);//j=0%4
            if (array[j] > array[j + 1])
	    {;
                // Swap elements
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }

        // Print sorted array
        for (int num : array) 
	{
            System.out.print(num + " ");
        }
    }
}