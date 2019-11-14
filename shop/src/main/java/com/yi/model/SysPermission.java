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
@ApiModel ( value ="sys_permission" )
public class SysPermission  implements Serializable {

	private static final long serialVersionUID =  2985424397287611811L;

	/**
	 * 权限id
	 */
   	@ApiModelProperty(value = "权限id" )
	private Integer id;

	/**
	 * 菜单路径
	 */
   	@ApiModelProperty(value = "菜单路径" )
	private String url;

	/**
	 * 角色id
	 */
   	@ApiModelProperty(value = "角色id" )
	private Integer roleId;

	/**
	 * 角色名称
	 */
   	@ApiModelProperty(value = "角色名称" )
	private String permission;

}
