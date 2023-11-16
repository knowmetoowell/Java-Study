package mvc.fx;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public abstract class AbstractController {
    public abstract ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response);
}
