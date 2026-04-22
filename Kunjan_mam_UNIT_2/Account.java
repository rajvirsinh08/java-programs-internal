import java.util.*;
public class Account
{
	int accno;
	String nm;
	double blnce;
	String actype;
	String brnch;
	
	Account()
	{
		accno=10001;
		nm="Default";
		blnce=50000.00;
		brnch="Shahibaug";
		actype="Saving";
		this.displ();
	}
	
	Account(int accno,String nm,double blnce,String actype,String brnch)
	{
		this.accno=accno;
		this.nm=nm;
		this.blnce=blnce;
		this.actype=actype;
		this.brnch=brnch;
		this.displ();
	}
	Account(Account a2)
	{
		this.accno=a2.accno;
		this.nm=a2.nm;
		this.blnce=a2.blnce;
		this.actype=a2.actype;
		this.brnch=a2.brnch;
		this.displ();
	}
	void displ()
	{
		System.out.println("Account no: "+accno);
		System.out.println("Name : "+nm);
		System.out.println("Balance : "+blnce);
		System.out.println("Account Type: "+actype);
		System.out.println("Branch name : "+brnch);
	}
	public static void main(String[] args)
	{
		System.out.println("\nDefualt Constructor \n ");
		Account ac1=new Account();
		System.out.println("\nParmeterized Constructor \n ");
		Account ac2=new Account(1001101,"Kevin",25000.00,"Current","Kalol");
		System.out.println("\nCopy Cobstructor \n");
		Account cp=new Account(ac2);
	}
}