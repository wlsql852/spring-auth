package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    @Autowired
    Food pizza;   //food로 하면 등록된 Bean이 두개이기 때문에 bean의 이름을 지정해줌

    @Autowired
    Food chicken;

    @Test
    @DisplayName("테스트")
    void test1 () {
        pizza.eat();
        chicken.eat();
    }
}
