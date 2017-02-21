#数据库初始化脚本

#1.创建数据库
CREATE DATABASE xy2h;

#2.使用数据库
use xy2h;

#3.创建用户表
#用户表#
# id 用户唯一标识
# username 用户名
# nickname 用户别名
# password 用户密码
# email用户邮箱
# avatar 用户头像
# phonenumber 用户手机号
# address 用户设置地址
# brithday 用户生日
# schoolid 用户所属学校的id
# registetime 用户注册时间

CREATE TABLE t_user(
  user_id BIGINT NOT NULL AUTO_INCREMENT COMMENT '用户唯一标识',
  user_name VARCHAR(60) NOT NULL COMMENT '用户名',
  user_nickname VARCHAR(60) COMMENT '用户别名',
  user_password VARCHAR(60) NOT NULL COMMENT '用户密码',
  user_email VARCHAR(60) NOT NULL COMMENT '用户邮箱',
  user_avatar BLOB COMMENT '用户头像',
  user_phone BIGINT NOT NULL COMMENT '用户手机号',
  user_address VARCHAR(120) COMMENT '用户地址',
  user_brithday DATETIME COMMENT '用户生日',
  user_registetime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '用户注册时间',
  PRIMARY KEY (user_id),
  KEY idx_user_name (user_name),
  KEY idx_user_phone (user_phone)
)ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8 COMMENT='用户表';