import java.util.Optional;

public class Params {
    private final String param;
    private String value;
    private Integer iValue;
    private Boolean bValue;

    public Params(String param, String value) {
        this.param = param;
        this.value = value;
    }

    public Params(String param, int iValue) {
        this.param = param;
        this.iValue = iValue;
    }

    public Params(String param, Boolean bValue) {
        this.param = param;
        this.bValue = bValue;
    }

    public String toString() {
        StringBuilder strBuild = new StringBuilder();
        strBuild.append(param).append(" ");
        if (value != null)
            strBuild.append(value);
        else if(iValue != null)
            strBuild.append(iValue);
        else if(bValue != null)
            strBuild.append(bValue);

        return  strBuild.toString();
    }

}
