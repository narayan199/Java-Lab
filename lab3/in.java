class Parent
{
	public int a=20;
	public void sahil()
	{
		System.out.println("a");

	}
}
class Child extends Parent
{
	Child()

	{
	super();
    }
	public int b=10;
	public void methodname()
	{
		System.out.println("b");
		System.out.println("Sum is:"+(a+b));
	}
}
class super_class
{
	public static void main(String[] args)
	{
		Child obj = new Child();
		obj.sahil();
		obj.methodname();
	}
}