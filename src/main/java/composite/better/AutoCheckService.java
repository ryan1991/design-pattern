package composite.better;

/**
 * 合同自动审核
 **/
public interface AutoCheckService {

    void contractCheck(AutoCheckRequest request, AutoCheckResponse response);

}
