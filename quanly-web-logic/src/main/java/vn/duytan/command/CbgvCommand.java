package vn.duytan.command;

import vn.duytan.core.dto.CbgvDTO;
import vn.duytan.core.web.command.AbstractCommand;

public class CbgvCommand extends AbstractCommand<CbgvDTO> {
    public CbgvCommand(){
        this.pojo = new CbgvDTO();
    }
}
