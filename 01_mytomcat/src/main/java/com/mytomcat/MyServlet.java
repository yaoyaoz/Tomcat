package com.mytomcat;

/**
 * ClassName: MyServlet
 * Description: Servlet请求处理类
 * Date: 2020年07月30日
 *
 * @author yaoyao
 * @version 1.0.0
 * @since 1.8
 */
public abstract class MyServlet {

    public abstract void doGet(MyRequest myRequest, MyResponse myResponse);

    public abstract void doPost(MyRequest myRequest, MyResponse myResponse);

    public void service(MyRequest myRequest, MyResponse myResponse) {
        if (myRequest.getMethod().equalsIgnoreCase("POST")) {
            doPost(myRequest, myResponse);
        } else if (myRequest.getMethod().equalsIgnoreCase("GET")) {
            doGet(myRequest, myResponse);
        }
    }

}
