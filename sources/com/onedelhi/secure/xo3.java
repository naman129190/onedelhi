package com.onedelhi.secure;

public final class xo3 implements xy3 {

    /* renamed from: a */
    public int f37567a;

    /* renamed from: a */
    public final boolean f37568a;

    public xo3(boolean z, int i) {
        this.f37568a = z;
        this.f37567a = i;
    }

    /* renamed from: a */
    public int mo38163a(byte[] bArr, int i, int i2) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            if ((bArr[i4] == 64 && (bArr[i4 + 1] & mx0.f16640e) == 0) || (bArr[i4] == Byte.MAX_VALUE && (bArr[i4 + 1] & mx0.f16640e) == 192)) {
                int i5 = i4 + 1;
                int i6 = i4 + 2;
                int i7 = i4 + 3;
                int i8 = (((((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 16)) | ((bArr[i6] & 255) << 8)) | (bArr[i7] & 255)) << 2;
                int i9 = (this.f37568a ? i8 + ((this.f37567a + i4) - i) : i8 - ((this.f37567a + i4) - i)) >>> 2;
                int i10 = (i9 & 4194303) | (((0 - ((i9 >>> 22) & 1)) << 22) & o82.f32908e) | 1073741824;
                bArr[i4] = (byte) (i10 >>> 24);
                bArr[i5] = (byte) (i10 >>> 16);
                bArr[i6] = (byte) (i10 >>> 8);
                bArr[i7] = (byte) i10;
            }
            i4 += 4;
        }
        int i11 = i4 - i;
        this.f37567a += i11;
        return i11;
    }
}
