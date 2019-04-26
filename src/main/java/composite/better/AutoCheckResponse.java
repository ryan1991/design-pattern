package composite.better;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ryan.song
 * @Date 2019/4/25
 **/
public class AutoCheckResponse {
    private Map<CheckTypeEnum, List<CheckItem>> checkReport = new LinkedHashMap<>();

    private AutoCheckResponse(){}

    public static AutoCheckResponse build(){
        return new AutoCheckResponse();
    }

    public void putByType(CheckTypeEnum type, List<CheckItem> items){
        checkReport.put(type, items);
    }

    @Override
    public String toString() {
        return checkReport.toString();
    }
}
