package com.onedelhi.secure;

public class xd2 {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r1.equals("s") == false) goto L_0x0062;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.td2 m31402a(com.onedelhi.secure.wv1 r11, com.onedelhi.secure.la2 r12) throws java.io.IOException {
        /*
            r11.mo17965c()
            r0 = 0
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = 0
        L_0x0008:
            boolean r5 = r11.mo17970h()
            if (r5 == 0) goto L_0x00d1
            java.lang.String r5 = r11.mo17978q()
            r5.hashCode()
            int r6 = r5.hashCode()
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = -1
            switch(r6) {
                case 111: goto L_0x0043;
                case 3588: goto L_0x0038;
                case 104433: goto L_0x002d;
                case 3357091: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            r6 = -1
            goto L_0x004d
        L_0x0022:
            java.lang.String r6 = "mode"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x002b
            goto L_0x0020
        L_0x002b:
            r6 = 3
            goto L_0x004d
        L_0x002d:
            java.lang.String r6 = "inv"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0036
            goto L_0x0020
        L_0x0036:
            r6 = 2
            goto L_0x004d
        L_0x0038:
            java.lang.String r6 = "pt"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0041
            goto L_0x0020
        L_0x0041:
            r6 = 1
            goto L_0x004d
        L_0x0043:
            java.lang.String r6 = "o"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x004c
            goto L_0x0020
        L_0x004c:
            r6 = 0
        L_0x004d:
            switch(r6) {
                case 0: goto L_0x00cb;
                case 1: goto L_0x00c5;
                case 2: goto L_0x00bf;
                case 3: goto L_0x0054;
                default: goto L_0x0050;
            }
        L_0x0050:
            r11.mo17963Y()
            goto L_0x0008
        L_0x0054:
            java.lang.String r1 = r11.mo17951A()
            r1.hashCode()
            int r6 = r1.hashCode()
            switch(r6) {
                case 97: goto L_0x0083;
                case 105: goto L_0x0078;
                case 110: goto L_0x006d;
                case 115: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            r7 = -1
            goto L_0x008d
        L_0x0064:
            java.lang.String r6 = "s"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x008d
            goto L_0x0062
        L_0x006d:
            java.lang.String r6 = "n"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0076
            goto L_0x0062
        L_0x0076:
            r7 = 2
            goto L_0x008d
        L_0x0078:
            java.lang.String r6 = "i"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0081
            goto L_0x0062
        L_0x0081:
            r7 = 1
            goto L_0x008d
        L_0x0083:
            java.lang.String r6 = "a"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x008c
            goto L_0x0062
        L_0x008c:
            r7 = 0
        L_0x008d:
            switch(r7) {
                case 0: goto L_0x00bb;
                case 1: goto L_0x00b2;
                case 2: goto L_0x00ae;
                case 3: goto L_0x00aa;
                default: goto L_0x0090;
            }
        L_0x0090:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "Unknown mask mode "
            r1.append(r6)
            r1.append(r5)
            java.lang.String r5 = ". Defaulting to Add."
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.onedelhi.secure.p92.m24544e(r1)
            goto L_0x00bb
        L_0x00aa:
            com.onedelhi.secure.td2$a r1 = com.onedelhi.secure.td2.C3595a.MASK_MODE_SUBTRACT
            goto L_0x0008
        L_0x00ae:
            com.onedelhi.secure.td2$a r1 = com.onedelhi.secure.td2.C3595a.MASK_MODE_NONE
            goto L_0x0008
        L_0x00b2:
            java.lang.String r1 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r12.mo19372a(r1)
            com.onedelhi.secure.td2$a r1 = com.onedelhi.secure.td2.C3595a.MASK_MODE_INTERSECT
            goto L_0x0008
        L_0x00bb:
            com.onedelhi.secure.td2$a r1 = com.onedelhi.secure.td2.C3595a.MASK_MODE_ADD
            goto L_0x0008
        L_0x00bf:
            boolean r4 = r11.mo17972l()
            goto L_0x0008
        L_0x00c5:
            com.onedelhi.secure.q6 r2 = com.onedelhi.secure.C3976y6.m31974k(r11, r12)
            goto L_0x0008
        L_0x00cb:
            com.onedelhi.secure.l6 r3 = com.onedelhi.secure.C3976y6.m31971h(r11, r12)
            goto L_0x0008
        L_0x00d1:
            r11.mo17969g()
            com.onedelhi.secure.td2 r11 = new com.onedelhi.secure.td2
            r11.<init>(r1, r2, r3, r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.xd2.m31402a(com.onedelhi.secure.wv1, com.onedelhi.secure.la2):com.onedelhi.secure.td2");
    }
}
