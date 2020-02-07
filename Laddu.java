package newyeargift;

public class Laddu extends Sweet implements NewYearGift
{
	 Laddu(int weight,int price)
     {
     	super(weight,price);
     }
     public int getweight()
     {
     	return super.giftWeight;
     }
     public int getprice()
     {
     	return super.giftPrice();
     }
     
} 

