package com.yi.model;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import java.io.Serializable;

/**
 * @Description  
 * @Author  xiaofei
 * @Date 2019-11-08 
 */

@Data
@ApiModel ( value ="sys_user_role" )
public class SysUserRole  implements Serializable {

	private static final long serialVersionUID =  5231220753063728639L;

	/**
	 * 用户id
	 */
   	@ApiModelProperty(value = "用户id" )
	private Integer userId;

	/**
	 * 角色id
	 */
   	@ApiModelProperty(value = "角色id" )
	private Integer roleId;

}
