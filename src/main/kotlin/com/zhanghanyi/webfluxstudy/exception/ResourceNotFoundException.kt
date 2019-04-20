package com.zhanghanyi.webfluxstudy.exception

import java.lang.RuntimeException

/**
 * @Author: ZhangHanyi
 * @Description:
 * @Date: Created in 10:43 2019/4/19
 */
class ResourceNotFoundException(reason: String) : RuntimeException(reason) {}
