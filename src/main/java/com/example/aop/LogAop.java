package com.example.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LogAop {
    @Pointcut("execution(* com.example.cooking.ChefBean.cook()) || " +
              "execution(* com.example.delivery.DeliveryServiceBean.deliver()) || " +
              "execution(* com.example.order.OrderProcessorBean.processOrder()) || " +
              "execution(* com.example.order.OrderReceiverBean.receiveOrder()) || " +
              "execution(* com.example.order.PaymentProcessorBean.processPayment())")
    public void cut(){
    }

    @Before("cut()")
    public void startMethod(JoinPoint joinPoint) {
        String logMsg = buildLog(joinPoint);
        log.info("--> {}", logMsg);
    }

    @After("cut()")
    public void endMethod(JoinPoint joinPoint) {
        String logMsg = buildLog(joinPoint);
        log.info("<-- {}", logMsg);
    }

    private String buildLog(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        return className + "." + methodName + "()";
    }
}
