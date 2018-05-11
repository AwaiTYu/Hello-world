package com.example.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("tag", "张俊杰是个大帅比");
        Log.e("tag", "侯坤是个丑13");
        setContentView(R.layout.activity_main);
        ArrayList<StringBean> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            StringBean bean = new StringBean();
            bean.setName("i" + i);
            list.add(bean);
        }

        RecyclerView re = findViewById(R.id.myrecyclerview);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        manager.setSmoothScrollbarEnabled(true);
        manager.setAutoMeasureEnabled(true);
        re.setLayoutManager(manager);

        MyAdapter adapter = new MyAdapter(R.layout.item, list);
        re.setAdapter(adapter);
    }
}
