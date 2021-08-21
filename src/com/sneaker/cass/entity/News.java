package com.sneaker.cass.entity;

import java.util.Date;

public class News {

    private int nid;
    private String nimg1;
    private String nimg2;
    private String ntitle;
    private String content;
    private Date ndate;
    private String naddress;
    private String ndesc;

    private void fmtdate(){

    }
    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getNimg1() {
        return nimg1;
    }

    public void setNimg1(String nimg1) {
        this.nimg1 = nimg1;
    }

    public String getNimg2() {
        return nimg2;
    }

    public void setNimg2(String nimg2) {
        this.nimg2 = nimg2;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getNdate() {
        return ndate;
    }

    public void setNdate(Date ndate) {
        this.ndate = ndate;
    }

    public String getNaddress() {
        return naddress;
    }

    public void setNaddress(String naddress) {
        this.naddress = naddress;
    }

    public String getNdesc() {
        return ndesc;
    }

    public void setNdesc(String ndesc) {
        this.ndesc = ndesc;
    }


}
