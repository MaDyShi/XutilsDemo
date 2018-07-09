package com.nade.utils.xutilsdemo;

/**
 * 作者: Nade_S on 2018/7/9.
 * 网络监听
 */

public interface XutilsListener {
    void xSuccess(String result);
    void xErrCode(int code);
    void xError(Throwable err);
}
