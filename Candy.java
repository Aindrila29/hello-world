package newyeargift;

public class Candy extends Chocolate implements NewYearGift {
	Candy(int weight,int price)
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
