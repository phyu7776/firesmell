package com.restaurant.firesmell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// SpringBootApplication 어노테이션이 있는 클래스를 메인으로 실행
// intelliJ 에서 auto reload 는 compile 설정에 따로 있음
@SpringBootApplication
public class FiresmellApplication {

    public static void main(String[] args) {
        SpringApplication.run(FiresmellApplication.class, args);
    }

}
