package org.nprlabs.nipperone.main;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.text.format.DateFormat;
import android.util.Log;

import com.hoho.android.usbserial.driver.UsbSerialDriver;
import com.hoho.android.usbserial.driver.UsbSerialProber;

import java.util.List;

/**
 * Created by kbrudos on 7/14/2015.
 */
public class MyBroadcastReceiver extends BroadcastReceiver{

    public void onReceive(Context context, Intent intent){

        String intentData = intent.getDataString();

        String action = intent.getAction();
        if ( Intent.ACTION_TIME_TICK.equals(action) ) {
//
//            mCalendar.setTimeInMillis(System.currentTimeMillis());
//            mClockText.setText(DateFormat.format(mFormat, mCalendar));

        }  else if ( UsbManager.ACTION_USB_DEVICE_ATTACHED.equals(action) ) {
            //mMessage.append("\nThe Receiver is plugged in!\n");


        } else if ( UsbManager.ACTION_USB_DEVICE_DETACHED.equals(action) ) {
            // Either the receiver has been rebooted or physically disconnected from the tablet.
            // Bring this to the user's attention.
            //NipperOneAndroid.receiverNotConnected();

        } else if ( "org.prss.nprlabs.nipperonealerter.USBPERMISSION".equals(action) ) {
//            for (final UsbDevice device : mUsbManager.getDeviceList().values()) {
//                if (device.getVendorId() == 0x1320) {
//                    Log.d(TAG, "Found Catena USB device: " + device);
//                    //mMessage.append("Found the NipperOne Radio receiver\n");
//
//                    if ( mUsbManager.hasPermission(device) ) {
//                        final List<UsbSerialDriver> drivers =
//                                UsbSerialProber.probeSingleDevice(mUsbManager, device);
//                        if (drivers.isEmpty()) {
//                            Log.d(TAG, "  - No UsbSerialDriver available.");
//                            //mMessage.append("\nThe Nipper One receiver does NOT have its driver assigned.\nPlease Press the Receiver's Reset button.\n");
//                        } else {
//                            for (UsbSerialDriver driver : drivers) {
//                                Log.d(TAG, "  + " + driver);
//                                //mMessage.append("tickReceiver:The NipperOne receiver will be using the following driver:\n" + driver + "\n");
//                            }
//                        }
//                    } else {
//                        //mMessage.append("\nThis is distressing:\nWe still don't have permission to access the Catena Receiver.\n");
//                    }
//                }
            }
    }
}
