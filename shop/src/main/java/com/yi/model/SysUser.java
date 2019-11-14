package com.yi.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import java.io.Serializable;

/**
 * @Description  
 * @Author  xiaofei
 * @Date 2019-11-08 
 */

@Data
@ApiModel ( value ="sys_user" )
public class SysUser  implements Serializable {

	private static final long serialVersionUID =  8181943025201873485L;

	/**
	 * 编号
	 */
   	@ApiModelProperty(value = "编号" )
	private Integer id;

	/**
	 * 名称
	 */
   	@ApiModelProperty(value = "名称" )
	private String name;

	/**
	 * 密码
	 */
   	@ApiModelProperty(value = "密码" )
	private String password;

}
