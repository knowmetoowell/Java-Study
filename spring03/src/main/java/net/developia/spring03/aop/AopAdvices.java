package net.developia.spring03.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class AopAdvices {

    //@Before("execution(* net.developia.spring03.controller.BoardController.get*(..))")
    public void ad_before() {
        log.info("★★★★★★★★★★★");
        log.info("★   before advice  ★");
        log.info("★★★★★★★★★★★");
    }

    //@After("execution(* net.developia.spring03.controller.BoardController.get*(..))")
    public void ad_after() {
        log.info("★★★★★★★★★★★");
        log.info("★   after advice   ★");
        log.info("★★★★★★★★★★★");
    }

    @Around("execution(* net.developia.spring03.controller.BoardController.get*(..))")
    public Object ad_around(ProceedingJoinPoint joinPoint) {
        log.info("★★★★★★★★★★★★★★★");
        log.info("★   around (before) advice ★");
        log.info("★★★★★★★★★★★★★★★");

        Object obj = null;

        try {
            log.info("시간측정을 시작합니다");
            long start = System.currentTimeMillis();
            obj = joinPoint.proceed();
            long end = System.currentTimeMillis();
            log.info("시간측정을 종료합니다");
            log.info("소요시간 : " + ((double)end - start)/1000 + "초");

        } catch (Throwable e) {
            e.printStackTrace();
        }

        log.info("★★★★★★★★★★★★★★★");
        log.info("★   around (after)  advice ★");
        log.info("★★★★★★★★★★★★★★★");
        return obj;
    }


//    @Before("execution(* net.developia.*.*.UserController.login(..))")
//    public void ad_login(JoinPoint joinPoint) {
//        log.info("★★★★★★★★★★★★");
//        log.info("★   login intercept  ★");
//        log.info("★★★★★★★★★★★★");
//
//        Object[] args = joinPoint.getArgs();
//        for(Object obj : args) {
//            //log.info(obj.toString());
//            if (obj instanceof UserDTO) {
//                UserDTO userDTO = (UserDTO) obj;
//                log.info(userDTO.getUsr_id() + "님이 로그인");
//            }
//        }
//    }
}

