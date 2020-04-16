# dingding-spring-boot-starter
> 钉钉报警starter
>
> 引入后`@Autowired`注入即可使用
>
> java版本1.8

# 使用方式

### 1.引入依赖
```$xslt
<dependency>
    <groupId>cn.chendahai</groupId>
    <artifactId>dingding-spring-boot-starter</artifactId>
    <version>2.0.1</version>
</dependency>
```

### 2. 配置application配置文件
```$xslt
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
```$xslt
@Autowired
DingdingService dingdingService;

dingdingService.send("msg");
```