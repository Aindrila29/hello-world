package newyeargift;

public class GiftAnalysis {
	public static void inputSweet()
	{
		System.out.println("Enter no of sweets");
		int numberOfSweeets=input.nextInt();
		for(int sweetCount =1; sweetCount<=numberOfSweets; SweetCount++)
		{
			System.out.println("Enter the type of the sweets(Enter the choice): A. Rosogolla B: Laddu");
			System.out.println("enter the weight of the sweet");
			int sweetWeight= input.nextInt();
			System.out.println("enter the price of the sweet");
			int sweetPrice=input.nextInt();
			Sweet sweet = new Sweet(sweetWeight,sweetPrice);
			sweets.add(sweet);
		}
}