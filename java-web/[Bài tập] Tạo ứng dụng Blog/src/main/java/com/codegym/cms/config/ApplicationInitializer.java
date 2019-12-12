package com.codegym.cms.config;

import com.codegym.cms.ApplicationConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// Lớp ApplicationInitializer là lớp cấu hình khởi tạo cho ứng dụng
// (thay thế file web.xml nếu dùng cấu hình .xml):
public class ApplicationInitializer extends
        AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ApplicationConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
