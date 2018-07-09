package com.nade.utils.xutilsdemo.mvp;

import org.json.JSONObject;

/**
 * 作者: Nade_S on 2018/7/9.
 */

public interface XutilsView {
    void loginSuccess(String result);
    void loginCode(int code);
    void loginError(Throwable ex);
    void showPro();
    void hintPro();
}
