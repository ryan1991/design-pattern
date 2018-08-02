package com.sjbao.design.responsibilitychain;

/**
 * @author songjunbao
 * @createdate 2017/9/26
 */
public class Client {


    public static void main(String[] args) {
        Handler h1 = new GeneralManagerHandler();
        Handler h2 = new DeptManagerHandler();
        Handler h3 = new ProjectManagerHandler();

        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        FeeRequest request = new FeeRequest();
        request.setFee(400);
        request.setUser("zs");

        String result = h3.handleRequest(request);
        System.out.println(result);



    }

}
