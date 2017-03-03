package com.example.quanganhpham.layout_ver1;

/**
 * Created by QuangAnhPham on 3/3/2017.
 */

public class Contact {
    private String mFirstname;
    private String mName;
    private String mNote;

    public Contact(String mFirstname, String mName, String mNote) {
        this.mFirstname = mFirstname;
        this.mName = mName;
        this.mNote = mNote;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmNote() {
        return mNote;
    }

    public void setmNote(String mNote) {
        this.mNote = mNote;
    }



    public String getmFirstname() {
        return mFirstname;
    }

    public void setmFirstname(String mFirstname) {
        this.mFirstname = mFirstname;
    }
}
