package com.itdr.HelloWorld.JD.Utils;

import com.itdr.HelloWorld.JD.Login.Login;
import com.itdr.HelloWorld.JD.Pay.PayTest;
import com.itdr.HelloWorld.JD.Product.Product;
import com.itdr.HelloWorld.JD.Regist.Regist;


import java.util.Scanner;

/**
 * @创建作者 李明航
 * @创建时间 2019.01.09
 * @描述
 */
public class UTest {
    public static void main(String[] args) {
        //需要进行初始化的一些东西
        //1.存储用户数据的数组
        String[][] account = new String[3][2];
        //键盘录入
        Scanner sc = new Scanner(System.in);

        //初始化货架
        Product[] pro = new Product[1];
        System.out.println("请录入商品信息！");
        for(int i= 0;i<pro.length;i++){
            //获取新商品的过程
            int id = sc.nextInt();
            String name = sc.next();
            int price = sc.nextInt();
            String infor = sc.next();
            Product p=  Product.getNew(id,name,price,infor);
            pro[i]=p;
        }

        //程序的主入口
        while (true) {
            PBUtils.welcome();

            //选择功能
            int xz = sc.nextInt();

            //登录的过程
            if (xz == 1) {
                String name = Regist.GetRegistInfor("lmh","123").getUname();
                String pwd = Regist.GetRegistInfor("lmh","123").getUpassword();
                Login.login(name,pwd);break;
            }
            //注册的过程
            if (xz == 2) {
                System.out.println("请输入注册账户：");
                String uname = sc.next();
                System.out.println("请输入注册密码：");
                String upassword = sc.next();
                Regist.GetRegistInfor(uname,upassword);
                //显示商品的过程
            } if(xz==3){
                for(int i=0;i<pro.length;i++){
                    System.out.println("商品ID："+pro[i].id);
                    System.out.println("商品名称："+pro[i].name);
                    System.out.println("商品价格："+pro[i].price);
                    System.out.println("商品详情："+pro[i].infor);
                }
            }
            //购买商品的过程
            if(xz==4){
                PayTest.getpay( Regist.GetRegistInfor("lmh","123").getUname(), Regist.GetRegistInfor("lmh","123").getUpassword());
            }

        }

    }
}
