package com.sjbao.design.responsibilitychain;

/**
 * 抽象处理者
 *  责任链模式的，处理方法handle里大量的业务判断（if）
 * @author songjunbao
 * @createdate 2017/9/26
 */
public abstract class Handler {

    protected Handler successor = null;

    public abstract String handleRequest(FeeRequest feeRequest);


    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
