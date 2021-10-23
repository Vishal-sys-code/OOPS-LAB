
class Bank{
    private String Account_Holder_Name;
    private int Account_Number;
    private String Account_Type;
    private double Balance;

    void setDatabase(String name, String type, int number,double bal){
        this.Account_Holder_Name = name;
        this.Account_Number = number;
        this.Account_Type = type;
        this.Balance = bal;
    }
    
    void withdraw_money(double withdrawal){
        Balance-=withdrawal;
        System.out.println("Balance is(After Withdraw): " + Balance);
    }

    void deposit_money(double deposit){
        Balance+=deposit;
        System.out.println("Balance is(After Depositing): " + Balance);
    }

    void Account_Type(String account_type){
        if(account_type == "S"){
            System.out.println("Account Type: " + "Savings Account");
        }
        else{
            System.out.println("Account Type: " + "Current Account");
        }
    }

    void display(){
        System.out.println("Name: " + Account_Holder_Name);
        System.out.println("Account Number: " + Account_Number);
        System.out.println("Account Type: " + Account_Type);
        System.out.println("Balance: " + Balance);
    }
}

public class Bank_Account {
    public static void main(String[] args){
        Bank person1 = new Bank();
        Bank person2 = new Bank();

        System.out.println("---------PERSON 1 ----------");

        person1.setDatabase("Vishal", "S", 333333333, 40000);
        person1.display();
        person1.Account_Type("S");
        person1.deposit_money(1000);
        person1.withdraw_money(500);

        System.out.println("---------PERSON 2 ----------");

        person2.setDatabase("Namagiri", "S", 1729, 10000000);
        person2.display();
        person2.Account_Type("S");
        person2.deposit_money(30000000);
        person2.withdraw_money(50000);
    }
}
