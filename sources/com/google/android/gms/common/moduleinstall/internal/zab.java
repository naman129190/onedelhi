package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import java.util.Comparator;

public final /* synthetic */ class zab implements Comparator {
    public static final /* synthetic */ zab zaa = new zab();

    private /* synthetic */ zab() {
    }

    public final int compare(Object obj, Object obj2) {
        Feature feature = (Feature) obj;
        Feature feature2 = (Feature) obj2;
        Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
        return !feature.getName().equals(feature2.getName()) ? feature.getName().compareTo(feature2.getName()) : (feature.getVersion() > feature2.getVersion() ? 1 : (feature.getVersion() == feature2.getVersion() ? 0 : -1));
    }
}
