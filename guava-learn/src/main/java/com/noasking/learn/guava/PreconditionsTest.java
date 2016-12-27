package com.noasking.learn.guava;

import org.junit.Test;

/**
 * Created by MaJing on 2016/12/27.
 */
public class PreconditionsTest {

    @Test
    public void Preconditions() throws Exception {

        getPerson(8,"peida");

        getPerson(-9,"peida");

        getPerson(8,"");

        getPerson(8,null);
    }
    public static void getPerson(int age,String neme)throws Exception{
        if(age>0&&neme!=null&&neme.isEmpty()!=true){
            System.out.println("a person age:"+age+",neme:"+neme);
        }else{
            System.out.println("参数输入有误！");
        }
    }
}
