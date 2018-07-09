package com.nade.utils.xutilsdemo.mvp;

import com.nade.utils.xutilsdemo.XutilsListener;

/**
 * 作者: Nade_S on 2018/7/9.
 */

public class XutilsPresenter {
    XutilsView view;
    XutilsModel model;

    public XutilsPresenter(XutilsView view) {
        this.view = view;
        model = new XutilsModel();
    }
    public void login(){
        view.showPro();
        model.login(new XutilsListener() {
            @Override
            public void xSuccess(String result) {
                view.loginSuccess(result);
                view.hintPro();
            }

            @Override
            public void xErrCode(int code) {
                view.loginCode(code);
                view.hintPro();
            }

            @Override
            public void xError(Throwable err) {
                view.loginError(err);
                view.hintPro();
            }
        });
    }

}
