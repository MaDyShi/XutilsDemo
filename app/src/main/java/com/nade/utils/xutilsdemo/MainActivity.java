package com.nade.utils.xutilsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.nade.utils.xutilsdemo.mvp.XutilsPresenter;
import com.nade.utils.xutilsdemo.mvp.XutilsView;

import org.json.JSONException;
import org.json.JSONObject;
import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.x;

public class MainActivity extends AppCompatActivity implements XutilsView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // mvc
        RequestParams params = XutilsHelper.getParams("url",Constant.XUTILS_NULLH);
        XutilsHelper.XGET(params, null,new XutilsListener() {
            @Override
            public void xSuccess(String result) {

            }

            @Override
            public void xErrCode(int code) {

            }

            @Override
            public void xError(Throwable err) {

            }
        });

        // mvp
        XutilsPresenter xutilsPresenter = new XutilsPresenter(this);
        xutilsPresenter.login();

    }

    @Override
    public void loginSuccess(String result) {
        Log.d("login", "loginSuccess: 登陆成功--"+result);
    }

    @Override
    public void loginCode(int code) {
        Log.d("login", "loginCode: 登录失败错误码--"+code);
    }

    @Override
    public void loginError(Throwable ex) {
        Log.d("login", "loginError: 登录失败--"+ex);
    }

    @Override
    public void showPro() {
        // 展示进度条
    }

    @Override
    public void hintPro() {
        // 隐藏进度条
    }
}
