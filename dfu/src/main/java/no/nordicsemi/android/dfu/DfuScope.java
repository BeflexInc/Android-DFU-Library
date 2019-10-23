package no.nordicsemi.android.dfu;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressWarnings("WeakerAccess")
@IntDef(value = {
            DfuServiceInitiator.SCOPE_SYSTEM_COMPONENTS,
            DfuServiceInitiator.SCOPE_APPLICATION
        },
        flag = true)
public @Retention(RetentionPolicy.SOURCE) @interface DfuScope {}
