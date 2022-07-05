package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test //junit에 있는 애너테이션
    public void 더하기_테스트(){
        int rs = Calculator.add("10+20");

        assertEquals(30,rs);
    }

    @Test //junit에 있는 애너테이션
    public void 더하기_테스트_2(){
        int rs = Calculator.add("20+20");

        assertEquals(40,rs);
    }
}

//테스트 코드를 사용하기 위해서 junit --> maven repository에서 다운로드
//@Test와 assert메서드를 지원
//1. 실패하는 테스트 케이스르 만든다.
//2. 꼼수를 써서 테스트 케이스를 성공시킨다.
//3. 리팩토링을 한다.
//테스트 목표를 먼저 정하고 틀을 만들어 놓는다 -> 이후에 작업을 한다.
