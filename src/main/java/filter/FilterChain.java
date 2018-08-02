package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 链
 *
 * @author songjunbao
 * @createdate 2018/2/5
 */
public interface FilterChain {

    FilterChain addFilter(Filter filter);

    void doFilter(Request request, Response response);


}
