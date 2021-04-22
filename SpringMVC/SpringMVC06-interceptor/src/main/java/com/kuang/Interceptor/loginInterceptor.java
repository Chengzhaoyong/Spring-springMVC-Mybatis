package com.kuang.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
  if(request.getRequestURI().contains("login"))
      return true;
  if(request.getSession().getAttribute("user")!=null)
            return true;

  if (request.getRequestURI().contains("gologin"))
      return true;
  request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }
}
