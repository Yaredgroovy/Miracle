package com.letion.geetionlib.mvp;

/**
 * Created by liu-feng on 2017/6/5.
 */
public interface IView {

    /**
     * 显示加载
     */
    void showLoading();

    /**
     * 隐藏加载
     */
    void hideLoading();

    /**
     * 显示信息
     */
    void showMessage(String message);
}
