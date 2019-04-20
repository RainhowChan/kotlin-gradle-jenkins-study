package com.zhanghanyi.webfluxstudy.config

import com.zhanghanyi.webfluxstudy.handler.EchoHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.Ordered
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping
import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.server.support.WebSocketHandlerAdapter

/**
 * @Author: ZhangHanyi
 * @Description:
 * @Date: Created in 14:28 2019/4/19
 */
@Configuration
class WebSocketConfiguration {

    @Bean
    fun webSocketMapping(echoHandler: EchoHandler): SimpleUrlHandlerMapping {
        val map = mapOf<String, WebSocketHandler>(Pair("/echo", echoHandler))

        val mapping = SimpleUrlHandlerMapping()
        mapping.order = Ordered.HIGHEST_PRECEDENCE
        mapping.urlMap = map
        return mapping
    }

    @Bean
    fun webSocketHandlerAdapter() = WebSocketHandlerAdapter()
}
