define({ "api": [
  {
    "type": "post",
    "url": "/user",
    "title": "",
    "group": "___",
    "name": "___",
    "version": "1.0.0",
    "description": "<p>创建一个用户</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Number",
            "optional": false,
            "field": "id",
            "description": "<p>用户id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>用户名</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\n \"id\": \"1\",\n \"name\": \"张涵弈\",\n \"password\": \"123456\"\n }",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "Error-Response:",
          "content": "{\"status\":-1,\"msg\":\"没有数据\"}",
          "type": "json"
        }
      ]
    },
    "sampleRequest": [
      {
        "url": "/方法名"
      }
    ],
    "filename": "./src/main/kotlin/com/zhanghanyi/webfluxstudy/controller/UserController.kt",
    "groupTitle": "___"
  }
] });
