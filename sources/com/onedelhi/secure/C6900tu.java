package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/tu;", "Lcom/onedelhi/secure/m20;", "", "c", "()Z", "Lcom/onedelhi/secure/b80;", "continuation", "", "cause", "handled", "<init>", "(Lcom/onedelhi/secure/b80;Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.tu */
public final class C6900tu extends m20 {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f35786b = AtomicIntegerFieldUpdater.newUpdater(C6900tu.class, "_resumed");
    @vr2
    private volatile /* synthetic */ int _resumed;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6900tu(@com.onedelhi.secure.vr2 com.onedelhi.secure.b80<?> r3, @com.onedelhi.secure.ss2 java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L_0x001d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L_0x001d:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6900tu.<init>(com.onedelhi.secure.b80, java.lang.Throwable, boolean):void");
    }

    /* renamed from: c */
    public final boolean mo45310c() {
        return f35786b.compareAndSet(this, 0, 1);
    }
}
