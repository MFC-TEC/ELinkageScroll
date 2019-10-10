package com.baidu.elinkagescroll.sample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.baidu.elinkagescroll.R;

import java.util.ArrayList;

/**
 * Recyclerview的adapter
 *
 * @author zhanghao43
 * @since 2019/04/16
 */
public class LinkageRecyclerAdapter extends RecyclerView.Adapter<LinkageRecyclerAdapter.ViewHolder> {

    /** 数据集 */
    private ArrayList<String> mData;

    private int mVHBackgroundColor;

    /**
     * constructor
     *
     * @param data
     */
    public LinkageRecyclerAdapter(ArrayList<String> data, int color) {
        this.mData = data;
        this.mVHBackgroundColor = color;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.linkage_rv_simple_item, parent, false);
        item.setBackgroundColor(mVHBackgroundColor);
        ViewHolder vh = new ViewHolder(item);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTv.setText(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView mTv;

        public ViewHolder(View itemView) {
            super(itemView);
            mTv = itemView.findViewById(R.id.text);
        }
    }

    /**
     * 移出指定位置的item
     *
     * @param position
     */
    public void remove(int position) {
        mData.remove(position);
        notifyDataSetChanged();
    }

    /**
     * 在指定位置添加item
     *
     * @param text
     * @param position
     */
    public void add(String text, int position) {
        mData.add(position, text);
        notifyDataSetChanged();
    }
}
