package com.example.springbootprometheus.config;

import io.prometheus.client.Counter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @version $Id: PrometheusMetricsInterceptor, v0.1
 * @company 杭州信牛网络科技有限公司
 * @date 2018年12月19日 11:43 胡晓磊 Exp $
 */
public class PrometheusMetricsInterceptor extends HandlerInterceptorAdapter {
    // 这里的命名不能出现 - ，比如 sbp_demo_requests_total 符合规范，但是 sbp-demo-requests-total 不符合规范，prometheus 会报错，启动不了。
    private static final Counter requestCounter = Counter.build().name("sbp_demo_requests_total")
            .labelNames("path", "method", "code")
            .help("Total requests.").register();

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        String requestURI = request.getRequestURI();
        String method = request.getMethod();
        int status = response.getStatus();

        requestCounter.labels(requestURI, method, String.valueOf(status)).inc();

        super.afterCompletion(request, response, handler, ex);
    }
}
