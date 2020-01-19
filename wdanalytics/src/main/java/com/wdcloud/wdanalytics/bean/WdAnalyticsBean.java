package com.wdcloud.wdanalytics.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Info:上传事件服务Bean
 * Created by Yanxin.
 * CreateTime: 2019/11/27 15:50
 */
public class WdAnalyticsBean {
    /**
     * 基本参数说明
     * $originalId":  ”设备ID”,
     * "distinctId":  ”登录用户ID”,
     * "$project": “app名称”,
     * "$packageName": “包名”
     * "locationCode": “武侯/青岛”
     * "channel":   “渠道号  AppStore”
     * "$manufacturer":  ”设备厂商”,
     * "$model": “设备型号”,
     * "$os”:"  “操作系统”,
     * "$osVersion":  ”操作系统版本”,
     * "screenWidth":  ”屏幕宽度”,
     * "screenHeight": ”屏幕高度”,
     * "$appVersion":  ”app版本”,
     * "sdkVersion":  “统计sdk版本”
     * "updateTime":  “上传时间”
     */
    private String originalId;
    private String distinctId;
    private String project;
    private String packageName;
    private String locationCode;
    private String channel;
    private String manufacturer;
    private String model;
    private String os;
    private String osVersion;
    private int screenWidth;
    private int screenHeight;
    private String appVersion;
    private String sdkVersion;
    private String updateTime;
    private List<EventsBean> records;

    public WdAnalyticsBean(String originalId, String project, String packageName, String manufacturer, String model, String os, String osVersion, String appVersion) {
        this.originalId = originalId;
        this.project = project;
        this.packageName = packageName;
        this.manufacturer = manufacturer;
        this.model = model;
        this.os = os;
        this.osVersion = osVersion;
        this.appVersion = appVersion;
    }

    @Override
    public String toString() {
        return "WdAnalyticsBean{" +
                "records=" + records +
                '}';
    }

    public String getOriginalId() {
        return originalId == null ? "" : originalId;
    }

    public void setOriginalId(String originalId) {
        this.originalId = originalId == null ? "" : originalId;
    }

    public String getDistinctId() {
        return distinctId == null ? "" : distinctId;
    }

    public void setDistinctId(String distinctId) {
        this.distinctId = distinctId == null ? "" : distinctId;
    }

    public String getProject() {
        return project == null ? "" : project;
    }

    public void setProject(String project) {
        this.project = project == null ? "" : project;
    }

    public String getPackageName() {
        return packageName == null ? "" : packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? "" : packageName;
    }

    public String getLocationCode() {
        return locationCode == null ? "" : locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode == null ? "" : locationCode;
    }

    public String getChannel() {
        return channel == null ? "" : channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? "" : channel;
    }

    public String getManufacturer() {
        return manufacturer == null ? "" : manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? "" : manufacturer;
    }

    public String getModel() {
        return model == null ? "" : model;
    }

    public void setModel(String model) {
        this.model = model == null ? "" : model;
    }

    public String getOs() {
        return os == null ? "" : os;
    }

    public void setOs(String os) {
        this.os = os == null ? "" : os;
    }

    public String getOsVersion() {
        return osVersion == null ? "" : osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion == null ? "" : osVersion;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }

    public String getAppVersion() {
        return appVersion == null ? "" : appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? "" : appVersion;
    }

