package myWebProject.web.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class TraceAspect {

    // 로그 추적기(소요 시간)
    @Around("within(myWebProject.web.controller.*)")
    public Object logging(ProceedingJoinPoint jp) throws Throwable{
        long startTime = System.currentTimeMillis();

        log.info("|------->Controller START : {}", jp.getSignature().getDeclaringTypeName());

        Object result = jp.proceed();

        long endTime = System.currentTimeMillis();

        log.info("<-------|Controller END : {} , time={}ms",jp.getSignature().getDeclaringTypeName(), endTime-startTime);

        return result;
    }
}
