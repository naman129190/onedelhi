package com.onedelhi.secure;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

@sj3(22)
public class s23 {
    /* renamed from: a */
    public static Bundle m27223a(Object obj) {
        return ((PlaybackState) obj).getExtras();
    }

    /* renamed from: b */
    public static Object m27224b(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, List<Object> list, long j5, Bundle bundle) {
        PlaybackState.Builder builder = new PlaybackState.Builder();
        builder.setState(i, j, f, j4);
        long j6 = j2;
        builder.setBufferedPosition(j2);
        long j7 = j3;
        builder.setActions(j3);
        builder.setErrorMessage(charSequence);
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            builder.addCustomAction((PlaybackState.CustomAction) it.next());
        }
        builder.setActiveQueueItemId(j5);
        builder.setExtras(bundle);
        return builder.build();
    }
}