    public String getSdkVersion() {
        return sdkVersion == null ? "" : sdkVersion;
    }

    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion == null ? "" : sdkVersion;
    }

    public String getUpdateTime() {
        return updateTime == null ? "" : updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? "" : updateTime;
    }

    public List<EventsBean> getRecords() {
        if (records == null) {
            return new ArrayList<>();
        }
        return records;
    }

    public void setRecords(List<EventsBean> records) {
        this.records = records;
    }

    /**
     * 自定义事件参数
     * isRealTime": bool类型是否是实时事件
     * "$type": “记录类型”,
     * “event”:自定义事件 “page”: 页面统计
     * "$time":  自定义事件发生时间戳 / 页面进入时间戳
     * "$duration": 自定义事件持续时间(单位s) (瞬时事件传0) / 页面停留时间
     * "eventId": “自定义事件Id”        00101
     * "eventName": “自定义事件名称”,    点赞
     * "pageId": “页面Id”               00100
     * "pageName": “页面名称”        首页
     * "prefixPageId":  “上级页面Id”
     * "prefixPageNameId":  “上级页面名称”
     */
    public static class EventsBean {
        private Boolean isRealTime;
        private String type;
        private String time;
        private String duration;
        private String eventId;
        private String eventName;
        private String pageId;
        private String pageName;
        private String prefixPageId;
        private String prefixPageNameId;
        private ProPertiesBean proPertiesBean;

        public EventsBean() {
        }

        public EventsBean(Boolean isRealTime, String type, String event, String time, String duration, String eventId, String eventName, String pageId, String pageName, String prefixPageId, String prefixPageNameId) {
            this.isRealTime = isRealTime;
            this.type = type;
            this.time = time;
            this.duration = duration;
            this.eventId = eventId;
            this.eventName = eventName;
            this.pageId = pageId;
            this.pageName = pageName;
            this.prefixPageId = prefixPageId;
            this.prefixPageNameId = prefixPageNameId;
        }

        public Boolean getRealTime() {
            return isRealTime;
        }

        public void setRealTime(Boolean realTime) {
            isRealTime = realTime;
        }

        public String getType() {
            return type == null ? "" : type;
        }

        public void setType(String type) {
            this.type = type == null ? "" : type;
        }

        public String getTime() {
            return time == null ? "" : time;
        }

        public void setTime(String time) {
            this.time = time == null ? "" : time;
        }

        public String getDuration() {
            return duration == null ? "" : duration;
        }

        public void setDuration(String duration) {
            this.duration = duration == null ? "" : duration;
        }

        public String getEventId() {
            return eventId == null ? "" : eventId;
        }

        public void setEventId(String eventId) {
            this.eventId = eventId == null ? "" : eventId;
        }

        public String getEventName() {
            return eventName == null ? "" : eventName;
        }

        public void setEventName(String eventName) {
            this.eventName = eventName == null ? "" : eventName;
        }

        public String getPageId() {
            return pageId == null ? "" : pageId;
        }

        public void setPageId(String pageId) {
            this.pageId = pageId == null ? "" : pageId;
        }

        public String getPageName() {
            return pageName == null ? "" : pageName;
        }

        public void setPageName(String pageName) {
            this.pageName = pageName == null ? "" : pageName;
        }

        public String getPrefixPageId() {
            return prefixPageId == null ? "" : prefixPageId;
        }

        public void setPrefixPageId(String prefixPageId) {
            this.prefixPageId = prefixPageId == null ? "" : prefixPageId;
        }

        public String getPrefixPageNameId() {
            return prefixPageNameId == null ? "" : prefixPageNameId;
        }

        public void setPrefixPageNameId(String prefixPageNameId) {
            this.prefixPageNameId = prefixPageNameId == null ? "" : prefixPageNameId;
        }

        public ProPertiesBean getProPertiesBean() {
            return proPertiesBean;
        }

        public void setProPertiesBean(ProPertiesBean proPertiesBean) {
            this.proPertiesBean = proPertiesBean;
        }

        @Override
        public String toString() {
            return "EventsBean{" +
                    "isRealTime=" + isRealTime +
                    ", type='" + type + '\'' +
                    ", time='" + time + '\'' +
                    ", duration='" + duration + '\'' +
                    ", eventId='" + eventId + '\'' +
                    ", eventName='" + eventName + '\'' +
                    ", pageId='" + pageId + '\'' +
                    ", pageName='" + pageName + '\'' +
                    ", prefixPageId='" + prefixPageId + '\'' +
                    ", prefixPageNameId='" + prefixPageNameId + '\'' +
                    ", proPertiesBean=" + proPertiesBean +
                    '}';
        }
    }
    /**
             自定义添加字段
             $netState":网络状态,
            "ip":"180.79.35.65",
            "userAgent":不传,
            "longitude”:不传,
            "latitude”:不传,
            ///业务上的自定义属性
            "自定义属性":”XXX",
            "自定义属性":"XXX"
     */
    public static class ProPertiesBean {
        private String netState;
        private String ip;
        private String userAgent;
        private String longitude;
        private String latitude;
        private String customInfo;

        public String getCustomInfo() {
            return customInfo == null ? "" : customInfo;
        }

        public void setCustomInfo(String customInfo) {
            this.customInfo = customInfo == null ? "" : customInfo;
        }

        public String getNetState() {
            return netState == null ? "" : netState;
        }

        public void setNetState(String netState) {
            this.netState = netState == null ? "" : netState;
        }

        public String getIp() {
            return ip == null ? "" : ip;
        }

        public void setIp(String ip) {
            this.ip = ip == null ? "" : ip;
        }

        public String getUserAgent() {
            return userAgent == null ? "" : userAgent;
        }

        public void setUserAgent(String userAgent) {
            this.userAgent = userAgent == null ? "" : userAgent;
        }

        public String getLongitude() {
            return longitude == null ? "" : longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude == null ? "" : longitude;
        }

        public String getLatitude() {
            return latitude == null ? "" : latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude == null ? "" : latitude;
        }
    }

}
