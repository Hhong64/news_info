package com.zzxyhq.news_info;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.zzxyhq.news_info.bean.VideoBean;
import com.zzxyhq.news_info.frag.VideoAdapter;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import cn.jzvd.JzvdStd;

public class VideoActivity extends AppCompatActivity {
    ListView fabLv;
    String url = "http://baobab.kaiyanapp.com/api/v4/tabs/selected?udid=11111&vc=168&vn=3.3.1" +
            "&deviceModel=Huawei%36&first_channel=eyepetizer_baidu_market&last_channel=eyepetizer_baidu_market&system_version_code=20";
    List<VideoBean.ItemListBean> mDatas;
    private VideoAdapter vdadapter;
    @SuppressLint("HandlerLeak")
    Handler handler = new Handler(){
        @Override
        public void handleMessage( Message msg) {
            if(msg.what == 1){
                String json = (String) msg.obj;
                //解析数据
                VideoBean videoBean = new Gson().fromJson(json,VideoBean.class);
                //过滤了不需要的数据
                List<VideoBean.ItemListBean> itemList = videoBean.getItemList();
                for(int i=0 ;i < itemList.size() ; i++){
                    VideoBean.ItemListBean listBean = itemList.get(i);
                    if(listBean.getType().equals("video")){
                        mDatas.add(listBean);
                    }
                }
                //提示适配器更新数据
                vdadapter.notifyDataSetChanged();
            }
        }
    };

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_fab);
        setTitle("短视频");
        fabLv = findViewById(R.id.fab_lv);
        //数据源
        mDatas = new ArrayList<>();
        //创建适配器对象
        vdadapter = new VideoAdapter(this,mDatas);
        //设置适配器
        fabLv.setAdapter(vdadapter);
        //加载网络数据
        loadData();
    }
    private void loadData() {
        /*创建新线程，完成数据的获取*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String jsonContent = HttpUtils.getJsonContent(url);
                    //子线程不能更新UI，需要通过handler发送数据回到线程
                    Message message = new Message(); // 发送消息对象
                    message.what = 1 ;//消息编号
                    message.obj = jsonContent;
                    handler.sendMessage(message);

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
    protected void onStop(){
        super.onStop();
        JzvdStd.releaseAllVideos();
    }
}
