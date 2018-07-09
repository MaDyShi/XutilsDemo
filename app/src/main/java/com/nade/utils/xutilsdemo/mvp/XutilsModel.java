package com.nade.utils.xutilsdemo.mvp;

import com.nade.utils.xutilsdemo.Constant;
import com.nade.utils.xutilsdemo.XutilsHelper;
import com.nade.utils.xutilsdemo.XutilsListener;

import org.xutils.http.RequestParams;

/**
 * 作者: Nade_S on 2018/7/9.
 */

public class XutilsModel implements XutilsModelImpl{

    @Override
    public void login(XutilsListener listener) {
        RequestParams params = XutilsHelper.getParams("url", Constant.XUTILS_NULLH);
        XutilsHelper.XGET(params,null,listener);
    }
}
