package com.study.feign.service.fallback;

import com.study.feign.service.IFeignService;
import com.study.feign.service.impl.FeignServiceImpl;
import feign.hystrix.FallbackFactory;

/**
 * @Description
 * @Auther zhangyw
 * @Date 2020/11/7 15:35
 **/
//public class FeignFallbackFactory implements FallbackFactory<IFeignService> {
//    @Override
//    public IFeignService create(Throwable throwable) {
//        FeignServiceImpl remoteFallback = new FeignServiceImpl();
//        remoteFallback.setCause(throwable);
//        return remoteFallback;
//    }
//}
