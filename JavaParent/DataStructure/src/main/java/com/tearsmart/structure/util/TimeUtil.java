package com.tearsmart.structure.util;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * @author 刘彦磊
 * @date 2020/12/24
 */
public class TimeUtil {

    public static void timeConsume(String title,Task task){
        Stopwatch stopwatch = Stopwatch.createStarted();
        task.execute();
        stopwatch.stop();
        System.out.println("本次执行耗时：" + stopwatch.elapsed(TimeUnit.MILLISECONDS) + "毫秒");
    }

}
