package com.mytomcat;

import java.io.IOException;

/**
 * ClassName: HelloWorldServlet
 * Description: Servlet实现类
 * Date: 2020年07月30日
 *
 * @author yaoyao
 * @version 1.0.0
 * @since 1.8
 */
public class HelloWorldServlet extends MyServlet {

    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("get world...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("post world...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
