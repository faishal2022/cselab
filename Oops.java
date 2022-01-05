class God{
	void display(String S)
	{
	System.out.println(S);
	}
}
class Oops{
	public static void main(String args[])
	{
	God g=new God();
	g.display("almighty");
	God x = new God();
	    x.display("rahman");
       // System.out.println(g.hashCode());
       // System.out.println(x.hashCode());
	}
	
}