# dingding-spring-boot-starter
钉钉报警starter

# 使用方式

### 1.引入依赖
```$xslt
<dependency>
    <groupId>cn.chendahai</groupId>
    <artifactId>dingding-spring-boot-starter</artifactId>
    <version>1.0.3</version>
</dependency>
```

### 2. 配置application配置文件
```$xslt
dingding:
  service:
# 开启钉钉支持
    enable: true
# 钉钉token值，可选
    token: dingdingtoken
```

### 3. @Autowired注入使用
```$xslt
@Autowired
DingdingService dingdingService;

dingdingService.send("msg");
```