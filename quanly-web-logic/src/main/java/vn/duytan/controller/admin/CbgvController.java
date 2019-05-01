package vn.duytan.controller.admin;

import vn.duytan.command.CbgvCommand;
import vn.duytan.core.dto.CbgvDTO;
import vn.duytan.core.service.CbgvService;
import vn.duytan.core.service.impl.CbgvServiceImpl;
import vn.duytan.core.web.common.WebConstrant;
import vn.duytan.core.web.utils.RequestUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/cbgv.html")
public class CbgvController extends HttpServlet {
    private CbgvService cbgvService = new CbgvServiceImpl();
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CbgvCommand command = new CbgvCommand();
//        List<CbgvDTO> cbgvDTOS = new ArrayList<CbgvDTO>();
//        CbgvDTO dto = new CbgvDTO();
//        dto.setHoTen("nhan vien 1");
//        dto.setLinhVucChuyenMonSau("chuyen nganh cntt");
//        cbgvDTOS.add(dto);
//        CbgvDTO dto1 = new CbgvDTO();
//        dto1.setHoTen("nhan vien 1");
//        dto1.setLinhVucChuyenMonSau("chuyen nganh cntt");
//        cbgvDTOS.add(dto1);
//        command.setListResult(cbgvDTOS);
//        command.setMaxPageItems(1);
//        command.setTotalItems(cbgvDTOS.size());
//        request.setAttribute(WebConstrant.LIST_ITEMS, command);
        command.setMaxPageItems(4);
        RequestUtil.initSearchBean(request,command);
        Object[] object = cbgvService.findCbgvByProperties(null,null, command.getSortExpression(), command.getSortDirection(),command.getFirstItems() ,command.getMaxPageItems());
        command.setListResult((List<CbgvDTO>) object[1]);
        command.setTotalItems(Integer.parseInt(object[0].toString()));
        request.setAttribute(WebConstrant.LIST_ITEMS, command);
        RequestDispatcher rd = request.getRequestDispatcher("/views/admin/listCbgv/cbgv.jsp");
        rd.forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
