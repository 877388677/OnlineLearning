package com.ysc.apps.online.bean;

public class Range {

    private long from;	//起始的文件大小位置
    private long to;	//传输过来的文件大小位置
    private long size;	//文件总共大小

    public Range(long from, long to, long size) {
        this.from = from;
        this.to = to;
        this.size = size;
    }

    public long getFrom() {
        return from;
    }

    public void setFrom(long from) {
        this.from = from;
    }

    public long getTo() {
        return to;
    }

    public void setTo(long to) {
        this.to = to;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
