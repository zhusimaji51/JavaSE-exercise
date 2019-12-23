package bank_pro;

import java.util.Scanner;
import java.util.Random;

public class Bank1 {

    Scanner sc = new Scanner(System.in);
    private User[] users = new User[5];
    int size = 3;

    public Bank1(){
        User u1 = new User();
        u1.setCardNo("6222020200001234567");
        u1.setIdentity("110101199011223344");
        u1.setUsername("张三");
        u1.setPassword("123456");
        u1.setPhone("13999999999");
        u1.setBalance(2000.0);
        users[0]=u1;

        User u2 = new User("6222020200004455356","110101199011225432","王五","123123","13788998899",5000.0);
        users[1] = u2;

        users[2] = new User();
        users[2].setCardNo("6222020200004455667");
        users[2].setIdentity("110101199011223355");
        users[2].setUsername("李四");
        users[2].setPassword("123456");
        users[2].setPhone("13999994444");
        users[2].setBalance(3000.0);
    }

    public void welcome(){
        System.out.println("================欢迎使用ATM自动银行服务================");
        System.out.println("1：登录 2：注册");
        System.out.println("====================================================");
        System.out.print("请输入操作编号");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                this.login();
                break;
            case 2:
                register();
                break;
            default:
                System.out.println("输入有误");
        }
    }

    public void login(){
        System.out.print("请输入卡号");
        String uno = sc.next();
        System.out.print("请输入密码");
        String pwd = sc.next();
        User res = this.check(uno,pwd);
        if (res!=null){
            this.showMenu(res);
        }else {
            System.out.println("登陆失败!!,用户名或密码错误");
        }

    }

    public User check(String uno,String pwd){
        for (int i = 0 ; i<size; i++){
                if (uno.equals(users[i].getCardNo()) && pwd.equals(users[i].getPassword())){
                    return users[i];
                }
        }
        return null;
    }

    public void withdrawal(User u){ //存款
        System.out.print("请输入取款数目:");
        double money = sc.nextDouble();

        if (u.getBalance()>money){
            u.setBalance(u.getBalance()-money);
            System.out.println("取款成功，余额为:"+u.getBalance());
        }else {
            System.out.println("余额不足");
        }
    }

    public void selectbalance(User u){
        System.out.println("余额为"+u.getBalance());
    }//余额查询

    public void savaMoney(User u){//存款
        System.out.print("请输入存款金额:");
        double money = sc.nextDouble();
        u.setBalance(u.getBalance()+money);
        System.out.println("存款成功,余额为:"+u.getBalance());
    }

    public void tansferMoney(User u){ //转账 (卡号,姓名)
        System.out.print("请输入对方的卡号");
        String ono = sc.next();
        System.out.print("请输入对方的姓名");
        String oname = sc.next();
        //验证
        User other = this.checkother(ono,oname);
        if (other!=null){
            System.out.print("请输入转账金额");
            double money = sc.nextDouble();
            if (money < u.getBalance()){
                u.setBalance(u.getBalance()-money);
                System.out.println("转账成功,余额为"+u.getBalance());
            }else {
                System.out.println("余额不足");
            }
        }else {
            System.out.println("对方不存在!");
        }

    }

    public void register(){//开户

        String id;
        do {
             System.out.println("请输入身份证号");
             id = sc.next();
        }while (id.length()!=18);

        System.out.println("请输入用户名");
        String uname = sc.next();

        System.out.println("请输入密码");
        String upwd = sc.next();

        System.out.println("请输入手机号");
        String phone = sc.next();

        System.out.println("请输入预存金额");
        double money = sc.nextDouble();

        String randomNum =  this.getRandomNum();

        User newUser = new User(randomNum,id,uname,upwd,phone,money);
        this.insertUser(newUser);
        System.out.println("创建成功,卡号为"+newUser.getCardNo());
        login();

    }
    public String getRandomNum(){
        String strsum ="";
        for (int i = 0 ; i<7; i++){
            int random = new Random().nextInt(10);
            strsum+=random;
        }
        String uno ="622202020000"+strsum;
        return uno;
    }

    public void modifyPwd(User u){ //修改密码
        System.out.println("请输入新的密码");
        String newPwd = sc.next();
        u.setPassword(newPwd);
    }

    public void logout(User u){//注销用户
        System.out.println("确定注销? (Y/N)");
        String str = sc.next();
        if ("Y".equals(str)){
            deleteUser(u);
            System.out.println("用户名为"+u.getUsername()+"的用户已注销");
            System.out.println(size);
        }
    }

    public void deleteUser(User u){
        int factor = 0;
        for (int i = 0 ; i<size; i++){
                if (users[i] == u){
                    factor = i;
                    break;
                }
        }
//        System.out.println(factor);
        for (int j = factor ; j<size-1; j++){
            users[j]=users[j+1];
        }
        size--;
    }

    public void insertUser(User u){ //向users数组中插入元素
        if (users.length==5){
            //扩容
            users = java.util.Arrays.copyOf(users,users.length*2);
        }
        users[size] = u;
        size++;
    }

    public User checkother(String uid , String uname){ //根据卡号、姓名查询用户
        for (int i = 0 ; i<size; i++){
            if (users[i]!=null){
                if (uid.equals(users[i].getCardNo()) && uname.equals(users[i].getUsername())){
                    return users[i];
                }
            }
        }
        return null;
    }

    public void showMenu(User u){
        int input;
        do {
            System.out.println("================欢迎使用ATM自动银行服务================");
            System.out.println(" 2：存款 3：取款 4.转账 5.查询余额 6.修改密码 7.修改预留手机号 8.注销用户 0.退出");
            System.out.println("====================================================");
            System.out.print("请输入操作编号");
            input = sc.nextInt();

            switch (input){
                case 0:
                     System.out.println("退出");//
                     return;
                case 2:
                     System.out.println("存款"); //
                     this.savaMoney(u);
                     break;
                case 3:
                     System.out.println("取款");//
                     this.withdrawal(u);
                     break;
                case 4:
                     System.out.println("转账");//
                     this.tansferMoney(u);
                     break;
                case 5:
                     System.out.println("查询余额");//
                     this.selectbalance(u);
                     break;
                case 6:
                     System.out.println("修改密码");//
                     this.modifyPwd(u);
                     break;
                case 7:
                     System.out.println("修改预留手机号");
                     break;
                case 8:
                     System.out.println("注销用户");
                     this.logout(u);
                     break;
                default:
                     System.out.println("输入的操作号有误,请重新输入");
            }
        }while (true);

    }

    public void showAllUser(){
        for (int i = 0 ; i<size; i++){
            System.out.print(users[i].getUsername()+"\t");
        }
        System.out.println();
    }
}
