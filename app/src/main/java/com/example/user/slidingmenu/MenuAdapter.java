package com.example.user.slidingmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 2016/2/19.
 */
public class MenuAdapter extends BaseAdapter {
    private Context mContext;
    private List<MenuItem> mDatas;
    private LayoutInflater mInflater;
    public MenuAdapter(Context context , List<MenuItem> datas){
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mDatas = datas;
    }
    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null){
            convertView = mInflater.inflate(R.layout.left_menu_item,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.mImageView = (ImageView) convertView.findViewById(R.id.menu_imageview);
            viewHolder.mTextView = (TextView) convertView.findViewById(R.id.menu_textview);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        MenuItem menuItem = mDatas.get(position);
        viewHolder.mImageView.setImageResource(menuItem.getResId());
        viewHolder.mTextView.setText(menuItem.getName());
        return convertView;
    }
    private static class ViewHolder{
        ImageView mImageView;
        TextView mTextView;
    }
}
