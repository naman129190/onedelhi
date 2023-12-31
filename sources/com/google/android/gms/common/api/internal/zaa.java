package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.hw4;
import java.util.ArrayList;
import java.util.List;

@hw4(otherwise = 2)
final class zaa extends LifecycleCallback {
    private List zaa = new ArrayList();

    private zaa(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
    }

    public static /* bridge */ /* synthetic */ zaa zaa(Activity activity) {
        zaa zaa2;
        synchronized (activity) {
            LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
            zaa2 = (zaa) fragment.getCallbackOrNull("LifecycleObserverOnStop", zaa.class);
            if (zaa2 == null) {
                zaa2 = new zaa(fragment);
            }
        }
        return zaa2;
    }

    /* access modifiers changed from: private */
    public final synchronized void zac(Runnable runnable) {
        this.zaa.add(runnable);
    }

    @bc2
    public final void onStop() {
        List<Runnable> list;
        synchronized (this) {
            list = this.zaa;
            this.zaa = new ArrayList();
        }
        for (Runnable run : list) {
            run.run();
        }
    }
}
