package com.example.customlistviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CustomGridView extends AppCompatActivity {
    private GridView gridView;
    private List<Usb> listUsb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list_view_activity_screen_02);

        gridView = (GridView) findViewById(R.id.gridview);

        listUsb = new ArrayList<>();
        listUsb.add(new Usb(1));
        listUsb.add(new Usb(2));
        listUsb.add(new Usb(3));
        listUsb.add(new Usb(4));
        listUsb.add(new Usb(5));
        listUsb.add(new Usb(6));

        UsbAdapter adapter = new UsbAdapter(this, R.layout.item_custom_list_view_screen_02, listUsb);
        gridView.setAdapter(adapter);
    }
}
