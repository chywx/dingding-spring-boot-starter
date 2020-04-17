# dingding-spring-boot-starter
> 钉钉报警starter
>
> 引入后`@Autowired`注入即可使用
>
> java版本1.8

# 使用方式

### 1.引入依赖
```xml
<dependency>
    <groupId>cn.chendahai</groupId>
    <artifactId>dingding-spring-boot-starter</artifactId>
    <version>2.0.3</version>
</dependency>
```

### 2. 注入bean
> 直接在application启动类添加bean注解方式注入
```java
@Bean
public DingdingService dingdingService() {
    DingdingService dingdingService = new DingdingService();
    // 设置全局的手机号或者token，可选
    // dingdingService.setPhone("13121939122");
    // dingdingService.setToken("dingdingtokne");
    return dingdingService;
}
```

### 3. @Autowired注入使用

> 注入service
```java
@Autowired
DingdingService dingdingService;

// 2. 发送消息
dingdingService.send("msg");

```

### 4. 调用API发送消息
```java
send(String content) 
sendAll(String content) 
sendAllByToken(String content, String token) 
sendByPhone(String content, String phone) 
sendByToken(String content, String token) 
sendByTokenAndPhone(String content, String token, String phone) 
```
> 方法和说明
- content 钉钉消息发送的内容
- token 申请的钉钉token
- phone 发送消息需要@的用户，多个手机号用逗号分隔
- all 表示@所有人

---

# 自用方式（可忽略）

### 1.引入依赖
```xml
<dependency>
    <groupId>cn.chendahai</groupId>
    <artifactId>dingding-spring-boot-starter</artifactId>
    <version>2.0.3</version>
</dependency>
```

### 2. 配置application配置文件
```yaml
dingding:
  service:
# 开启钉钉支持
    enable: true
# 钉钉token值，可选，不传需要在使用的时候单独指定
    token: dingdingtoken
# 发送的用户手机号，可选，多个用逗号分隔
    phone: 13121939122,18135953996
```

### 3. @Autowired注入使用
```java
@Autowired
DingdingService dingdingService;

dingdingService.send("msg");
```