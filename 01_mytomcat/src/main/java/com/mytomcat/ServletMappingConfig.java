package com.mytomcat;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: ServletMappingConfig
 * Description: Servlet配置
 * Date: 2020年07月30日
 *
 * @author yaoyao
 * @version 1.0.0
 * @since 1.8
 */
public class ServletMappingConfig {

    public static List<ServletMapping> servletMappingList = new ArrayList<ServletMapping>();

    static {
        servletMappingList.add(new ServletMapping("findGirl", "/girl", "com.mytomcat.FindGirlServlet"));
        servletMappingList.add(new ServletMapping("helloWorld", "/world", "com.mytomcat.HelloWorldServlet"));
    }

}
