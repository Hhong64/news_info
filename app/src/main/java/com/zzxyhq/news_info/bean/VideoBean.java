package com.zzxyhq.news_info.bean;

import java.util.List;

public class VideoBean {


    private int count;
    private int total;
    private String nextPageUrl;
    private boolean adExist;
    private long date;
    private long nextPublishTime;
    private Object dialog;
    private Object topIssue;
    private int refreshCount;
    private int lastStartId;
    private List<ItemListBean> itemList;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    public boolean isAdExist() {
        return adExist;
    }

    public void setAdExist(boolean adExist) {
        this.adExist = adExist;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public long getNextPublishTime() {
        return nextPublishTime;
    }

    public void setNextPublishTime(long nextPublishTime) {
        this.nextPublishTime = nextPublishTime;
    }

    public Object getDialog() {
        return dialog;
    }

    public void setDialog(Object dialog) {
        this.dialog = dialog;
    }

    public Object getTopIssue() {
        return topIssue;
    }

    public void setTopIssue(Object topIssue) {
        this.topIssue = topIssue;
    }

    public int getRefreshCount() {
        return refreshCount;
    }

    public void setRefreshCount(int refreshCount) {
        this.refreshCount = refreshCount;
    }

    public int getLastStartId() {
        return lastStartId;
    }

    public void setLastStartId(int lastStartId) {
        this.lastStartId = lastStartId;
    }

    public List<ItemListBean> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemListBean> itemList) {
        this.itemList = itemList;
    }

    public static class ItemListBean {
        /**
         * type : video
         * data : {"dataType":"VideoBeanForClient","id":185341,"title":"爆笑超级碗广告：等等，这是我认识的海王？","description":"海王 Jason Momoa 为房地产公司拍摄的超级碗广告，家是他的庇护所，在这里他可以卸下所有防备，包括他的假肌肉和假发。\nFrom Rocket Mortgage","library":"DAILY","tags":[{"id":748,"name":"这些广告超有梗","actionUrl":"eyepetizer://tag/748/?title=%E8%BF%99%E4%BA%9B%E5%B9%BF%E5%91%8A%E8%B6%85%E6%9C%89%E6%A2%97","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/9056413cfeffaf0c841d894390aa8e08.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/ff0f6d0ad5f4b6211a3f746aaaffd916.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":766,"name":"脑洞广告","actionUrl":"eyepetizer://tag/766/?title=%E8%84%91%E6%B4%9E%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/7c46ad04ff913b87915615c78d226a40.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/0d6ab7ed49de67eab89ada4f65353e8c.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":172,"name":"什么鬼","actionUrl":"eyepetizer://tag/172/?title=%E4%BB%80%E4%B9%88%E9%AC%BC","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/e6b5568e865b26f3f84270e613955e59.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/e6b5568e865b26f3f84270e613955e59.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":432,"name":"超级碗","actionUrl":"eyepetizer://tag/432/?title=%E8%B6%85%E7%BA%A7%E7%A2%97","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/ab3367632b7c215048ae2f8322eb9a61.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/ab3367632b7c215048ae2f8322eb9a61.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":758,"name":"欧美广告","actionUrl":"eyepetizer://tag/758/?title=%E6%AC%A7%E7%BE%8E%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/4347ee94f8ae98a86f2913db3b8638f3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/8494d3626c41f8e8cb6316767cc0f573.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":16,"name":"广告","actionUrl":"eyepetizer://tag/16/?title=%E5%B9%BF%E5%91%8A","adTrack":null,"desc":"为广告人的精彩创意点赞","bgPicture":"http://img.kaiyanapp.com/e41e74fe73882b552de00d95d56748d2.jpeg?imageMogr2/quality/60","headerImage":"http://img.kaiyanapp.com/3054658dbd559ac42c4c282e9cab7a32.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0}],"consumption":{"collectionCount":2059,"shareCount":1958,"replyCount":25,"realCollectionCount":400},"resourceType":"video","slogan":null,"provider":{"name":"YouTube","alias":"youtube","icon":"http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"},"category":"广告","author":{"id":2162,"icon":"http://img.kaiyanapp.com/98beab66d3885a139b54f21e91817c4f.jpeg","name":"开眼广告精选","description":"为广告人的精彩创意点赞","link":"","latestReleaseTime":1580778010000,"videoNum":1282,"adTrack":null,"follow":{"itemType":"author","itemId":2162,"followed":false},"shield":{"itemType":"author","itemId":2162,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false},"cover":{"feed":"http://img.kaiyanapp.com/6c467ffcd02b4b93c5af2705b29076ea.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/6c467ffcd02b4b93c5af2705b29076ea.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/a7b1156325f8764ffa297f903af5981d.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/6c467ffcd02b4b93c5af2705b29076ea.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=185341&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss","thumbPlayUrl":null,"duration":80,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=185341","forWeibo":"http://www.eyepetizer.net/detail.html?vid=185341&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1580778010000,"playInfo":[{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=185341&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss","size":9136645},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=185341&resourceType=video&editionType=high&source=ucloud&playUrlType=url_oss","size":9136645}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=185341&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss"}],"campaign":null,"waterMarks":null,"ad":false,"adTrack":null,"type":"NORMAL","titlePgc":null,"descriptionPgc":null,"remark":null,"ifLimitVideo":false,"searchWeight":0,"brandWebsiteInfo":null,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1580778000000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"海王 Jason Momoa 为房地产公司拍摄的超级碗广告，家是他的庇护所，在这里他可以卸下所有防备，包括他的假肌肉和假发。\nFrom Rocket Mortgage","collected":false,"reallyCollected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null}
         * tag : null
         * id : 0
         * adIndex : -1
         */

