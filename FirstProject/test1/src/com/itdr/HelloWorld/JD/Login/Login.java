package com.itdr.HelloWorld.JD.Login;

import com.itdr.HelloWorld.JD.Regist.Regist;

import java.util.Scanner;

/**
 * @创建作者 李明航
 * @创建时间 2019.01.08
 * @描述
 */
public class Login {

    public String Lname;
    public String Lpwd ;

    //用户登录
    public static void login(String lname,String lpwd) {
        while (true) {
            Login login = new Login();
            login.Lname = lname;
            login.Lpwd  =lpwd;
//        Regist regist = new Regist();
//        String lname = regist.getUname();
//        String lpwd = regist.getUpassword();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String name = sc.next();
            System.out.println("请输入密码");
            String pwd = sc.next();
            if (name.equals(login.Lname) && pwd.equals(login.Lpwd)) {
                System.out.println("登录成功，欢迎" + login.Lname);break;
            } else {
                System.out.println("登陆失败，请重新输入");
            }

        }

    }


}
