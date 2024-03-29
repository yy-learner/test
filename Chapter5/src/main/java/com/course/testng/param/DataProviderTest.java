package com.course.testng.param;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void DataProviderTest1(String name, int age) {
        System.out.println("name= " + name + ", age=" + age);
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",30},
                {"lisi",20},
                {"wangwu",10},
        };

        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test111方法 name= " + name + ", age=" + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2222方法 name= " + name + ", age=" + age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;

        if(method.getName().equals("test1")){
            result=new Object[][]{
                    {"zhangsan",10},
                    {"lisi",20},
            };
        }else if (method.getName().equals("test2")){
            result=new Object[][]{
                    {"wangwu",30},
                    {"zhaoliu",40},
            };
        }
        return result;
    }
}
