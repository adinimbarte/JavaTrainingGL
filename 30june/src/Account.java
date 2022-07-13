
class SavingAcoount extends Account{
	public SavingAcoount(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}
	public double intrest;
	public void SavingAccount(double balance,int accountNo)
	{
		this.balance=balance;
		this.accountNo=accountNo;
}
	public double calculateIntrest()
	{
		return balance+(balance*intrest);
	}
	
}
class CurrentAccount extends Account{
	public int OVERDRAFT_LIMIT=1000000;
	public CurrentAccount(double balance,int accountNo)
	{
		
		this.balance=balance;
		this.accountNo=accountNo;
		
	}
	
}

public class Account {
	public int accountNo;
	public double balance;
	public Account(int num)
	{
		balance=0.0;
		accountNo=num;
	}
	public void deposit(double amt)
	{
		if(amt>0)
		balance+=amt;
		else
			System.out.println("Cannot deposit negative amount");
	}
	public void withdraw(double amt)
	{
		if (amt<=balance)
		{
			balance-=amt;
		}
		else
			System.out.println("You don't have Sufficient balance");
	}
	public double getBalance()
	{
		return balance;
	}
	public int getAccountNo()
	{
		return accountNo;
	}

	@Override
	public String toString()
	{
		return "Account number is "+accountNo+" the balance is "+balance+"";
		
	}
	public final void print()
	{
		System.out.println(toString());
	}
	public static void main(String[] args) {
		
	}

}
