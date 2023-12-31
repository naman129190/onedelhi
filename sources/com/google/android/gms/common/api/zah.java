package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.onedelhi.secure.ts2;

final class zah<R extends Result> extends BasePendingResult<R> {
    public zah(@ts2 GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    public final R createFailedResult(Status status) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
