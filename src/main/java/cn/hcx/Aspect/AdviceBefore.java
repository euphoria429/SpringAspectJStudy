package cn.hcx.Aspect;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class AdviceBefore implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("将要执行"+o.getClass().getName()+":"+method.getName());
    }
}
