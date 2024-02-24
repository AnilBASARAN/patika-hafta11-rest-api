package dev.patika.demo.core.utilities;

import dev.patika.demo.core.result.Result;
import dev.patika.demo.core.result.ResultData;

public class ResultHelper {

    public static Result ok(){
        return new Result(true,Msg.OK,"200");
    }
    public static <T>ResultData<T> created(T data){
        return new ResultData<>(true,Msg.CREATED,"201",data);
    }

    public static <T>ResultData<T> validateError(T data){
        return new ResultData<>(false, Msg.VALIDATE_ERROR,"400",data);
    }

    public static <T>ResultData<T> success(T data){
        return new ResultData<>(true, Msg.OK,"200",data);
    }

    public static Result notFoundError(String msg){
        return new Result(true, msg,"404");
    }



}