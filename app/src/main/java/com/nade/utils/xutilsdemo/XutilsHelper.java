package com.nade.utils.xutilsdemo;


import org.json.JSONObject;
import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.x;

/**
 * 作者: Nade_S on 2018/7/9.
 */

public class XutilsHelper {

    private static RequestParams params;

    /**
     * 获取请求体 设置头参数
     * @param url
     * @param type
     * @return
     */
    public static RequestParams getParams(String url,int type){
        if (null == params){
            synchronized (XutilsHelper.class){
                if (null == params){
                    params = new RequestParams(url);
                }
            }
        }
        return addHeader(params, type);
    }

    /**
     *
     * @param params 请求体
     * @param type 请求类型
     * @return
     */
    private static RequestParams addHeader(RequestParams params,int type) {
        switch (type){
            case 0: // 没有请求头

                break;
            case 1: // 请求格式 与 参数
                params.addHeader("Content-Type","application/json");
                params.addHeader("key","value");
                params.addHeader("key","value");
                break;
            case 2:// 请求格式 与 参数
                params.addHeader("Content-Type","multipart/form-data");
                params.addHeader("key","value");
                params.addHeader("key","value");
                params.addHeader("key","value");
                break;
            case 3: // 其他格式 根据后台设置即可
                params.addHeader("Content-Type","type");
                params.addHeader("key","value");
                params.addHeader("key","value");
                params.addHeader("key","value");
                params.addHeader("key","value");
                params.addHeader("key","value");
                break;
            default:
                params.addHeader("key","value");
                params.addHeader("key","value");
                params.addHeader("key","value");
                params.addHeader("key","value");
                params.addHeader("key","value");
                break;
        }
        return params;

    }

    /**
     * get 方法
     * @param params
     * @param listener 监听
     */
    public static void XGET(RequestParams params, JSONObject object,final XutilsListener listener){
        if (object==null){
            params.addBodyParameter("params",object.toString());
        }
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                listener.xSuccess(result);
                // 此处可处理 服务器定义的内部错误
               // listener.xErrCode();
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                listener.xError(ex);
                // 此处可处理 服务器定义的外部错误
              //  listener.xErrCode();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    /**
     * post 方法
     * @param params
     * @param listener 监听
     */
    public static void XPOST(RequestParams params, JSONObject object,final XutilsListener listener){
        if (object != null){
            params.setBodyContent(object.toString());
        }
        x.http().post(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                listener.xSuccess(result);
                // 此处可处理 服务器定义的内部错误
                // listener.xErrCode();
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                listener.xError(ex);
                // 此处可处理 服务器定义的外部错误
                //  listener.xErrCode();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    /**
     * put
     * @param params
     * @param listener 监听
     */
    public static void XPUT(RequestParams params, JSONObject object,final XutilsListener listener){
        if (object != null){
            params.setBodyContent(object.toString());
        }


        x.http().request(HttpMethod.PUT, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                listener.xSuccess(result);
                // 此处可处理 服务器定义的内部错误
                // listener.xErrCode();
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                listener.xError(ex);
                // 此处可处理 服务器定义的外部错误
                //  listener.xErrCode();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    /**
     * delete
     * @param params
     * @param listener 监听
     */
    public static void XDELETE(RequestParams params, JSONObject object,final XutilsListener listener){
        if (object!=null){
            params.addBodyParameter("params",object.toString());
        }
        x.http().request(HttpMethod.DELETE, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                listener.xSuccess(result);
                // 此处可处理 服务器定义的内部错误
                // listener.xErrCode();

            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                listener.xError(ex);
                // 此处可处理 服务器定义的外部错误
                //  listener.xErrCode();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }



}
