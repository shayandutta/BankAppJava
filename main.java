public class main {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("SA123", 1000, 5);
        savings.deposit(500);
        savings.applyInterest();
        savings.withdraw(2000); 
        savings.withdraw(200);

        System.out.println("---------------NEXT-----------------");

        CheckingAccount checking = new CheckingAccount("CA456", 500, 200);
        checking.deposit(100);
        checking.withdraw(600); 
        checking.withdraw(800); 
    }
}
