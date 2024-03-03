package com.example.bigevent.pojo;

/**
 * @author xi
 * @create 2024/3/3 17:49
 */
public class Result<T> {
    private Integer code;//业务状态码 0-成功; 1-失败
    private String message;//提示信息
    private T data;//相应信息

    public Result() {
    }

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <E> Result<E> success(E data){
        return new Result<>(0,"操作成功",data);
    }

    public static Result success(){
        return new Result(0,"操作成功",null);
    }

    public static Result error(String msg){
        return new Result(1,msg,null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
