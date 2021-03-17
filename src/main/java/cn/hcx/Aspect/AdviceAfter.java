package cn.hcx.Aspect;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AdviceAfter implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("将要结束"+o1.getClass().getName()+":"+method.getName());
    }
}
