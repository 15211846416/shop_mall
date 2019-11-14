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
@ApiModel ( value ="sys_role" )
public class SysRole  implements Serializable {

	private static final long serialVersionUID =  8655789351407911688L;

	/**
	 * 角色id
	 */
   	@ApiModelProperty(value = "角色id" )
	private Integer id;

	/**
	 * 角色名称
	 */
   	@ApiModelProperty(value = "角色名称" )
	private String name;

}
