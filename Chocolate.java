package newyeargift;

public class Chocolate {
	string name;
	int size;
    public void get_info()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        size=sc.nextInt();
        System.out.println("Enter the name");
        name=sc.nextLine();
    }

}
