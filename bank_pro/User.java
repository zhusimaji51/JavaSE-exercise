package bank_pro;
 //实体类
public class User {

    private String cardNo; // 卡号
    private String identity;// 身份证号
    private String username;// 用户名
    private String password;// 密码
    private String phone;// 手机号
    private double balance;// 余额

    public User(){}

    public User(String cardNo, String identity, String username, String password, String phone, double balance){
        this.cardNo = cardNo;
        this.identity = identity;
        this.username =  username;
        this.password = password;
        this.phone = phone;
        this.balance = balance;
    }

    public void setCardNo(String cardNo){
        this.cardNo = cardNo;
    }

    public String getCardNo(){
        return this.cardNo;
    }

    public void setIdentity(String identity){
        this.identity = identity;
    }

    public String getIdentity(){
        return this.identity;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setBalance(double blance){
        this.balance = blance;
    }

    public double getBalance(){
        return this.balance;
    }
}

