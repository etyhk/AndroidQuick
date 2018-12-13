package com.sdwfqin.quicklib.utils.rx;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

/**
 * 描述：RxJava定时任务
 *
 * @author 张钦
 * @date 2018/12/11
 */
public class RxTimerUtil {

    /**
     * milliseconds毫秒后执行next操作
     */
    public static Observable timer(long milliseconds) {
        return Observable.timer(milliseconds, TimeUnit.MILLISECONDS);
    }

    /**
     * 每隔milliseconds毫秒后执行next操作
     */
    public static Observable interval(long milliseconds) {
        return Observable.interval(milliseconds, TimeUnit.MILLISECONDS);
    }
}
