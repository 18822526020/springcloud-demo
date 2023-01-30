package com.cab.cloud.common.entity;
import lombok.Data;
import org.apache.http.HttpStatus;

import java.time.Instant;
import java.time.ZonedDateTime;

@Data
public class Result<T> {

    public static final String SUCCESSFUL_CODE = "000000";
    public static final String SUCCESSFUL_MESG = "处理成功";

    private String code;

    private String msg;

    private Instant time;

    private T data;

    public Result() {
        this.time = ZonedDateTime.now().toInstant();
    }

    /**
     * 内部使用，用于构造成功的结果
     *
     * @param code
     * @param msg
     * @param data
     */
    private Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.time = ZonedDateTime.now().toInstant();
    }

    /**
     * 系统成功返回
     *
     * @param data
     * @return Result
     */

    public static Result success(Object data) {
        return success(SUCCESSFUL_MESG, data);
    }

    public static Result success(String msg, Object data) {
        return new Result(SUCCESSFUL_CODE, msg, data);
    }

    public static Result success() {
        return success(null);
    }

    /**
     * 系统失败返回
     *
     * @return Result
     */
    public static Result fail(String code, String msg, Object data) {
        return new Result(code, msg, data);
    }

    public static Result fail( String msg, Object data) {
        return fail(HttpStatus.SC_INTERNAL_SERVER_ERROR + "", msg, data);
    }

    public static Result fail(String code, String msg) {
        return fail(code, msg, null);
    }



    /**
     * 成功code=000000
     *
     * @return true/false
     */
    public boolean isSuccess() {
        return SUCCESSFUL_CODE.equals(this.code);
    }

    /**
     * 失败
     *
     * @return true/false
     */
    public boolean isFail() {
        return !isSuccess();
    }
}
