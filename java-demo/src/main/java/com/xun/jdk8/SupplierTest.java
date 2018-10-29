package com.xun.jdk8;


import com.xun.jdk8.model.Person;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author 寻。
 * Supplier：供给型接口
 *    get()方法：无参数，返回一个结果
 */
public class SupplierTest {

    @Test
    public void testSupplier(){
        Supplier<Double> supplier = Math::random;
        System.out.println(supplier.get());

        System.out.println("====================================================");

        Supplier<Person> supplier1 = Person::new;
        System.out.println(supplier1.get());

        System.out.println("========================================>>>>>>>>>>>>");

        //生成是个随机数add到list
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        Supplier<Integer> randomNum = ()->random.nextInt(100);
        for(int i=0;i<=10;i++){
            list.add(randomNum.get());
        }
        System.out.println(list);


    }


}
