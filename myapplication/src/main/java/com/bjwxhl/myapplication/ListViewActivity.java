package com.bjwxhl.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CaiBing.Zhang on 2015/12/1.e
 */
public class ListViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_listview);

        List<ShopBean> list = initData();
        ListView listview = (ListView)findViewById(R.id.lv_id);
        ShopAdapter adapter = new ShopAdapter(this,list);
        listview.setAdapter(adapter);
    }

    /**
     * 初始化数据
     * @return
     */
    private List<ShopBean> initData(){
        List<ShopBean> list = new ArrayList<>();
        for (int i=0 ;i<100;i++){
            ShopBean shopBean = new ShopBean();
            shopBean.setResImage(R.drawable.jd_1);
            shopBean.setUuid(String.valueOf(i));
            shopBean.setName(i + "华东交通大学_");
            shopBean.setDesc( "华东交通大学帅哥美女云集");

            list.add(shopBean);
        }
        return list;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
