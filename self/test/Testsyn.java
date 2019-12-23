package self.test;

public class Testsyn {
    public static void main(String[] args) {
        Account account = new Account("1001","123456",2000D);
        Dad d = new Dad(account);
        Mom m = new Mom(account);

        Thread thread1 = new Thread(d);
        Thread thread2 = new Thread(m);

        thread1.start();
        thread2.start();

    }
}

class Dad implements java.lang.Runnable {
    Account account;

    public Dad(Account account) {
        this.account = account;
    }

    @Override
    public void run(){
        account.withdrawal("1001","123456",1200D);
    }
}


class Mom implements java.lang.Runnable {
    Account account;

    public Mom(Account account) {
        this.account = account;
    }

    @Override
    public void run(){
        account.withdrawal("1001","123456",1200D);
    }
}


class Account{
    String cardNo;
    String password;
    double balance;

    public Account(String cardNo, String password, double balance) {
        this.cardNo = cardNo;
        this.password = password;
        this.balance = balance;
    }
    public void withdrawal(String cardNo,String password,double money){
        synchronized (this) {
            System.out.println("请稍后..........");
            if (this.cardNo.equals(cardNo) && this.password.equals(password)) {
                System.out.println("成功，请稍后..........");

                if (money < balance) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    balance -= money;
                    System.out.println("取款成功，当前余额为：" + balance);
                } else {
                    System.out.println("取款失败");
                }
            } else {
                System.out.println("卡号或密码错误");
            }
        }
    }
}