package org.spring.demo.entry.po;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("t_user")
public class User {
	
	@TableId
    private Integer id;
	@TableField("username")
    private String username;
    private String password;
    private String realname;
    private Date birthday;
    private Date createTime;
    private Date updateTime;
    private Integer leader;
    @TableField(exist = false)
    private String demo;
   
}