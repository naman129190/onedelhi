package com.onedelhi.secure;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class rb0 {

    /* renamed from: a */
    public static final String f34549a = "CrossProcessLock";

    /* renamed from: a */
    public final FileChannel f34550a;

    /* renamed from: a */
    public final FileLock f34551a;

    public rb0(FileChannel fileChannel, FileLock fileLock) {
        this.f34550a = fileChannel;
        this.f34551a = fileLock;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c A[SYNTHETIC, Splitter:B:15:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043 A[SYNTHETIC, Splitter:B:19:0x0043] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.rb0 m63459a(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0030, Error -> 0x002e, OverlappingFileLockException -> 0x002c }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ IOException -> 0x0030, Error -> 0x002e, OverlappingFileLockException -> 0x002c }
            r1.<init>(r4, r5)     // Catch:{ IOException -> 0x0030, Error -> 0x002e, OverlappingFileLockException -> 0x002c }
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0030, Error -> 0x002e, OverlappingFileLockException -> 0x002c }
            java.lang.String r5 = "rw"
            r4.<init>(r1, r5)     // Catch:{ IOException -> 0x0030, Error -> 0x002e, OverlappingFileLockException -> 0x002c }
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch:{ IOException -> 0x0030, Error -> 0x002e, OverlappingFileLockException -> 0x002c }
            java.nio.channels.FileLock r5 = r4.lock()     // Catch:{ IOException -> 0x0029, Error -> 0x0027, OverlappingFileLockException -> 0x0025 }
            com.onedelhi.secure.rb0 r1 = new com.onedelhi.secure.rb0     // Catch:{ IOException -> 0x0023, Error -> 0x0021, OverlappingFileLockException -> 0x001f }
            r1.<init>(r4, r5)     // Catch:{ IOException -> 0x0023, Error -> 0x0021, OverlappingFileLockException -> 0x001f }
            return r1
        L_0x001f:
            r1 = move-exception
            goto L_0x0033
        L_0x0021:
            r1 = move-exception
            goto L_0x0033
        L_0x0023:
            r1 = move-exception
            goto L_0x0033
        L_0x0025:
            r1 = move-exception
            goto L_0x002a
        L_0x0027:
            r1 = move-exception
            goto L_0x002a
        L_0x0029:
            r1 = move-exception
        L_0x002a:
            r5 = r0
            goto L_0x0033
        L_0x002c:
            r1 = move-exception
            goto L_0x0031
        L_0x002e:
            r1 = move-exception
            goto L_0x0031
        L_0x0030:
            r1 = move-exception
        L_0x0031:
            r4 = r0
            r5 = r4
        L_0x0033:
            java.lang.String r2 = "CrossProcessLock"
            java.lang.String r3 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r2, r3, r1)
            if (r5 == 0) goto L_0x0041
            r5.release()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0041
        L_0x0040:
        L_0x0041:
            if (r4 == 0) goto L_0x0046
            r4.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.rb0.m63459a(android.content.Context, java.lang.String):com.onedelhi.secure.rb0");
    }

    /* renamed from: b */
    public void mo43835b() {
        try {
            this.f34551a.release();
            this.f34550a.close();
        } catch (IOException e) {
            Log.e(f34549a, "encountered error while releasing, ignoring", e);
        }
    }
}
