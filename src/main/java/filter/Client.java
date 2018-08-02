package filter;

/**
 * @author songjunbao
 * @createdate 2018/2/5
 */
public class Client {

    public static void main(String[] args) {
        String msg ="被就业了：），敏感信息，<script>";

        Request request = new Request();
        request.setReqStr(msg);

        Response response = new Response();
        response.setRespStr("response");

        SimpleFilterChain chain = new SimpleFilterChain();

        chain.addFilter(new HtmlFilter()).addFilter(new SensitiveFilter());
        chain.doFilter(request, response);

        System.out.println("处理过的request字符串：" + request.getReqStr());
        System.out.println("返回的response字符串：" + response.getRespStr());



    }

}
