# Questionnaire 调问表单问卷系统

Questionnaire是一款方便、高效、实用的调研问卷系统，一款基于 JAVA WEB 的开源问卷表单系统。




### 安装说明

	服务器必须安装由 JAVA 1.6+、MySQL、Apache Tomcat 构成的环境

	由于引用的外部jar在你本地maven仓库中可能没有，这时只要您本地有maven环境，执行下bin目录下面的文件就可以自动导入。


### 配置说明、数据初始化

    先在您mysql导入/src/main/resources/conf/sql/目录下的dwsurvey.sql数据库脚本文件

配置文件地址

    conf/application.properties

	#database settings
	jdbc.url=jdbc:mysql://localhost:3306/dwsurvey?useUnicode=true&characterEncoding=utf8
	jdbc.username=root
	jdbc.password=123456,.

    分别修改```jdbc.url、jdbc.username、jdbc.password```

### 启动访问

配置完成后，启动服务在浏览器中输入如```localhost:8080/diaowen```相应的地址看到登录页面，表示已经安装成功。

初始账号：```service@diaowen.net``` 密码：```123456```
