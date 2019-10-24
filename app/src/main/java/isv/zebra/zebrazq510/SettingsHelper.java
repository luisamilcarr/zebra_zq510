package isv.zebra.zebrazq510;

import android.content.Context;
import android.content.SharedPreferences;

public class SettingsHelper {

    private static final String PREFS_NAME = "OurSavedAddress";
    private static final String bluetoothAddressKey = "ZEBRA_DEMO_BLUETOOTH_ADDRESS";
    private static final String tcpAddressKey = "ZEBRA_DEMO_TCP_ADDRESS";
    private static final String tcpPortKey = "ZEBRA_DEMO_TCP_PORT";

    public static String getIp(Context context) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, 0);
        return settings.getString(tcpAddressKey, "");
    }

    public static String getPort(Context context) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, 0);
        return settings.getString(tcpPortKey, "");
    }

    public static String getBluetoothAddress(Context context) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, 0);
        return settings.getString(bluetoothAddressKey, "");
    }

    public static void saveIp(Context context, String ip) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(tcpAddressKey, ip);
        editor.commit();
    }

    public static void savePort(Context context, String port) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(tcpPortKey, port);
        editor.commit();
    }

    public static void saveBluetoothAddress(Context context, String address) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(bluetoothAddressKey, address);
        editor.commit();
    }
}
