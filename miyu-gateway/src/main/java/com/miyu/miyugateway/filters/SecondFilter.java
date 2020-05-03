package com.miyu.miyugateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

@Component
public class SecondFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {

        // 如果前面的过滤器的 filter 信息为false的话，后面的就不需要再继续执行了。
        RequestContext currentContext = RequestContext.getCurrentContext();
        return currentContext.sendZuulResponse();
    }

    @Override
    public Object run() {
        return null;
    }
}
