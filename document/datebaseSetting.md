#用户表#
---
id 用户唯一标识

username 用户名

nickname 用户别名

password 用户密码

email用户邮箱

avatar 用户头像

phonenumber 用户手机号

place 用户设置地址

brithday 用户生日

schoolid 用户所属学校的id

registetime 用户注册的时间
#系统设置#
---
option_id 设置的id

option_name 设置的名称

option_value 设置的值，存放在json格式的字符串中
#用户购物地址#
---
id 不同地址的唯一标识

addr 地址（采用json格式，｛‘city’:'suzhou','country':'China','alley':'number:5'｝）

userid 该地址由哪个用户创建，对应于用户表中的id

#中国省份列表#
---
id 省份唯一的id

provincename 省份的名称
#商品分类表#
---
id 单纯一个id，以便以后使用

categoryid 不同类别的id

categoryname 不同类别的名称（目前大类就是代步，图书这几样）

#上架商品表#
---
id 每个上架的产品的唯一标识

goodname 商品名称

goodprice 商品价格

goodquantity 商品的数量

goodfaceimage 商品的特征图（比如用户搜出来后前图后文）

goodimage 商品图片（用来显展示图片，用json格式存放，因为可以有多张展图片）

goodnote 商品备注，用来显示如，可小刀之类的

gooddiscription 商品描述

categoryid 商品所属类别

publishtime 商品发布的时间

recommendationlevel 商品等级打分，分越高搜索越靠前，也样也可以被推荐到首页

userid 发布者的id与用户数据表中的id对应

#学校列表，中国各大高校的名称#
---
id 学校唯一的标识符

schoolname 高校的名字

#学院列表#
---
id 学院唯一id

collegename 学院的名字

#系列表#
---
id 系的唯一标识

departmentname 系的名字

collegeid 系所属学院的id，也就是学院列表中的id

#购物车#
---
id 每个用户的购物车唯一的id

cart 用户购物车中的内容（使用json,存放加入购物车的不同商品的id）

updatetime 最后更新购物车的时间

userid 用户的标识符

#宝贝收藏列表#
---
id 独立id

goodid 喜欢的商品的列表

userid 添加收藏用户的唯一标识

addtime 添加收藏的时间

#店铺收藏列表(目前没有店铺，所以只能关注一个用户，也就是用户就是商家)#
---
id 独立唯一id

favoriteuserid 喜欢的商家的名称

userid 添加收藏用户的唯一标识

addtime 添加收藏的时间

#用户订单#
---
id 记录独立的id

orderid 订单独立的id(根据一定的规则自动生成)

goodid 购买的物品的名称

userid 购买者的名称

dealtime  成交时间

quantity  交易的商品的数量

delete 用户是否删除了这条记录

orderstatus 用来记录订单的状态（已成交，未成交等等）


