package com.zhanghanyi.webfluxstudy.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

/**
 * @Author: ZhangHanyi
 * @Description:
 * @Date: Created in 10:20 2019/4/19
 */
@RestController
class IndexController {
    @GetMapping("/hello_world")
    fun sayHelloWorld() = Mono.just("Hello World")
}

