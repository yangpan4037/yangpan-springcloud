package site.yangpan.feign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ScheduleFeignClient
 * Created by yangpan on 2019-06-06 11:01.
 */
@FeignClient("yangpan-eureka-client")
public interface ScheduleFeignClient {

    /**
     * 方法上的注解可以使用 @GetMapping、@PostMapping
     * 方法的参数也可以使用 @RequestBody、@RequestParam
     * 总之与其他的controller写法一致
     */
    @RequestMapping("/test")
    String callEurekaClientService();
}
