package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 简单实现
 *
 * @author songjunbao
 * @createdate 2018/2/5
 */
public class SimpleFilterChain implements FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();

    //记录过滤器的位置
    private int index = 0;

    public FilterChain addFilter(Filter filter){
        filters.add(filter);
        return this;
    }


    public void doFilter(Request request, Response response) {
        if(index == filters.size()) return;
        Filter f = filters.get(index);
        index ++ ;
        f.doFilter(request, response, this);
    }
}
