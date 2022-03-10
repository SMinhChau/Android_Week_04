package com.example.customlistviewexample;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.List;

public class UsbAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Usb> listUsb;
    private int positionSelect = -1;

    public UsbAdapter(Context context, int idLayout, List<Usb> listUsb) {
        this.context = context;
        this.idLayout = idLayout;
        this.listUsb = listUsb;
    }

    @Override
    public int getCount() {
        if (listUsb.size() != 0 && !listUsb.isEmpty()) {
            return listUsb.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
        }
        ImageView imageView = (ImageView) convertView.findViewById(R.id.logo);
        final LinearLayout linearLayout = (LinearLayout) convertView.findViewById(R.id.idLinearLayout);
        final Usb usb = listUsb.get(position);
        if (listUsb != null && !listUsb.isEmpty()) {

            int idLanguage = usb.getId();
            switch (idLanguage) {
                case 1:
                    imageView.setImageResource(R.drawable.giacchuyen_1);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.daynguon_1);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.dauchuyendoipsps2_1);
                    break;
                case 4:
                    imageView.setImageResource(R.drawable.dauchuyendoi_1);
                    break;
                case 5:
                    imageView.setImageResource(R.drawable.carbusbtops2_1);
                    break;
                case 6:
                    imageView.setImageResource(R.drawable.daucam_1);
                    break;

                default:
                    break;
            }
        }
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionSelect = position;
                notifyDataSetChanged();
            }
        });

        if (positionSelect == position) {
            linearLayout.setBackgroundColor(Color.BLUE);
        } else {
            linearLayout.setBackgroundColor(Color.WHITE);
        }
        return convertView;
    }
}
