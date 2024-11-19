package day4;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    public void deposit(int amount) {
        if(isAmountvalid(amount)){
            balance += amount;
        }else{
            System.out.println("유효하지 않는 금액입니다.");
        }
    }

    public void withdraw(int amount){
        if (isAmountvalid(amount) && balance-amount>=0){
            balance -= amount;
        }else{
            System.out.println("잔액이 충분하지 않습니다.");
        }
    }

    private boolean isAmountvalid(int amount){
        return amount>0;
    }

}
