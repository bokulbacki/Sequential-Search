import java.util.Scanner;
public class Searcher
	{

		public static void main(String[] args)
			{
				System.out.println("\"dog\"");
				System.out.println("\t\\dog");
				Scanner userInput = new Scanner(System.in);
				boolean num=false;
				int [] numbers = new int [7];
				numbers [0] = 1;
				numbers [1] = 3;
				numbers [2] = 9;
				numbers [3] = 2;
				numbers [4] = 4;
				numbers [5] = 6;
				numbers [6] = 8;
				System.out.println("Ask for a number and it will tell you the index.");
				int number = userInput.nextInt();
				
				for (int i =0; i<numbers.length; i++)
					{
						if (number == numbers[i])
							{
								System.out.println("This value is in this index " + i);
								num=true;
							}
						
					}
				if (num == true)
					{
						
					}
				else
					{
						System.out.println("-1");
					}
				
				
						
				
				

			}

	}