        private String type;
        private DataBean data;
        private Object tag;
        private int id;
        private int adIndex;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public Object getTag() {
            return tag;
        }

        public void setTag(Object tag) {
            this.tag = tag;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAdIndex() {
            return adIndex;
        }

        public void setAdIndex(int adIndex) {
            this.adIndex = adIndex;
        }

        public static class DataBean {
            /**
             * dataType : VideoBeanForClient
             * id : 185341
             * title : 爆笑超级碗广告：等等，这是我认识的海王？
             * description : 海王 Jason Momoa 为房地产公司拍摄的超级碗广告，家是他的庇护所，在这里他可以卸下所有防备，包括他的假肌肉和假发。
             From Rocket Mortgage
             * library : DAILY
             * tags : [{"id":748,"name":"这些广告超有梗","actionUrl":"eyepetizer://tag/748/?title=%E8%BF%99%E4%BA%9B%E5%B9%BF%E5%91%8A%E8%B6%85%E6%9C%89%E6%A2%97","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/9056413cfeffaf0c841d894390aa8e08.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/ff0f6d0ad5f4b6211a3f746aaaffd916.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":766,"name":"脑洞广告","actionUrl":"eyepetizer://tag/766/?title=%E8%84%91%E6%B4%9E%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/7c46ad04ff913b87915615c78d226a40.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/0d6ab7ed49de67eab89ada4f65353e8c.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":172,"name":"什么鬼","actionUrl":"eyepetizer://tag/172/?title=%E4%BB%80%E4%B9%88%E9%AC%BC","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/e6b5568e865b26f3f84270e613955e59.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/e6b5568e865b26f3f84270e613955e59.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":432,"name":"超级碗","actionUrl":"eyepetizer://tag/432/?title=%E8%B6%85%E7%BA%A7%E7%A2%97","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/ab3367632b7c215048ae2f8322eb9a61.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/ab3367632b7c215048ae2f8322eb9a61.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":758,"name":"欧美广告","actionUrl":"eyepetizer://tag/758/?title=%E6%AC%A7%E7%BE%8E%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/4347ee94f8ae98a86f2913db3b8638f3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/8494d3626c41f8e8cb6316767cc0f573.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":16,"name":"广告","actionUrl":"eyepetizer://tag/16/?title=%E5%B9%BF%E5%91%8A","adTrack":null,"desc":"为广告人的精彩创意点赞","bgPicture":"http://img.kaiyanapp.com/e41e74fe73882b552de00d95d56748d2.jpeg?imageMogr2/quality/60","headerImage":"http://img.kaiyanapp.com/3054658dbd559ac42c4c282e9cab7a32.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0}]
             * consumption : {"collectionCount":2059,"shareCount":1958,"replyCount":25,"realCollectionCount":400}
             * resourceType : video
             * slogan : null
             * provider : {"name":"YouTube","alias":"youtube","icon":"http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"}
             * category : 广告
             * author : {"id":2162,"icon":"http://img.kaiyanapp.com/98beab66d3885a139b54f21e91817c4f.jpeg","name":"开眼广告精选","description":"为广告人的精彩创意点赞","link":"","latestReleaseTime":1580778010000,"videoNum":1282,"adTrack":null,"follow":{"itemType":"author","itemId":2162,"followed":false},"shield":{"itemType":"author","itemId":2162,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false}
             * cover : {"feed":"http://img.kaiyanapp.com/6c467ffcd02b4b93c5af2705b29076ea.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/6c467ffcd02b4b93c5af2705b29076ea.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/a7b1156325f8764ffa297f903af5981d.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/6c467ffcd02b4b93c5af2705b29076ea.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"}
             * playUrl : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=185341&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss
             * thumbPlayUrl : null
             * duration : 80
             * webUrl : {"raw":"http://www.eyepetizer.net/detail.html?vid=185341","forWeibo":"http://www.eyepetizer.net/detail.html?vid=185341&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"}
             * releaseTime : 1580778010000
             * playInfo : [{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=185341&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss","size":9136645},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=185341&resourceType=video&editionType=high&source=ucloud&playUrlType=url_oss","size":9136645}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=185341&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss"}]
             * campaign : null
             * waterMarks : null
             * ad : false
             * adTrack : null
             * type : NORMAL
             * titlePgc : null
             * descriptionPgc : null
             * remark : null
             * ifLimitVideo : false
             * searchWeight : 0
             * brandWebsiteInfo : null
             * idx : 0
             * shareAdTrack : null
             * favoriteAdTrack : null
             * webAdTrack : null
             * date : 1580778000000
             * promotion : null
             * label : null
             * labelList : []
             * descriptionEditor : 海王 Jason Momoa 为房地产公司拍摄的超级碗广告，家是他的庇护所，在这里他可以卸下所有防备，包括他的假肌肉和假发。
             From Rocket Mortgage
             * collected : false
             * reallyCollected : false
             * played : false
             * subtitles : []
             * lastViewTime : null
             * playlists : null
             * src : null
             */

            private String dataType;
            private int id;
            private String title;
            private String description;
            private String library;
            private ConsumptionBean consumption;
            private String resourceType;
            private Object slogan;
            private ProviderBean provider;
            private String category;
            private AuthorBean author;
            private CoverBean cover;
            private String playUrl;
            private Object thumbPlayUrl;
            private int duration;
            private WebUrlBean webUrl;
            private long releaseTime;
            private Object campaign;
            private Object waterMarks;
            private boolean ad;
            private Object adTrack;
            private String type;
            private Object titlePgc;
            private Object descriptionPgc;
            private Object remark;
            private boolean ifLimitVideo;
            private int searchWeight;
            private Object brandWebsiteInfo;
            private int idx;
            private Object shareAdTrack;
            private Object favoriteAdTrack;
            private Object webAdTrack;
            private long date;
            private Object promotion;
            private Object label;
            private String descriptionEditor;
            private boolean collected;
            private boolean reallyCollected;
            private boolean played;
            private Object lastViewTime;
            private Object playlists;
            private Object src;
            private List<TagsBean> tags;
            private List<PlayInfoBean> playInfo;
            private List<?> labelList;
            private List<?> subtitles;

            public String getDataType() {
                return dataType;
            }

            public void setDataType(String dataType) {
                this.dataType = dataType;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getLibrary() {
                return library;
            }

            public void setLibrary(String library) {
                this.library = library;
            }

            public ConsumptionBean getConsumption() {
                return consumption;
            }

            public void setConsumption(ConsumptionBean consumption) {
                this.consumption = consumption;
            }

            public String getResourceType() {
                return resourceType;
            }

            public void setResourceType(String resourceType) {
                this.resourceType = resourceType;
            }

            public Object getSlogan() {
                return slogan;
            }

            public void setSlogan(Object slogan) {
                this.slogan = slogan;
            }

            public ProviderBean getProvider() {
                return provider;
            }

            public void setProvider(ProviderBean provider) {
                this.provider = provider;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public CoverBean getCover() {
                return cover;
            }

            public void setCover(CoverBean cover) {
                this.cover = cover;
            }

            public String getPlayUrl() {
                return playUrl;
            }

            public void setPlayUrl(String playUrl) {
                this.playUrl = playUrl;
            }

            public Object getThumbPlayUrl() {
                return thumbPlayUrl;
            }

            public void setThumbPlayUrl(Object thumbPlayUrl) {
                this.thumbPlayUrl = thumbPlayUrl;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public WebUrlBean getWebUrl() {
                return webUrl;
            }

            public void setWebUrl(WebUrlBean webUrl) {
                this.webUrl = webUrl;
            }

            public long getReleaseTime() {
                return releaseTime;
            }

            public void setReleaseTime(long releaseTime) {
                this.releaseTime = releaseTime;
            }

            public Object getCampaign() {
                return campaign;
            }

            public void setCampaign(Object campaign) {
                this.campaign = campaign;
            }

            public Object getWaterMarks() {
                return waterMarks;
            }

            public void setWaterMarks(Object waterMarks) {
                this.waterMarks = waterMarks;
            }

            public boolean isAd() {
                return ad;
            }

            public void setAd(boolean ad) {
                this.ad = ad;
            }

            public Object getAdTrack() {
                return adTrack;
            }

            public void setAdTrack(Object adTrack) {
                this.adTrack = adTrack;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public Object getTitlePgc() {
                return titlePgc;
            }

            public void setTitlePgc(Object titlePgc) {
                this.titlePgc = titlePgc;
            }

            public Object getDescriptionPgc() {
                return descriptionPgc;
            }

            public void setDescriptionPgc(Object descriptionPgc) {
                this.descriptionPgc = descriptionPgc;
            }

            public Object getRemark() {
                return remark;
            }

            public void setRemark(Object remark) {
                this.remark = remark;
            }

            public boolean isIfLimitVideo() {
                return ifLimitVideo;
            }

            public void setIfLimitVideo(boolean ifLimitVideo) {
                this.ifLimitVideo = ifLimitVideo;
            }

            public int getSearchWeight() {
                return searchWeight;
            }

            public void setSearchWeight(int searchWeight) {
                this.searchWeight = searchWeight;
            }

            public Object getBrandWebsiteInfo() {
                return brandWebsiteInfo;
            }

            public void setBrandWebsiteInfo(Object brandWebsiteInfo) {
                this.brandWebsiteInfo = brandWebsiteInfo;
            }

            public int getIdx() {
                return idx;
            }

            public void setIdx(int idx) {
                this.idx = idx;
            }

            public Object getShareAdTrack() {
                return shareAdTrack;
            }

            public void setShareAdTrack(Object shareAdTrack) {
                this.shareAdTrack = shareAdTrack;
            }

            public Object getFavoriteAdTrack() {
                return favoriteAdTrack;
            }

            public void setFavoriteAdTrack(Object favoriteAdTrack) {
                this.favoriteAdTrack = favoriteAdTrack;
            }

            public Object getWebAdTrack() {
                return webAdTrack;
            }

            public void setWebAdTrack(Object webAdTrack) {
                this.webAdTrack = webAdTrack;
            }

            public long getDate() {
                return date;
            }

            public void setDate(long date) {
                this.date = date;
            }

            public Object getPromotion() {
                return promotion;
            }

            public void setPromotion(Object promotion) {
                this.promotion = promotion;
            }

            public Object getLabel() {
                return label;
            }

            public void setLabel(Object label) {
                this.label = label;
            }

            public String getDescriptionEditor() {
                return descriptionEditor;
            }

            public void setDescriptionEditor(String descriptionEditor) {
                this.descriptionEditor = descriptionEditor;
            }

            public boolean isCollected() {
                return collected;
            }

            public void setCollected(boolean collected) {
                this.collected = collected;
            }

            public boolean isReallyCollected() {
                return reallyCollected;
            }

            public void setReallyCollected(boolean reallyCollected) {
                this.reallyCollected = reallyCollected;
            }

            public boolean isPlayed() {
                return played;
            }

            public void setPlayed(boolean played) {
                this.played = played;
            }

            public Object getLastViewTime() {
                return lastViewTime;
            }

            public void setLastViewTime(Object lastViewTime) {
                this.lastViewTime = lastViewTime;
            }

            public Object getPlaylists() {
                return playlists;
            }

            public void setPlaylists(Object playlists) {
                this.playlists = playlists;
            }

            public Object getSrc() {
                return src;
            }

            public void setSrc(Object src) {
                this.src = src;
            }

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public List<PlayInfoBean> getPlayInfo() {
                return playInfo;
            }

            public void setPlayInfo(List<PlayInfoBean> playInfo) {
                this.playInfo = playInfo;
            }

            public List<?> getLabelList() {
                return labelList;
            }

            public void setLabelList(List<?> labelList) {
                this.labelList = labelList;
            }

            public List<?> getSubtitles() {
                return subtitles;
            }

            public void setSubtitles(List<?> subtitles) {
                this.subtitles = subtitles;
            }

            public static class ConsumptionBean {

                private int collectionCount;
                private int shareCount;
                private int replyCount;
                private int realCollectionCount;

                public int getCollectionCount() {
                    return collectionCount;
                }

                public void setCollectionCount(int collectionCount) {
                    this.collectionCount = collectionCount;
                }

                public int getShareCount() {
                    return shareCount;
                }

                public void setShareCount(int shareCount) {
                    this.shareCount = shareCount;
                }

                public int getReplyCount() {
                    return replyCount;
                }

                public void setReplyCount(int replyCount) {
                    this.replyCount = replyCount;
                }

                public int getRealCollectionCount() {
                    return realCollectionCount;
                }

                public void setRealCollectionCount(int realCollectionCount) {
                    this.realCollectionCount = realCollectionCount;
                }
            }

            public static class ProviderBean {


                private String name;
                private String alias;
                private String icon;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getAlias() {
                    return alias;
                }

                public void setAlias(String alias) {
                    this.alias = alias;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }
            }

            public static class AuthorBean {

                private int id;
                private String icon;
                private String name;
                private String description;
                private String link;
                private long latestReleaseTime;
                private int videoNum;
                private Object adTrack;
                private FollowBean follow;
                private ShieldBean shield;
                private int approvedNotReadyVideoCount;
                private boolean ifPgc;
                private int recSort;
                private boolean expert;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public long getLatestReleaseTime() {
                    return latestReleaseTime;
                }

                public void setLatestReleaseTime(long latestReleaseTime) {
                    this.latestReleaseTime = latestReleaseTime;
                }

                public int getVideoNum() {
                    return videoNum;
                }

                public void setVideoNum(int videoNum) {
                    this.videoNum = videoNum;
                }

                public Object getAdTrack() {
                    return adTrack;
                }

                public void setAdTrack(Object adTrack) {
                    this.adTrack = adTrack;
                }

                public FollowBean getFollow() {
                    return follow;
                }

                public void setFollow(FollowBean follow) {
                    this.follow = follow;
                }

                public ShieldBean getShield() {
                    return shield;
                }

                public void setShield(ShieldBean shield) {
                    this.shield = shield;
                }

                public int getApprovedNotReadyVideoCount() {
                    return approvedNotReadyVideoCount;
                }

                public void setApprovedNotReadyVideoCount(int approvedNotReadyVideoCount) {
                    this.approvedNotReadyVideoCount = approvedNotReadyVideoCount;
                }

                public boolean isIfPgc() {
                    return ifPgc;
                }

                public void setIfPgc(boolean ifPgc) {
                    this.ifPgc = ifPgc;
                }

                public int getRecSort() {
                    return recSort;
                }

                public void setRecSort(int recSort) {
                    this.recSort = recSort;
                }

                public boolean isExpert() {
                    return expert;
                }

                public void setExpert(boolean expert) {
                    this.expert = expert;
                }

                public static class FollowBean {

                    private String itemType;
                    private int itemId;
                    private boolean followed;

                    public String getItemType() {
                        return itemType;
                    }

                    public void setItemType(String itemType) {
                        this.itemType = itemType;
                    }

                    public int getItemId() {
                        return itemId;
                    }

                    public void setItemId(int itemId) {
                        this.itemId = itemId;
                    }

                    public boolean isFollowed() {
                        return followed;
                    }

                    public void setFollowed(boolean followed) {
                        this.followed = followed;
                    }
                }

                public static class ShieldBean {


                    private String itemType;
                    private int itemId;
                    private boolean shielded;

                    public String getItemType() {
                        return itemType;
                    }

                    public void setItemType(String itemType) {
                        this.itemType = itemType;
                    }

                    public int getItemId() {
                        return itemId;
                    }

                    public void setItemId(int itemId) {
                        this.itemId = itemId;
                    }

                    public boolean isShielded() {
                        return shielded;
                    }

                    public void setShielded(boolean shielded) {
                        this.shielded = shielded;
                    }
                }
            }

            public static class CoverBean {


                private String feed;
                private String detail;
                private String blurred;
                private Object sharing;
                private String homepage;

                public String getFeed() {
                    return feed;
                }

                public void setFeed(String feed) {
                    this.feed = feed;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getBlurred() {
                    return blurred;
                }

                public void setBlurred(String blurred) {
                    this.blurred = blurred;
                }

                public Object getSharing() {
                    return sharing;
                }

                public void setSharing(Object sharing) {
                    this.sharing = sharing;
                }

                public String getHomepage() {
                    return homepage;
                }

                public void setHomepage(String homepage) {
                    this.homepage = homepage;
                }
            }

            public static class WebUrlBean {


                private String raw;
                private String forWeibo;

                public String getRaw() {
                    return raw;
                }

                public void setRaw(String raw) {
                    this.raw = raw;
                }

                public String getForWeibo() {
                    return forWeibo;
                }

                public void setForWeibo(String forWeibo) {
                    this.forWeibo = forWeibo;
                }
            }

            public static class TagsBean {


                private int id;
                private String name;
                private String actionUrl;
                private Object adTrack;
                private Object desc;
                private String bgPicture;
                private String headerImage;
                private String tagRecType;
                private Object childTagList;
                private Object childTagIdList;
                private boolean haveReward;
                private boolean ifNewest;
                private Object newestEndTime;
                private int communityIndex;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getActionUrl() {
                    return actionUrl;
                }

                public void setActionUrl(String actionUrl) {
                    this.actionUrl = actionUrl;
                }

                public Object getAdTrack() {
                    return adTrack;
                }

                public void setAdTrack(Object adTrack) {
                    this.adTrack = adTrack;
                }

                public Object getDesc() {
                    return desc;
                }

                public void setDesc(Object desc) {
                    this.desc = desc;
                }

                public String getBgPicture() {
                    return bgPicture;
                }

                public void setBgPicture(String bgPicture) {
                    this.bgPicture = bgPicture;
                }

                public String getHeaderImage() {
                    return headerImage;
                }

                public void setHeaderImage(String headerImage) {
                    this.headerImage = headerImage;
                }

                public String getTagRecType() {
                    return tagRecType;
                }

                public void setTagRecType(String tagRecType) {
                    this.tagRecType = tagRecType;
                }

                public Object getChildTagList() {
                    return childTagList;
                }

                public void setChildTagList(Object childTagList) {
                    this.childTagList = childTagList;
                }

                public Object getChildTagIdList() {
                    return childTagIdList;
                }

                public void setChildTagIdList(Object childTagIdList) {
                    this.childTagIdList = childTagIdList;
                }

                public boolean isHaveReward() {
                    return haveReward;
                }

                public void setHaveReward(boolean haveReward) {
                    this.haveReward = haveReward;
                }

                public boolean isIfNewest() {
                    return ifNewest;
                }

                public void setIfNewest(boolean ifNewest) {
                    this.ifNewest = ifNewest;
                }

                public Object getNewestEndTime() {
                    return newestEndTime;
                }

                public void setNewestEndTime(Object newestEndTime) {
                    this.newestEndTime = newestEndTime;
                }

                public int getCommunityIndex() {
                    return communityIndex;
                }

                public void setCommunityIndex(int communityIndex) {
                    this.communityIndex = communityIndex;
                }
            }

            public static class PlayInfoBean {

                private int height;
                private int width;
                private String name;
                private String type;
                private String url;
                private List<UrlListBean> urlList;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public List<UrlListBean> getUrlList() {
                    return urlList;
                }

                public void setUrlList(List<UrlListBean> urlList) {
                    this.urlList = urlList;
                }

                public static class UrlListBean {


                    private String name;
                    private String url;
                    private int size;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getSize() {
                        return size;
                    }

                    public void setSize(int size) {
                        this.size = size;
                    }
                }
            }
        }
    }
}