package com.bjwxhl.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by CaiBing.Zhang on 2015/12/1.
 */
public class ShopAdapter extends BaseAdapter{
    private Context context;
    private List<ShopBean> list;
//    private Set<ShopBean> set;
//    private Map<Integer,ShopBean> map;
//    private ShopBean[] shopBeans;

    public ShopAdapter(Context context,List<ShopBean> list){
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public ShopBean getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if(convertView==null){
            convertView  = LayoutInflater.from(context)
                    .inflate(R.layout.activity_listview_item,null);
            vh = new ViewHolder();
            vh.imageView = (ImageView) convertView.findViewById(R.id.iv_id);
            vh.nameTv =(TextView)convertView.findViewById(R.id.name_id);
            vh.descTv =(TextView)convertView.findViewById(R.id.desc_id);
            convertView.setTag(vh);
        }else{
            vh = (ViewHolder) convertView.getTag();
        }

        ShopBean shopBean = getItem(position);
        vh.imageView.setImageResource(shopBean.getResImage());
        vh.nameTv.setText(shopBean.getName());
        vh.descTv.setText(shopBean.getDesc());
        return convertView;
    }

    class ViewHolder{
        ImageView imageView;
        TextView nameTv;
        TextView descTv;
    }
}
