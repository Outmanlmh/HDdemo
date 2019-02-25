package com.itdr.HelloWorld.JDemo.DGame;

import java.util.Scanner;

/**
 * @创建作者 李明航
 * @创建时间 2019.01.10
 * @描述
 */
public class DHero {
    public String name;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.进入欢迎界面
        DHero.wel();
        //2.根据英雄列表，选择英雄
        DHero[] heros = herolist();
        binal(heros);

        //3.选择要使用的英雄
        select();
        int x= sc.nextInt();
        System.out.println("你选择的英雄是"+heros[x].name);

    }

    //旁白方法
    public static void wel() {
        System.out.println("欢迎来到英雄联盟！请选择你喜欢的英雄");
        System.out.println("请选择功能序号！");
        System.out.println("查看所有英雄");
    }

    //选择英雄
    public static void select() {
        System.out.println("请选择英雄的序号:");
    }

    // 获取英雄数组的方法
    public static DHero[] herolist() {
        DHero[] heros = new DHero[3];
        DHero hero = new DHero();
        hero.name = "寒冰";
        DHero hero1 = new DHero();
        hero1.name = "盖伦";
        DHero hero2 = new DHero();
        hero2.name = "瑞兹";
        heros[0]=hero;
        heros[1]=hero1;
        heros[2]=hero2;
        return heros;
    }
    //遍历数组的方法
    public static void binal(DHero[] heros) {
        for (int i = 0; i < heros.length; i++) {
            System.out.println(heros[i].name);
        }
    }
}
