package com.zhanghanyi.webfluxstudy.handler

import org.springframework.stereotype.Component
import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.core.publisher.Mono

/**
 * @Author: ZhangHanyi
 * @Description:
 * @Date: Created in 14:25 2019/4/19
 */
@Component
class EchoHandler:WebSocketHandler {
    override fun handle(session: WebSocketSession): Mono<Void> {
        return session.send(session.receive().map { session.textMessage("ECHO -> ${it.payloadAsText}") })
    }


}
