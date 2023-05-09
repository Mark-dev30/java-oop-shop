package jana60.bank;

import java.util.Scanner;


public class Bank {
	public static void main(String[] args) {
		System.out.println("Benvenuto! Inserisci il tuo nome:");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		Conto account = new Conto(name);
		while(true) {
			System.out.println("Scegli il numero corrispondente per accedere all'operazione desiderata: "
					+ "\n1)Informazioni Conto. "
					+ "\n2)Preleva."
					+ "\n3)Deposita."
					+ "\n4)Annulla");
			int num = in.nextInt();
			int n_account = account.getN_account();
			String nameaccount = account.getName();
			double balance = account.getBalance();
			if(num == 1) {
				
				System.out.println(account.infoAccount(n_account,nameaccount,balance));
				System.out.println("----------------------");
			}
			else if(num == 2) {
				System.out.println("Quanto vuoi prelevare?");
				int sum = in.nextInt();
				System.out.println("Il tuo saldo attuale: " + account.Withdraw(sum) + "Euro");
				System.out.println("----------------------");
			}
			else if(num == 3) {
				System.out.println("Quanto vuoi depositare");
				int sum = in.nextInt();
				System.out.println("Il tuo saldo attuale: " + account.Pay( sum) + "Euro");
				System.out.println("----------------------");
			}
			else if(num == 4) {
				System.out.println("Grazie per averci scelto");
				break;
			}
			else {
				System.out.println("Hai inserito un valore sbagliato");
				System.out.println("----------------------");
			}
		}
		
	}
}
