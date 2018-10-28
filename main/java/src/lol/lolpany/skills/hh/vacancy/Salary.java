
package lol.lolpany.skills.hh.vacancy;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Salary {

    @SerializedName("currency")
    @Expose
    public String currency;
    @SerializedName("from")
    @Expose
    public Integer from;
    @SerializedName("gross")
    @Expose
    public Boolean gross;
    @SerializedName("to")
    @Expose
    public Integer to;

}
