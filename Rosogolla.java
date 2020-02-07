package newyeargift;

public class Rosogolla extends Sweet implements NewYearGift {
	        Rosogolla(int weight,int price)
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
