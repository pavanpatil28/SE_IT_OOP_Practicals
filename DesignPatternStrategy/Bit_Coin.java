
public class Bit_Coin implements PaymentStrategy 
{
	private String bitmail;
	private String password;

	public Bit_Coin(String mail, String pwd) 
	{
		this.bitmail = bitmail;
		this.password = pwd;
	}

	// @Override
	public void pay(int amount) 
	{
		System.out.println(" --> Rs - " + amount + " Paid Using BitCoin. ");
	}
}
