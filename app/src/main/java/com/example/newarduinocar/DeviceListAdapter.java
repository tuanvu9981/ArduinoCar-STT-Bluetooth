package com.example.newarduinocar;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

public class DeviceListAdapter extends ArrayAdapter<DeviceItem> {
    private Context context;
    private BluetoothAdapter bTAdapter;

    public DeviceListAdapter(Context context, List items, BluetoothAdapter bTAdapter) {
        super(context, android.R.layout.simple_list_item_1, items);
        this.bTAdapter = bTAdapter;
        this.context = context;
    }
}
