package com.example.helloworld;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class MyAdapter extends BaseQuickAdapter<StringBean, BaseViewHolder> {
    public MyAdapter(int layoutResId, @Nullable List<StringBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, StringBean item) {
        helper.setText(R.id.item_text, item.getName());

    }
}
