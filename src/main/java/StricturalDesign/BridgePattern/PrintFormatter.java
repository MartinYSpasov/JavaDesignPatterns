package StricturalDesign.BridgePattern;

import java.util.List;

/**
 * Created by Martin on 2/7/2016.
 */
public class PrintFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {

        StringBuilder builder = new StringBuilder();
        builder.append(header);
        builder.append("\n");

        for (Detail detail : details) {
            builder.append(detail.getLabel());
            builder.append(":");
            builder.append(detail.getValue());
            builder.append("\n");
        }
        return builder.toString();
    }
}
