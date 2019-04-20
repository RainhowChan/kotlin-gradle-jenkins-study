package com.zhanghanyi.webfluxstudy.controller

import org.springframework.http.codec.ServerSentEvent
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.util.function.Tuples
import java.time.Duration
import java.util.concurrent.ThreadLocalRandom

/**
 * @Author: ZhangHanyi
 * @Description:
 * @Date: Created in 14:07 2019/4/19
 */
@RestController
@RequestMapping("/sse")
class SSEController {

    @GetMapping("/random_number")
    fun randomNumbers(): Flux<ServerSentEvent<Int>> {
        return Flux.interval(Duration.ofSeconds(1))
                .map {
                    Tuples.of(it, ThreadLocalRandom.current().nextInt())
                }
                .map {
                    ServerSentEvent
                            .builder<Int>()
                            .event("random")
                            .id(it.t1.toString())
                            .data(it.t2).build()
                }
    }
}
