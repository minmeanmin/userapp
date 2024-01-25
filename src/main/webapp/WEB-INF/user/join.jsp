<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    response.setHeader("content-Type", "text/html; charset=utf-8");

    // 1. 파싱
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String email = request.getParameter("email");

    System.out.println(username);
    System.out.println(password);
    System.out.println(email);

    // 2. 유효성검사
    if(username.length()< 3 || username.length() > 10){
        response.getWriter().println("<h1>username 글자수가 3~10 사이여야 합니다.</h1>");
        return;
    }

    // 3. DB 연결

    // 4. DAO의 insert 메소드를 호출

    // 5. 메인 페이지 그리기

    // 6. 리다이렉트
    //resp.sendRedirect("/main"); //톰켓의 메소드
    response.setStatus(302);
    response.setHeader("Location", "/main.do"); //프로토콜에 있음
    response.setHeader("clock", "12pm"); //프로토콜에 없음
%>