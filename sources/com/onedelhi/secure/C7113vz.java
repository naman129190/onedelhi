package com.onedelhi.secure;

import java.util.Collection;
import java.util.Collections;

/* renamed from: com.onedelhi.secure.vz */
public final class C7113vz extends sv2 {

    /* renamed from: a */
    public static final char f36781a;

    /* renamed from: a */
    public static final char[] f36782a;

    /* renamed from: b */
    public static final char[] f36783b = {'T', 'N', '*', 'E'};

    /* renamed from: c */
    public static final char[] f36784c = {'/', ':', '+', '.'};

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f36782a = cArr;
        f36781a = cArr[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d7  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean[] mo30374e(java.lang.String r11) {
        /*
            r10 = this;
            int r0 = r11.length()
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 >= r3) goto L_0x001e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x000e:
            char r3 = f36781a
            r0.append(r3)
            r0.append(r11)
            r0.append(r3)
            java.lang.String r11 = r0.toString()
            goto L_0x0071
        L_0x001e:
            char r0 = r11.charAt(r1)
            char r0 = java.lang.Character.toUpperCase(r0)
            int r3 = r11.length()
            int r3 = r3 - r2
            char r3 = r11.charAt(r3)
            char r3 = java.lang.Character.toUpperCase(r3)
            char[] r4 = f36782a
            boolean r5 = com.onedelhi.secure.C6988uz.m67529h(r4, r0)
            boolean r4 = com.onedelhi.secure.C6988uz.m67529h(r4, r3)
            char[] r6 = f36783b
            boolean r0 = com.onedelhi.secure.C6988uz.m67529h(r6, r0)
            boolean r3 = com.onedelhi.secure.C6988uz.m67529h(r6, r3)
            java.lang.String r6 = "Invalid start/end guards: "
            if (r5 == 0) goto L_0x0058
            if (r4 == 0) goto L_0x004e
            goto L_0x0071
        L_0x004e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r6.concat(r11)
            r0.<init>(r11)
            throw r0
        L_0x0058:
            if (r0 == 0) goto L_0x0067
            if (r3 == 0) goto L_0x005d
            goto L_0x0071
        L_0x005d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r6.concat(r11)
            r0.<init>(r11)
            throw r0
        L_0x0067:
            if (r4 != 0) goto L_0x0142
            if (r3 != 0) goto L_0x0142
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x000e
        L_0x0071:
            r0 = 20
            r3 = 1
        L_0x0074:
            int r4 = r11.length()
            int r4 = r4 - r2
            if (r3 >= r4) goto L_0x00c7
            char r4 = r11.charAt(r3)
            boolean r4 = java.lang.Character.isDigit(r4)
            if (r4 != 0) goto L_0x00c2
            char r4 = r11.charAt(r3)
            r5 = 45
            if (r4 == r5) goto L_0x00c2
            char r4 = r11.charAt(r3)
            r5 = 36
            if (r4 != r5) goto L_0x0096
            goto L_0x00c2
        L_0x0096:
            char[] r4 = f36784c
            char r5 = r11.charAt(r3)
            boolean r4 = com.onedelhi.secure.C6988uz.m67529h(r4, r5)
            if (r4 == 0) goto L_0x00a5
            int r0 = r0 + 10
            goto L_0x00c4
        L_0x00a5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot encode : '"
            r1.<init>(r2)
            char r11 = r11.charAt(r3)
            r1.append(r11)
            r11 = 39
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L_0x00c2:
            int r0 = r0 + 9
        L_0x00c4:
            int r3 = r3 + 1
            goto L_0x0074
        L_0x00c7:
            int r3 = r11.length()
            int r3 = r3 - r2
            int r0 = r0 + r3
            boolean[] r0 = new boolean[r0]
            r3 = 0
            r4 = 0
        L_0x00d1:
            int r5 = r11.length()
            if (r3 >= r5) goto L_0x0141
            char r5 = r11.charAt(r3)
            char r5 = java.lang.Character.toUpperCase(r5)
            if (r3 == 0) goto L_0x00e8
            int r6 = r11.length()
            int r6 = r6 - r2
            if (r3 != r6) goto L_0x0104
        L_0x00e8:
            r6 = 42
            if (r5 == r6) goto L_0x0102
            r6 = 69
            if (r5 == r6) goto L_0x00ff
            r6 = 78
            if (r5 == r6) goto L_0x00fc
            r6 = 84
            if (r5 == r6) goto L_0x00f9
            goto L_0x0104
        L_0x00f9:
            r5 = 65
            goto L_0x0104
        L_0x00fc:
            r5 = 66
            goto L_0x0104
        L_0x00ff:
            r5 = 68
            goto L_0x0104
        L_0x0102:
            r5 = 67
        L_0x0104:
            r6 = 0
        L_0x0105:
            char[] r7 = com.onedelhi.secure.C6988uz.f36340a
            int r8 = r7.length
            if (r6 >= r8) goto L_0x0116
            char r7 = r7[r6]
            if (r5 != r7) goto L_0x0113
            int[] r5 = com.onedelhi.secure.C6988uz.f36344b
            r5 = r5[r6]
            goto L_0x0117
        L_0x0113:
            int r6 = r6 + 1
            goto L_0x0105
        L_0x0116:
            r5 = 0
        L_0x0117:
            r6 = 0
            r7 = 1
        L_0x0119:
            r8 = 0
        L_0x011a:
            r9 = 7
            if (r6 >= r9) goto L_0x0133
            r0[r4] = r7
            int r4 = r4 + 1
            int r9 = 6 - r6
            int r9 = r5 >> r9
            r9 = r9 & r2
            if (r9 == 0) goto L_0x012e
            if (r8 != r2) goto L_0x012b
            goto L_0x012e
        L_0x012b:
            int r8 = r8 + 1
            goto L_0x011a
        L_0x012e:
            r7 = r7 ^ 1
            int r6 = r6 + 1
            goto L_0x0119
        L_0x0133:
            int r5 = r11.length()
            int r5 = r5 - r2
            if (r3 >= r5) goto L_0x013e
            r0[r4] = r1
            int r4 = r4 + 1
        L_0x013e:
            int r3 = r3 + 1
            goto L_0x00d1
        L_0x0141:
            return r0
        L_0x0142:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r6.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C7113vz.mo30374e(java.lang.String):boolean[]");
    }

    /* renamed from: g */
    public Collection<C7363yi> mo30375g() {
        return Collections.singleton(C7363yi.CODABAR);
    }
}
