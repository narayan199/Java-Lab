interface email
{
	public void send();
}
interface login 
{
	public void log();
}
class Demo implements email,login
{
	String name;
	String email;
	public void send()
	{
		name = "Sahil";
		System.out.println(name);
	}
	public void log()
	{
		email = "sahil@gmail.com";
		System.out.println(email);

	}

	public static void main(String[] args)
	{
		Demo obj = new Demo();
		obj.send();
		obj.log();

	}
}