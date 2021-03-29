package com.tearsmart.jvm;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author 刘彦磊
 * @date 2020/12/15
 */
public class ObjectMemory {

    public static void main(String[] args) {
        // Object obj = new Object();
        // System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        // System.out.println("----------------------------");
        // String[] arr = new String[3];
        // System.out.println(ClassLayout.parseInstance(arr).toPrintable());
        // // arr[0] = "nasdfsdfsdfsdfsfsdfsdaf";
        // byte[] arrByte = new byte[3];
        // System.out.println(ClassLayout.parseInstance(arrByte).toPrintable());
        // // int[] intArr = new int[3];
        // // System.out.println(ClassLayout.parseInstance(intArr).toPrintable());
        // // long[] longArr = new long[3];
        // // System.out.println(ClassLayout.parseInstance(longArr).toPrintable());
        //
        // MyItem myItem = new MyItem();
        // System.out.println(ClassLayout.parseInstance(myItem).toPrintable());
        //
        // MyItem[] items = new MyItem[2];
        // System.out.println(ClassLayout.parseInstance(items).toPrintable());

        Object[] objects = new Object[3];
        System.out.println(ClassLayout.parseInstance(objects).toPrintable());

    }
}
