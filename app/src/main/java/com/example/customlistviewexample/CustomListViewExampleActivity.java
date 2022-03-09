package com.example.customlistviewexample;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.ArrayList;
import android.widget.ListView;
import java.util.List;

public class CustomListViewExampleActivity extends AppCompatActivity {
    private List<Language> listLanguage;
    private ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list_view_activity);

        listView = (ListView) findViewById(R.id.idListView);
        listLanguage = new ArrayList<>();
        listLanguage.add(new Language(1, "Ca nấu lẩu nấu mì mini","Shop Devang"));
        listLanguage.add(new Language(2, "1kg khô gà bơ tỏi","Shop LTD Food"));
        listLanguage.add(new Language(3, "Xe cần cẩu đa năng","Shop Thế Giới đồ chơi"));
        listLanguage.add(new Language(4, "Đồ chơi dạng mô hình","Shop Thế Giới đồ chơi"));
        listLanguage.add(new Language(5, "Lãnh đạo đơn giản","Shop Minh Long Book"));
        listLanguage.add(new Language(6, "Dolnal Trum Thiên tài lãnh dạo","Shop Minh Long Book"));

        LanguageAdapter adapter = new LanguageAdapter(this,R.layout.item_custom_list_view,listLanguage);
        listView.setAdapter(adapter);

    }
}

