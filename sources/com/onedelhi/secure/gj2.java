package com.onedelhi.secure;

import java.util.ArrayList;

public final class gj2 {
    @ts2
    /* renamed from: a */
    public static String m15868a(@ts2 String str, @mr2 String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (m15872e(split, str2.split("/"))) {
                return str2;
            }
        }
        return null;
    }

    @ts2
    /* renamed from: b */
    public static String m15869b(@ts2 String[] strArr, @mr2 String str) {
        if (strArr == null) {
            return null;
        }
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (m15872e(str2.split("/"), split)) {
                return str2;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m15870c(@ts2 String str, @mr2 String str2) {
        if (str == null) {
            return false;
        }
        return m15872e(str.split("/"), str2.split("/"));
    }

    @mr2
    /* renamed from: d */
    public static String[] m15871d(@ts2 String[] strArr, @mr2 String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (m15872e(str2.split("/"), split)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: e */
    public static boolean m15872e(@mr2 String[] strArr, @mr2 String[] strArr2) {
        if (strArr2.length != 2) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
        } else if (strArr2[0].isEmpty() || strArr2[1].isEmpty()) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        } else if (strArr.length != 2) {
            return false;
        } else {
            if ("*".equals(strArr2[0]) || strArr2[0].equals(strArr[0])) {
                return "*".equals(strArr2[1]) || strArr2[1].equals(strArr[1]);
            }
            return false;
        }
    }
}
