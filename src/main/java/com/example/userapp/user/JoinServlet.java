package com.example.userapp.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/join")
public class JoinServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("content-Type", "text/html; charset=utf-8");
//        username=ssar&password=1234&email=ssar@nate.com

//        BufferedReader br = req.getReader(); //http body값에 접근
//
//        String requestBody = "";
//
//        while(true){
//            String line = br.readLine();
//
//            if(line==null) break;
//
//            requestBody = requestBody + line;
//        }
//        System.out.println(requestBody);

        // 1. 파싱
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");

        System.out.println(username);
        System.out.println(password);
        System.out.println(email);

        // 2. 유효성검사
        if(username.length()< 3 || username.length() > 10){
            resp.getWriter().println("<h1>username 글자수가 3~10 사이여야 합니다.</h1>");
        }

        // 3. DB 연결

        // 4. DAO의 insert 메소드를 호출

        // 5. 메인 페이지 그리기

        // 6. 리다이렉트
        //resp.sendRedirect("/main"); //톰켓의 메소드
        resp.setStatus(302);
        resp.setHeader("Location", "/main"); //프로토콜에 있음
        resp.setHeader("clock", "12pm"); //프로토콜에 없음
    }
}
