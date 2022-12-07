package com.restaurant.firesmell.testController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// RestController 는 기본적으로 ResponseBody를 가할 필요가 없고 기본적으로 추가되어있다
public class HomeController {

    @GetMapping("/api/test")
    public String home() {
        return "불향기 테스트";
    }
}
