package com.macro.mall.tiny.common.api;

/**
 * 枚举了一些常用API操作码
 * Created by macro on 2019/4/19.
 */
public enum ResultCode implements IErrorCode {
    SUCCESS(200, "成功"),
    FAILED(500, "失敗"),
    UNAUTHORIZED(401, "尚未登入或令牌token已過期"),
    PASSWORD_FAILED(402, "密碼強度不足"),
    FORBIDDEN(403, "無此權限"),
    VALIDATE_FAILED(404, "參數檢查未通過");
    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
