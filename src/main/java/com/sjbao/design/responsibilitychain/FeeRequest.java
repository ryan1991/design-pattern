package com.sjbao.design.responsibilitychain;

/**
 * 餐费申请
 *
 * @author songjunbao
 * @createdate 2017/9/26
 */
public class FeeRequest {

    private String user;
    private double fee;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
