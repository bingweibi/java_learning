package com.company;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Administrator on 2017/3/8.
 */
public class Reflection {
    public static void main(String[] args){
        try {
            Class cl = Class.forName("com.company.ReflectionDemo");//获取完整的类名
            System.out.println(cl);
            Constructor constructor = cl.getConstructor(int.class,String.class);//获取完整的构造函数名，包括参数类型
            System.out.println(constructor);
            try {
                ReflectionDemo reflectionDemo = (ReflectionDemo)constructor.newInstance(18,"zhang");//构造一个实例
                System.out.println(reflectionDemo.toString());//调用toString方法
                //set,get方法使用
                ReflectionDemo r1 = (ReflectionDemo) cl.newInstance();
                //出现异常：java.lang.InstantiationException: com.company.ReflectionDemo，添加一个无参构造函数解决
                r1.setAge(18);
                r1.setName("zhangsan");
                System.out.println(r1.toString());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            //Field field = cl.getField();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
class ReflectionDemo{

    public ReflectionDemo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public ReflectionDemo() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;
    private String name;

    @Override
    public String toString() {
        return "ReflectionDemo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
