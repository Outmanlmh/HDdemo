package com.itdr.HelloWorld.JD.Utils;

import java.util.Scanner;

/**
 * @创建作者 李明航
 * @创建时间 2019.01.09
 * @描述
 */
public class PBUtils {
    //
    public  static void  welcome(){
        Scanner sc =new Scanner(System.in);
        System.out.println("欢迎来到小明杂货铺");
        System.out.println("请输入功能编号选择功能：");
        System.out.println("1.登录 2.注册3.查看商品4.购买商品");
    }

}
