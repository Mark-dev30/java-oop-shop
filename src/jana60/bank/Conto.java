package jana60.bank;

import java.util.Random;

public class Conto {
	private int n_account;
	private String name;
	private double balance;
	
	public Conto (String name) {
		Random rd = new Random();
		this.n_account = rd.nextInt(1,1000);
		setName(name);
		this.balance = 0;
		
	}
	
	public int getN_account() {
		return n_account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	
	public String infoAccount(int n_account, String name, double balance) {
		String naccount = "" + n_account;
		String totalbalance = "" + balance;
		return "Numero Conto: " + 
				naccount + 
				"\nNome: " + 
				name + 
				"\nSaldo: " +
				totalbalance;
	}
	public double Pay(double sum, double balance) {
		double newbalance = sum + balance;
		return newbalance;
	}
	public double Withdraw(double sum, double balance) {
		if(sum > balance) {
			 System.out.println("Mi dispiace non puoi prelevare più del tuo saldo");
			 return balance;
		}
		else {
			this.balance = balance - sum;
			return balance;
		}
			
		
	}
	
	@Override
	public String toString() {
		return "Numero Conto: " 
	+ this.n_account + 
	"\nNome: " + 
	this.name +
	"\nSaldo Disponibile: " +
	this.balance;
	}
	
}
