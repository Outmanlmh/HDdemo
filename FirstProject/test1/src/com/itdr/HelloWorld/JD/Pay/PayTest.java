package com.itdr.HelloWorld.JD.Pay;

import com.itdr.HelloWorld.JD.Product.Product;
import com.itdr.HelloWorld.JD.User.User;
import com.itdr.HelloWorld.JD.mix.ShopCar;

/**
 * @创建作者 李明航
 * @创建时间 2019.01.10
 * @描述
 */
/*
* 1.用户登录
* 2.选购商品
* 3.放入购物车
* 4.付款
* */
public class PayTest {
    public static void getpay(String uname,String upwd) {
        //模拟一个用户
        User user = new User();
        user.setName(uname);

        //模拟一个商品数组
        int[][] pro = new int[3][2];
        //购买商品的个数， 价格
        pro[0][0] = 2;
        pro[0][1] = 10;
        pro[1][0] = 3;
        pro[1][1] = 20;
        pro[2][0] = 4;
        pro[2][1] = 30;

        //模拟加入购物车
        ShopCar shopCar = new ShopCar();
        shopCar.setUser(user);
        shopCar.setPro(pro);

        //结算
        if (user.getName().equals(shopCar.getUser().getName())) {
            int[][] sum = shopCar.getPro();
            int count=0;
            for (int i = 0; i < pro.length; i++) {
//                for (int j = 0; j < pro[i].length; j++) {
//
//                }
              count=  count+ sum[i][0] * sum[i][1];
            }
            System.out.println(user.getName() + "共花费了"+count);
        }
    }
}
