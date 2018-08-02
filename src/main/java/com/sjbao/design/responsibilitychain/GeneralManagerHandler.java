package com.sjbao.design.responsibilitychain;

/**
 * 部门经理审核
 * @author songjunbao
 * @createdate 2017/9/26
 */
public class GeneralManagerHandler extends Handler{

    public String handleRequest(FeeRequest feeRequest) {
        String result = "";
        if(feeRequest.getFee() >= 1000){

            if("zs".equals(feeRequest.getUser())){
                result = "成功：总经理同意【" + feeRequest.getUser() + "】的聚餐费用，金额为" + feeRequest.getFee() + "元";
            } else {
                //其他人一律不同意
                result = "失败：总经理不同意【" + feeRequest.getUser() + "】的聚餐费用，金额为" + feeRequest.getFee() + "元";

            }
        } else {
            
            if(getSuccessor()!=null){
                return getSuccessor().handleRequest(feeRequest);
            }
        }


        return result;
    }
}
