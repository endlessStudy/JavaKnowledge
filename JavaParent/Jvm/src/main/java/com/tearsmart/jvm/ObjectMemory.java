package com.tearsmart.jvm;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author 刘彦磊
 * @date 2020/12/15
 */
public class ObjectMemory {

    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(ClassLayout.parseInstance(obj).toPrintable());
    }
}
