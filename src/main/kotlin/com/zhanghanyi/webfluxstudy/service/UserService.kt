package com.zhanghanyi.webfluxstudy.service

import com.zhanghanyi.webfluxstudy.exception.ResourceNotFoundException
import com.zhanghanyi.webfluxstudy.pojo.User
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.concurrent.ConcurrentHashMap

/**
 * @Author: ZhangHanyi
 * @Description:
 * @Date: Created in 10:27 2019/4/19
 */
@Service
class UserService {

    val data = ConcurrentHashMap<String, User>()

    fun list(): Flux<User> = Flux.fromIterable(data.values)

    fun getById(ids: Flux<String>) = ids.flatMap { Mono.justOrEmpty(data[it]) }

    fun getById(id: String) = Mono.justOrEmpty(data[id]).switchIfEmpty(Mono.error(ResourceNotFoundException("Resource not found Exception!")))

    fun createOrUpdate(user: User): Mono<User> {
        data[user.name] = user
        return Mono.just(user)
    }

    fun delete(id: String) = Mono.justOrEmpty(data.remove(id))
}
