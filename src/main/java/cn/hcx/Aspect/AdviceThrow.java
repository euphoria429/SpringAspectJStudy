package cn.hcx.Aspect;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class AdviceThrow implements ThrowsAdvice {
    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable
    {
        System.out.println("error");

    }
}
