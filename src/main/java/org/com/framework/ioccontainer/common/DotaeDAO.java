package org.com.framework.ioccontainer.common;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DotaeDAO {

    private final Map<Integer, DotaeDTO> dotaeMap;

    public DotaeDAO() {
        dotaeMap = new HashMap<>();

        dotaeMap.put(1, new DotaeDTO(26, "학생", "최다빈"));
        dotaeMap.put(2, new DotaeDTO(28, "사장", "조재현"));
    }

    public DotaeDTO selectDotae(int age) {
        return dotaeMap.get(age);
    }

    public boolean insertDotae(DotaeDTO newdotae){
        int before = dotaeMap.size();

        dotaeMap.put(newdotae.getAge(), newdotae);

        int after = dotaeMap.size();

        return after > before ? true : false;
    }
}
