package vn.duytan.controller.admin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.WebConnection;
import java.io.IOException;

import org.apache.log4j.Logger;
import vn.duytan.command.CbgvCommand;
import vn.duytan.core.dto.CbgvDTO;
import vn.duytan.core.service.CbgvService;
import vn.duytan.core.service.impl.CbgvServiceImpl;
import vn.duytan.core.web.common.WebConstrant;
import vn.duytan.core.web.utils.FormUtil;

@WebServlet("/login.html")
public class LoginController extends HttpServlet {
    private final Logger log = Logger.getLogger(this.getClass());

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       RequestDispatcher rd = request.getRequestDispatcher("/views/web/login.jsp");
        rd.forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CbgvCommand command = FormUtil.populate(CbgvCommand.class, request);
        CbgvDTO pojo = command.getPojo();
        CbgvService cbgvService = new CbgvServiceImpl();
        if (cbgvService.isUseExist(pojo) != null) {
            if (cbgvService.findRoleByCbgv(pojo) != null && cbgvService.findRoleByCbgv(pojo).getRoleDTO() != null){
                if (cbgvService.findRoleByCbgv(pojo).getRoleDTO().getName().equals(WebConstrant.ROLE_ADMIN)) {
                response.sendRedirect("/quanly_web_war_exploded/admin-home.html");
                } else if (cbgvService.findRoleByCbgv(pojo).getRoleDTO().getName().equals(WebConstrant.ROLE_CBGV)) {
                    response.sendRedirect("/quanly_web_war_exploded/home.html");
                }
            }
        } else {
            request.setAttribute(WebConstrant.ALERT, WebConstrant.TYPE_ERROR);
            request.setAttribute(WebConstrant.MESSAGE_RESPONSE, "ten hoac mat khau sai");
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/login.jsp");
            rd.forward(request, response);
        }
    }
}
