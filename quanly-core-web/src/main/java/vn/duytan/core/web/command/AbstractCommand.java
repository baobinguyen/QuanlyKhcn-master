package vn.duytan.core.web.command;

import java.util.List;

public class AbstractCommand<T> {
    private int maxPageItems =20;
    private int firstItems = 0;
    private int totalItems = 0;
    private String sortExpression;
    private String sortDirection;
    private String[] checkList;
    private List<T> listResult;
    private String crudaction;
    private String tableID = "tableList";
    protected T pojo;
    private String massageResponse;
    private int page =1;

    public String getCrudaction() {
        return crudaction;
    }

    public void setCrudaction(String crudaction) {
        this.crudaction = crudaction;
    }

    public T getPojo() {
        return pojo;
    }

    public void setPojo(T pojo) {
        this.pojo = pojo;
    }

    public int getMaxPageItems() {
        return maxPageItems;
    }

    public void setMaxPageItems(int maxPageItems) {
        this.maxPageItems = maxPageItems;
    }

    public int getFirstItems() {
        return firstItems;
    }

    public void setFirstItems(int firstItems) {
        this.firstItems = firstItems;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public String getSortExpression() {
        return sortExpression;
    }

    public void setSortExpression(String sortExpression) {
        this.sortExpression = sortExpression;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

    public String[] getCheckList() {
        return checkList;
    }

    public void setCheckList(String[] checkList) {
        this.checkList = checkList;
    }

    public List<T> getListResult() {
        return listResult;
    }

    public void setListResult(List<T> listResult) {
        this.listResult = listResult;
    }

    public String getTableID() {
        return tableID;
    }

    public void setTableID(String tableID) {
        this.tableID = tableID;
    }

    public String getMassageResponse() {
        return massageResponse;
    }

    public void setMassageResponse(String massageResponse) {
        this.massageResponse = massageResponse;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
