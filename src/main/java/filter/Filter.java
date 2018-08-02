package filter;

/**
 * 过滤器
 */
public interface Filter {

    void doFilter(Request request, Response response,FilterChain filterChain);
}
