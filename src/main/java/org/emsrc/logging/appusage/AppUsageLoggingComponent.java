package org.emsrc.logging.appusage;

import android.content.Context;
import android.util.Log;

import org.emsrc.common.loggingcomponent.ILoggingComponent;

/**
 * TODO copy PhoneStudy's AppJobService to this package
 */
public class AppUsageLoggingComponent implements ILoggingComponent {

    private static final String TAG = "AppUsageLoggingComp.";

    @Override
    public void startLoggingComponent(Context context) {
        Log.i(TAG,"logging component started.");
        // TODO start service
    }

    @Override
    public void stopLoggingComponent(Context context) {
        Log.i(TAG,"logging component stopped.");
        // TODO
    }
}
