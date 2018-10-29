package com.xun.jdk8;

import com.xun.jdk8.model.Person;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

/**
 * @author 寻。
 * Function:函数型接口
 *    R apply(T t):传入一个T类型的参数，返回一个R类型的返回值
 */
public class FunctionTest {

    @Test
    public void testFunction(){
        Person person = new Person();
        Function<String,Person> function = name->person.setName(name);
    }
}
