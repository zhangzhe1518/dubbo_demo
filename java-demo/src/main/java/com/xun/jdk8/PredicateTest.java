package com.xun.jdk8;


import com.xun.jdk8.model.Person;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

/**
 * @author 寻。
 * Predicate:断言型接口
 *  boolean test(T t);传入一个T类型的参数，返回一个boolean类型的返回值
 */
public class PredicateTest {

    @Test
    public void testPredicate(){
        Predicate<Person> predicate = p->p.getName().equals("xun");
        System.out.println(predicate.test(new Person()));

        //判断是否name="xun"并且age="23"
        Predicate<Person> predicate1 = p->p.getName().equals("xun") && p.getAge().compareTo(23)==0;
        System.out.println(predicate1.test(new Person()));

    }
}
