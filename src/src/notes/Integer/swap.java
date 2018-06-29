package src.notes.Integer;

import java.lang.reflect.Field;

/**
 * Project javaSE
 * User cxw
 * Date 2018/6/29
 * Time 15:04
 * Description:定义一个交换Integer属性值的方法,实现a=2 b=1
 */
public class swap {

    private static void change(Integer num1, Integer num2) throws NoSuchFieldException {
        try {
            Field value = Integer.class.getDeclaredField("value");
            value.setAccessible(true);
            int tem = num1.intValue();
            value.setInt(num1, num2);
            value.setInt(num2, tem);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws NoSuchFieldException {
        Integer c = 3;
        Integer d = 4;
        System.out.println("c=" + c + ",d=" + d);
        change(c, d);
        System.out.println("c=" + c + ",d=" + d);
        //jdk10新特性 var类型推断
        var a = 1;
        var b = 2;
        System.out.println("a=" + a + ",b=" + b);



    }
}
