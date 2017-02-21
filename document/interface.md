#校园二货网站接口说明#
接口类如下:

portal文件夹下



websiteclass  //用于处理网站信息相关的数据

useradmin文件夹下

userclass //用于对用户数据的外理

---


##1.用户注册##

**接口调用请求说明**

	http请求方式: POST（请使用https协议）https://erhuo.com/interface/useradmin/user/signup
	POST数据格式：json
	POST数据例子：{“username”:”test”,”password”:”123456”,”confirmpassword”:”123456”,”verification_code”:”tmxk”}
参数说明

* username	用户名
* password	用户密码
* confirmpassword	确认用户密码
* verification code	验证码	
***		
	返回说明 正常时的返回JSON数据包示例：
	{
	“return”:1,
	“msg”:”用户注册成功！”
	}

参数说明

* return 	处理结果代号，1为成功。其余错误代号由后端自行定义。
* msg	返回处理说明
***
	错误时的JSON数据包示例（该示例为密码与确认密码不相同！错误）：
	{"return":432,"msg":"密码与确认密码不相同！"}

##2.用户登录##

**接口调用请求说明**

	http请求方式: POST（请使用https协议）https://erhuo.com/interface/useradmin/user/signin
	POST数据格式：json
	POST数据例子：{ “username”:”test”,”password”:”123456”,”verification_code”:”tmxk”}
参数说明：

* username	用户名
* password	用户密码
* verification code	验证码
***		
	返回说明 正常时的返回JSON数据包示例：
	{
	“return”:1,
	“msg”:”用户登录成功！”
	}
参数说明：
 
* return 处理结果代号，1为成功。其余错误代号由后端自行定义。
* msg	返回处理说明
***
	错误时的JSON数据包示例（该示例为用户名不对！错误）：
	{"return":432,"msg":"用户名称不对！"}

##3.网站全局信息的获取##

**接口调用请求说明**

    http请求方式: POST（请使用https协议）https://erhuo.com/interface/portal/website/global
	POST数据格式：json
	POST数据例子：{null}
参数说明：
无
***		
	返回说明 正常时的返回JSON数据包示例：
	{
	“return”:1,
	“msg”:{'website_name':'erhuo','website_seo':'学生二手网站'}  //最后要返因所有的website_global中所有的字段键值对
	}
参数说明
 
* return 处理结果代号，1为成功。其余错误代号由后端自行定义。
* msg	正确的情况下，返回website_global的全部的字段键值对
* ***
	错误时的JSON数据包示例（该示例为没能够成功获取，原因服务器拒绝）：
	{"return":403,"msg":"服务器拒绝该问！"}

##4.校园代步,电器,运动健身,数码，图片等不同产品数据的获取##

**接口调用请求说明**

    http请求方式: POST（请使用https协议）https://erhuo.com/interface/portal/list/goods
	POST数据格式：json
	POST数据例子：{categoryid:15,page:1,count:10}
参数说明：
* categoryid 商品所属的类别
* page 请求的第几页的数据，如page:1就是请求的第一页的数据
* count 请求的一页当中所包函的数据量，如count:10就包函十条数据
***		
	返回说明 正常时的返回JSON数据包示例：
	{
	“return”:1,
	“msg”:[{id:1,’goodname‘：'99新自行车',...},{id:2,’goodname‘：'99新自行车',...},...] 
	}
参数说明
 
* return 处理结果代号，1为成功。其余错误代号由后端自行定义。
* msg	正确的情况下，返回指定的count数量的商品的全部信息，将每一件物品的所有字段都取出。
* ***
	错误时的JSON数据包示例（该示例为没能够成功获取，原因服务器拒绝）：
	{"return":403,"msg":"服务器拒绝该问！"}