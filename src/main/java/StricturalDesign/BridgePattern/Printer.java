package StricturalDesign.BridgePattern;

import java.util.List;

/**
 * Created by Martin on 2/7/2016.
 */
public abstract class Printer {

    public String print(Formatter formatter){
        return formatter.format(getHeader(),getDetails());
    }

    protected abstract List<Detail> getDetails();

    protected abstract String getHeader();
}
