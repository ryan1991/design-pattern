package filter;

/**
 * 敏感字过滤
 *
 * @author songjunbao
 * @createdate 2018/2/5
 */
public class SensitiveFilter implements Filter {

    public void doFilter(Request request, Response response, FilterChain filterChain) {

        request.setReqStr(request.getReqStr().replace("敏感","[敏感]"));
        request.setReqStr(request.getReqStr() + "===SensitiveFilter");
        response.setRespStr(response.getRespStr()+"===SensitiveFilter");
        filterChain.doFilter(request, response);

    }
}
