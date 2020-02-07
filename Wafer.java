package newyeargift;

public class Wafer extends Chocolate implements NewYearGift {
	Wafer(int weight,int price)
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
