define({ "api": [
  {
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "optional": false,
            "field": "varname1",
            "description": "<p>No type.</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "varname2",
            "description": "<p>With type.</p>"
          }
        ]
      }
    },
    "type": "",
    "url": "",
    "version": "0.0.0",
    "filename": "./doc/main.js",
    "group": "E__cocos2d_x_3_17_1_tests_cpp_tests_webflux_study_doc_main_js",
    "groupTitle": "E__cocos2d_x_3_17_1_tests_cpp_tests_webflux_study_doc_main_js",
    "name": ""
  },
  {
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "optional": false,
            "field": "varname1",
            "description": "<p>No type.</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "varname2",
            "description": "<p>With type.</p>"
          }
        ]
      }
    },
    "type": "",
    "url": "",
    "version": "0.0.0",
    "filename": "./src/main/resources/apidoc/main.js",
    "group": "E__cocos2d_x_3_17_1_tests_cpp_tests_webflux_study_src_main_resources_apidoc_main_js",
    "groupTitle": "E__cocos2d_x_3_17_1_tests_cpp_tests_webflux_study_src_main_resources_apidoc_main_js",
    "name": ""
  },
  {
    "type": "post",
    "url": "/user",
    "title": "创建用户",
    "group": "__",
    "name": "create",
    "version": "1.0.0",
    "description": "<p>创建一个用户</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "User",
            "optional": false,
            "field": "user",
            "description": "<p>用户</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "id",
            "description": "<p>用户id</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>用户名</p>"
          },
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
    "filename": "./src/main/kotlin/com/zhanghanyi/webfluxstudy/controller/UserController.kt",
    "groupTitle": "__"
  },
  {
    "type": "get",
    "url": "/user",
    "title": "获取所有用户",
    "group": "__",
    "name": "list",
    "version": "1.0.0",
    "description": "<p>接口描述</p>",
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\"status\":1,\"msg\":\"成功\",\"data\":[]}",
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
    "groupTitle": "__"
  }
] });
