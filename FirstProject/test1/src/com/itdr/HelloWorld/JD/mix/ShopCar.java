package com.itdr.HelloWorld.JD.mix;

import com.itdr.HelloWorld.JD.Product.Product;
import com.itdr.HelloWorld.JD.User.User;

/**
 * @创建作者 李明航
 * @创建时间 2019.01.10
 * @描述
 */
public class ShopCar {

    private User user;
    int[][]pro = new int[5][1];

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int[][] getPro() {
        return pro;
    }

    public void setPro(int[][] pro) {
        this.pro = pro;
    }
}
