package no.nordicsemi.android.dfu;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressWarnings("WeakerAccess")
@IntDef(value = {
            DfuBaseService.TYPE_SOFT_DEVICE,
            DfuBaseService.TYPE_BOOTLOADER,
            DfuBaseService.TYPE_APPLICATION
        },
        flag = true)
public @Retention(RetentionPolicy.SOURCE) @interface FileType {}

