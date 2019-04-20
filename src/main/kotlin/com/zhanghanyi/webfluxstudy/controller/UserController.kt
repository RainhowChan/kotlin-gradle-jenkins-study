package com.zhanghanyi.webfluxstudy.controller

import com.zhanghanyi.webfluxstudy.exception.ResourceNotFoundException
import com.zhanghanyi.webfluxstudy.pojo.User
import com.zhanghanyi.webfluxstudy.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
import java.util.*

/**
 * @Author: ZhangHanyi
 * @Description:
 * @Date: Created in 10:41 2019/4/19
 */
@RestController
@RequestMapping("/user")
class UserController {

    @Autowired
    lateinit var userService: UserService

    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Resource not found")
    @ExceptionHandler(ResourceNotFoundException::class)
    fun notFound() {
    }

    /**
     * @api {get} /user 获取所有用户
     * @apiGroup 用户
     * @apiName list
     * @apiVersion 1.0.0
     *
     * @apiDescription 接口描述
     *
     * @apiSuccessExample {json} Success-Response:
     * {"status":1,"msg":"成功","data":[]}
     *
     * @apiErrorExample {json} Error-Response:
     * {"status":-1,"msg":"没有数据"}
     *
     * @apiSampleRequest /方法名
     */

    @GetMapping("")
    fun list() = this.userService.list()

    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: String) = userService.getById(id)

    /**
     * @api {post} /user 创建用户
     * @apiGroup 用户
     * @apiName create
     * @apiVersion 1.0.0
     *
     * @apiDescription 创建一个用户
     *
     *
     * @apiParam {User} user    用户
     *
     * @apiSuccess {Number} id    用户id
     * @apiSuccess {String} name    用户名
     * @apiSuccess {String} password    密码
     *
     * @apiSuccessExample {json} Success-Response:
     * {
     *  "id": "1",
     *  "name": "张涵弈",
     *  "password": "123456"
     *  }
     *
     * @apiErrorExample {json} Error-Response:
     * {"status":-1,"msg":"没有数据"}
     *
     */

    @PostMapping("")
    fun create(@RequestBody user: User) = userService.createOrUpdate(user)

    @PutMapping("/{id}")
    fun update(@PathVariable("id") id: String, @RequestBody user: User): Mono<User> {
        Objects.requireNonNull(user)
        user.id = id
        return userService.createOrUpdate(user)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: String) = userService.delete(id)
}
