package com.xun.jdk8;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

/**
 * @author 寻。
 * 消费型接口：
 */
public class ConsumerTest {


    /**
     * accept()：表示接受一个输入参数并且无返回值的操作
     */
    @Test
    public void testConsumer(){
        /**
         * consumer执行步骤：
         *    首先会执行accept()方法，
         *    拿到accept传递的参数之后然后返回上一步执行打印
         *
         *    大致意思就是调用accept方法传递一个参数，
         *    然后再执行“Consumer<String> consumer = p->{}”根据参数进行一系列的消费操作
         */
        Consumer<String> consumer = p->{
            System.out.println("第二步。。。");
            System.out.println(p + "...");
            System.out.println("第四步。。。");
        };
        System.out.println("第一步。。。");
        consumer.accept("Hello Word");

        System.out.println("=======================================================");

        Consumer<Integer> consumer1 = p-> System.out.println("消费一个参数："+p+",并获取其绝对值："+Math.abs(p));
        consumer1.accept(-10);
        consumer1.accept(2);
    }

}
