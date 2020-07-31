package com.mytomcat;

import java.io.IOException;
import java.io.OutputStream;

/**
 * ClassName: MyResponse
 * Description: 封装响应对象
 * Date: 2020年07月30日
 *
 * @author yaoyao
 * @version 1.0.0
 * @since 1.8
 */
public class MyResponse {

    private OutputStream outputStream;

    public MyResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void write(String content) throws IOException {
        StringBuffer httpResponse = new StringBuffer();
        httpResponse.append("HTTP/1.1 200 OK\n")
                .append("Content-Type: text/html\n")
                .append("\r\n")
                .append("<html><body>")
                .append(content).append("</body></html>");
        outputStream.write(httpResponse.toString().getBytes());
        outputStream.close();
    }

}
