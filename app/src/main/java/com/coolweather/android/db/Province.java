package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 周璇 on 2017/5/18.
 */

public class Province extends DataSupport {
    private int id;
    private  String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
