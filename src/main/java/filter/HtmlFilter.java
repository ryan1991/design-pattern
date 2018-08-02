package filter;

/**
 * 过滤html
 *
 * @author songjunbao
 * @createdate 2018/2/5
 */
public class HtmlFilter implements Filter {
    public void doFilter(Request request, Response response, FilterChain chain) {
        //过滤req.reqStr的HTML标记
        request.setReqStr(request.getReqStr().replace("<","&lt").replace(">","&gt"));
        request.setReqStr(request.getReqStr()+"--HtmlFilter--");
        response.setRespStr(response.getRespStr()+"--HtmlFilter--");
        chain.doFilter(request, response);



    }
}
