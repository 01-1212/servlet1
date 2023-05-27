package hello.servlet.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name="requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> parameterNames = req.getParameterNames();

        System.out.println("[전체 파라미터 조회] - START");
        
        req.getParameterNames().asIterator()
                .forEachRemaining
                        (parameterName -> System.out.println(parameterName + " = " + req.getParameter(parameterName)));

        System.out.println("[전체 파라미터 조회] - END");
        System.out.println();

        System.out.println("[단일 파리미터 조회]");
        String username = req.getParameter("username");
        String age = req.getParameter("age");

        System.out.println("username = " + username);
        System.out.println("age = " + age);
        System.out.println();

        System.out.println("이름이 같은 복수 파라미터 조회");
        String[] usernames=req.getParameterValues("username");
        for (String name : usernames) {
            System.out.println("username = " + name);
        }
    }
}
