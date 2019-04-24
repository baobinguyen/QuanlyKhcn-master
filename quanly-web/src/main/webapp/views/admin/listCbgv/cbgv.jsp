<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<html>
<head>
    <title><fmt:message key="label.guideline.listen.list" bundle="${lang}"/></title>
</head>
<body>
<div class="main-content">
    <div class="main-content-inner">
        <div class="breadcrumbs" id="breadcrumbs">
            <script type="text/javascript">
                try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
            </script>

            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="#"><fmt:message key="label.home" bundle="${lang}"/></a>
                </li>
                <li class="active"><fmt:message key="label.guideline.listen.list" bundle="${lang}"/></li>
            </ul><!-- /.breadcrumb -->
        </div>
        <div class="page-content">
            <div class="row">
                <div class="col-xs-12">
                    <div class="table-responsive">
                        <display:table id="tableList" name="items.listResult" partialList="true" size="${items.totalItems}" pagesize="${items.maxPageItems}">
                            <display:column property="hoTen" titleKey="ho ten cbgv"/>
                            <display:column property="linhVucChuyenMonSau" titleKey="lĩnh vục chuyen nganh"/>

                        </display:table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%--<script>--%>
    <%--$(document).ready(function () {--%>
        <%--$('#btnSearch').click(function () {--%>
            <%--$('#formUrl').submit();--%>
        <%--});--%>
    <%--});--%>
    <%--function warningBeforeDelete() {--%>
        <%--showAlertBeforeDelete(function () {--%>
            <%--$('#crudaction').val('redirect_delete');--%>
            <%--$('#formUrl').submit();--%>
        <%--});--%>
    <%--}--%>
<%--</script>--%>
</body>
</html>
