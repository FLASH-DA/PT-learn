package com.bjpowernode.front.view;

import com.bjpowernode.common.enums.RCode;

/**
 * Package:com.bjpowernode.front.view
 * Date:2022/3/1 16:30
 *
 * 同一的应答结果。 controller方法的返回值都是它
 */
public class RespResult {
    //应答码，自定义的数字
    private int code;
    //code的文字说明，一般做提示给用户看
    private String msg;
    //单个数据
    private Object data;


    //表示成功的RespResult对象
//    public static RespResult ok(){
//        RespResult result = new RespResult();
//        result.setRCode(RCode.SUCC);
//        return result;
//    }
    //表示失败的RespResult对象
//    public static RespResult fail(){
//        RespResult result = new RespResult();
//        result.setRCode(RCode.UNKOWN);
//        return result;
//    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
