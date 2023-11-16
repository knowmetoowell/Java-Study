package util;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebFilter("/*")
public class CharacterEncodingFilter extends HttpFilter implements Filter {
    public CharacterEncodingFilter() {
        System.out.println("CharacterEncodingFilter.CharacterEncodingFilter 생성자 수행");
    }

    @Override
    public void destroy() {
        System.out.println("CharacterEncodingFilter.destroy 소멸자 수행");
    }
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest hreq = (HttpServletRequest) req;
        hreq.setCharacterEncoding("UTF-8");
        chain.doFilter(hreq,res);
    }

    @Override
    public void init() throws ServletException {
        System.out.println("CharacterEncodingFilter.init 수행");
    }


//
//    @Override
//    public boolean isLoggable(LogRecord record) {
//        return false;
//    }
}
