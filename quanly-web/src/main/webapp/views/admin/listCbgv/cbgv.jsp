<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<c:url var="requestUrl" value="/cbgv.html"/>
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
                <li class="active"><fmt:message key="label.guideline.listen.list" bundle="${lang}"/> Quan ly CBGV</li>
            </ul><!-- /.breadcrumb -->
        </div>
        <div class="page-content">
            <div class="row">
                <div class="col-xs-12">
                    <div class="table-responsive">
                        <fmt:bundle basename="ApplicationResources">
                        <display:table id="tableList" name="items.listResult" partialList="true" size="${items.totalItems}"
                                       pagesize="${items.maxPageItems}" sort="external" requestURI="${requestUrl}"
                                       class="table table-fcv-ace table-striped table-bordered table-hover dataTable no-footer"
                                       style="margin: 3em 0 1.5em;" >

                            <display:column property="hoTen" title="ho ten cbgv" sortable="true" sortName="hoTen"/>
                            <display:column property="ngaySinh" title="ngay sinh cbgv" sortable="true" sortName="ngaySinh"/>
                            <display:column property="gioiTinh" title="gioi tinh cbgv" sortable="true" sortName="gioiTinh"/>
                            <display:column property="hocHam" title="học hàm cbgv" sortable="true" sortName="hocHam"/>
                            <display:column property="hocVi" title="hoc vi cbgv" sortable="true" sortName="hocVi"/>
                            <display:column property="namDuocPhong" title="nam duoc phong cbgv" sortable="true" sortName="namDuocPhong"/>
                            <display:column property="namDatHocVi" title="NDHV cbgv" sortable="true" sortName="namDatHocVi"/>
                            <display:column property="chucdanhnc" title="chuc danh" sortable="true" sortName="chucdanhnc"/>
                            <display:column property="dienThoaiNr" title="dien thoại NR" sortable="true" sortName="dienThoaiNr"/>
                            <display:column property="cq" title="qc cbgv" sortable="true" sortName="cq"/>
                            <display:column property="mobile" title="mobile cbgv" sortable="true" sortName="mobile"/>
                            <display:column property="email" title="email cbgv" sortable="true" sortName="email"/>
                            <display:column property="linhVucChuyenMonSau" title="lĩnh vục chuyen nganh" sortable="true" sortName="linhVucChuyenMonSau"/>
                        </display:table>
                        </fmt:bundle>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    $(document).ready(function () {
        $('#btnSearch').click(function () {
            $('#formUrl').submit();
        });
    });
    function warningBeforeDelete() {
        showAlertBeforeDelete(function () {
            $('#crudaction').val('redirect_delete');
            $('#formUrl').submit();
        });
    }
</script>
</body>
</html>
