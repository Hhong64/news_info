package com.zzxyhq.news_info.History;

public class ContentUrl {

    //获取指定日期对应的历史上的今天的网址
    public static String getTodayHistoryUrl(String version,int month,int day){
        String url = "http://api.juheapi.com/japi/toh?key=4fad9972b99bd49f21df68da9a9b65fa&v="+version+"&month="+month+"&day="+day;
        return url;
    }
    //获取指定日期的老黄历的网址
    public static String getLaoHuangLiUrl(String time){
        String url = "http://v.juhe.cn/laohuangli/d?date="+time+"&key=8aaa2ae104a061317782de8a5a822eaa";
        return url;
    }
    //http://api.juheapi.com/japi/tohdet?key=4fad9972b99bd49f21df68da9a9b65fa&v=1.0&id=4847
    //根据指定事件id，获取指定时间详情信息
    public static String getHistoryDescUrl(String version , String id){
        String url ="http://api.juheapi.com/japi/tohdet?key=4fad9972b99bd49f21df68da9a9b65fa&v="+version+"&id="+id;
        return url;
    }
}
