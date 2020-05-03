package com.miyu.miyugateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
@RefreshScope
public class PreFilter extends ZuulFilter {

    @Value("${token}")
    private boolean token;

    @Override
    public String filterType() {
        // 过滤器类型
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        // 同类型之间，数值越大，优先级越低
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        // 过滤器是否起作用
        return true;
    }

    @Override
    public Object run() {
        // 具体的业务逻辑。
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String token = request.getHeader("token");

        if (token == null || token.length() == 0) {
            // 给后面的人发信息，不需要在向后走了
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(401);
            currentContext.setResponseBody("{msg: 401, access without permission}");
        }

        return null;
    }
}
