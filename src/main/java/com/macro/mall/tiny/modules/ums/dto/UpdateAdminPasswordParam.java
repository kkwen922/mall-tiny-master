package com.macro.mall.tiny.modules.ums.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 * 修改用户名密码参数
 * Created by macro on 2019/10/9.
 */
@Getter
@Setter
public class UpdateAdminPasswordParam {

    @NotEmpty
    @ApiModelProperty(value = "用戶名稱", required = true)
    private String username;

    @NotEmpty
    @ApiModelProperty(value = "舊密碼", required = true)
    private String oldPassword;

    @NotEmpty
    @Length(min = 8, max = 10, message = "密碼長度需為8~13")
    @ApiModelProperty(value = "新密碼", required = true)
    private String newPassword;
}
