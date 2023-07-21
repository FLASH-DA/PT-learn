package com.bjpowernode.pojo;

import com.bjpowernode.model.LoanInfo;

import java.io.Serializable;
import java.util.List;

/**
 * @author csd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class MultProduct implements Serializable {
    private List<LoanInfo> xinShouBao;
    private List<LoanInfo> youXun;
    private List<LoanInfo> sanBiao;

    public List<LoanInfo> getXinShouBao() {
        return xinShouBao;
    }

    public void setXinShouBao(List<LoanInfo> xinShouBao) {
        this.xinShouBao = xinShouBao;
    }

    public List<LoanInfo> getYouXun() {
        return youXun;
    }

    public void setYouXun(List<LoanInfo> youXun) {
        this.youXun = youXun;
    }

    public List<LoanInfo> getSanBiao() {
        return sanBiao;
    }

    public void setSanBiao(List<LoanInfo> sanBiao) {
        this.sanBiao = sanBiao;
    }
}
