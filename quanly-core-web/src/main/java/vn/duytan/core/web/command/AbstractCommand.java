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
}
