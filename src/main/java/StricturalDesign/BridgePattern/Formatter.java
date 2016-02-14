package StricturalDesign.BridgePattern;

import java.util.List;

/**
 * Created by Martin on 2/7/2016.
 */
public interface Formatter {

    String format(String header, List<Detail> details);
}
