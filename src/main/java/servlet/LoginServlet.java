package servlet;


import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {


    @Override
    public void init() throws ServletException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(req.getParameter("lname"));
        resp.getWriter().println(req.getParameter("lpwd"));
        resp.setHeader("context-type","application/json");
        resp.getWriter().println("{name:'LEE'}");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("context-type","application/json");
        System.out.println(req.getServletPath());
        User user = new User();
        user.name = req.getParameter("lname");
        user.pwd = req.getParameter("lpwd");
        resp.getWriter().println(JSON.toJSONString(user));
    }

    static class User{
        private String name;
        private String pwd;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPwd() {
            return pwd;
        }

        public void setPwd(String pwd) {
            this.pwd = pwd;
        }
    }
}
