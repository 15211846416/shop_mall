package com.yi.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  xiaofei
 * @Date 2019-11-08 
 */

@Data
@ApiModel ( value ="persistent_logins" )
public class PersistentLogins  implements Serializable {

	private static final long serialVersionUID =  4201306056308066266L;

   	@ApiModelProperty(value = "null" )
	private String username;

   	@ApiModelProperty(value = "null" )
	private String series;

   	@ApiModelProperty(value = "null" )
	private String token;

   	@ApiModelProperty(value = "null" )
	private Date lastUsed;

}
