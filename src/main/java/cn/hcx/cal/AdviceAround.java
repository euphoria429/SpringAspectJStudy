package cn.hcx.cal;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AdviceAround implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕开始");

        Object obj = methodInvocation.proceed();

        System.out.println("环绕结束");
        return obj;

    }
}
