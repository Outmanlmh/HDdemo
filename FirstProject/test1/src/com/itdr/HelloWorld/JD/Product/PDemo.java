package com.itdr.HelloWorld.JD.Product;

/**
 * @创建作者 李明航
 * @创建时间 2019.01.09
 * @描述
 */
public class PDemo {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.id=1001;
        p1.name="苹果";
        p1.price= 10;
        p1.infor= "真好";
      Product p2=  Product.getNew(1002,"萝卜",20,"特别好");

    }
}
