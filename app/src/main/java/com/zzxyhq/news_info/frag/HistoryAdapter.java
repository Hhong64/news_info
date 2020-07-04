package com.zzxyhq.news_info.frag;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.zzxyhq.news_info.R;
import com.zzxyhq.news_info.bean.HistoryBean;

import java.util.List;

public class HistoryAdapter extends BaseAdapter {
    Context context;
    List<HistoryBean.ResultBean> mDatas;

    public HistoryAdapter(Context context, List<HistoryBean.ResultBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
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
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_his_timeline,null);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        HistoryBean.ResultBean resultBean = mDatas.get(position);
        //判断当前位置的年份和上一个位置是否相同
        if(position !=0){
            HistoryBean.ResultBean lastBean = mDatas.get(position-1);
            if(resultBean.getYear()==lastBean.getYear()){
                holder.timeLayout.setVisibility(View.GONE);
            }else{
                holder.timeLayout.setVisibility(View.VISIBLE);
            }
        }else{
            holder.timeLayout.setVisibility(View.VISIBLE);
        }
        holder.timeTv.setText(resultBean.getYear()+"-"+resultBean.getMonth()+"-"+resultBean.getDay());
        holder.titleTv.setText(resultBean.getTitle());
        String picUrl = resultBean.getPic();
        if(TextUtils.isEmpty(picUrl)){
            holder.picTv.setVisibility(View.GONE);
        }else {
            holder.picTv.setVisibility(View.VISIBLE);
            Picasso.with(context).load(picUrl).into(holder.picTv);
        }
        return view;
    }
    class ViewHolder{
        TextView timeTv , titleTv;
        ImageView picTv ;
        LinearLayout timeLayout;
        public ViewHolder(View itemView){
            timeTv  = itemView.findViewById(R.id.item_his_time);
            titleTv = itemView.findViewById(R.id.item_his_title);
            picTv = itemView.findViewById(R.id.item_his_pic);
            timeLayout = itemView.findViewById(R.id.item_his_ll);
        }
    }
}
