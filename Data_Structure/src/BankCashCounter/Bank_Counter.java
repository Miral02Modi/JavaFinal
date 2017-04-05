package BankCashCounter;

public class Bank_Counter {
	
	String uName;
	int id;
	double sal;
	static double totalAmt = 1000000;
	public Bank_Counter(String uname, int id, double amt) {
		super();
		uName = uname;
		this.id = id;
		this.sal = amt;
	}
	
	
	double widthDrawal(double amt){
		if(this.sal < amt){
			System.out.println("Your Balance is less");
			return this.sal;
		}	
		if(this.totalAmt < amt){
			System.out.println("Sry No cach is Avilable");
			return 0;
		}	
		this.sal = this.sal - amt ;
		this.totalAmt = this.totalAmt -amt;
		return this.sal;
	}
	
	double deposite(double amt){
		if(amt < 10000){
			System.out.println("You have to deposite mininmum 10000");
			return 0;
		}	
		this.sal = this.sal + amt ;
		this.totalAmt = this.totalAmt + amt;
		return this.sal;
	}
}
