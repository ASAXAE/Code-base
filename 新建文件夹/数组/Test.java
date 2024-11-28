package tom.jiafei.数组;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
public class Test {
    public static void main(String[] args){

        //用户输入数据
        //法1
/*
          Good[] arr = new Good[3];
          Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Good c =new Good();
            //录入id
            System.out.println("请输入");
            String id = sc.next();
            c.setId(id);
            //录入name
            System.out.println("请输入");
            String name = sc.next();
            c.setName(name);
            //录入价格
            System.out.println("请输入");
            Double price  = sc.nextDouble();
            c.setPrice(price);
            //录入库存
            System.out.println("请输入");
            int count = sc.nextInt();
            c.setCount(count);

            arr[i] = c;

        }
        */
 //法2 Good 与String强制转换？将内容存在Good数组？
        Good[] arr = new Good[3];
        Scanner i = new Scanner(System.in);
        String y= i.nextLine();
       // Good r1 = new Good("01","手机",5000.5,100);
        //Good r2 = new Good("01","电脑",8000,50);
        //Good r3 = new Good("01","平板",555.55,220);
       // arr[0] =(Good) y;
       // arr[1] =  Good();
        //arr[2] =Good() ;
        for (Good good : arr) {
            System.out.println(good.getName()+","+good.getId()+","+good.getPrice()+","+good.getCount());

        }
    }
}
