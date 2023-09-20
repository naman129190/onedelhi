package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.onedelhi.secure.mr2;

final class zaba implements GoogleApiClient.OnConnectionFailedListener {
    public final /* synthetic */ StatusPendingResult zaa;

    public zaba(zabe zabe, StatusPendingResult statusPendingResult) {
        this.zaa = statusPendingResult;
    }

    public final void onConnectionFailed(@mr2 ConnectionResult connectionResult) {
        this.zaa.setResult(new Status(8));
    }
}
