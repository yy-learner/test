package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import sun.security.provider.ConfigFile;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("服务端测试组1111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("服务端测试组22222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("客户端端测试组33333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("客户端端测试组44444");
    }

    @BeforeGroups("server")
    public void beforeGroupsServer(){
        System.out.println("服务端组运行前测试方法");
    }

    @AfterGroups("server")
    public void afterGroupsServer(){
        System.out.println("服务端组运行后测试方法");
    }

    @BeforeGroups("client")
    public void beforeGroupsClient(){
        System.out.println("客户端组运行前测试方法");
    }

    @AfterGroups("client")
    public void afterGroupsClient(){
        System.out.println("客户端组运行后测试方法");
    }
}
