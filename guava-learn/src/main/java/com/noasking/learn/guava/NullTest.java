package com.noasking.learn.guava;

import org.junit.Test;

/**
 * Created by MaJing on 2016/12/27.
 */
public class NullTest {

    @Test
    public void testNull(){
//        int age;
//        System.out.println("user age:"+age);

        long money;
        money=10L;
        System.out.println("user money"+money);

//        String name;
//        System.out.println("user name:"+name);
    }

    @Test
    public void testNullObject() {
        if (null instanceof java.lang.Object) {
            System.out.println("null属于java.lang.Object类型");
        } else {
            System.out.println("null不属于java.lang.Object类型");
        }
    }

}
