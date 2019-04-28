package com.model.entites;

public class Classes {
    private Integer cid;
    private String cname;

    @Override
    public String toString(){
        return "Classes{cid=" + cid +
                ", cname=" + cname +
                "}";
    }

    public Classes(){

    }

    public Classes(Integer cid, String cname){
        this.cid = cid;
        this.cname = cname;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
