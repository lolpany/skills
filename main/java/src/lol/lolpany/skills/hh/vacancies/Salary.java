
package lol.lolpany.skills.hh.vacancies;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Salary {

    @SerializedName("to")
    @Expose
    public Integer to;
    @SerializedName("gross")
    @Expose
    public Boolean gross;
    @SerializedName("from")
    @Expose
    public Integer from;
    @SerializedName("currency")
    @Expose
    public String currency;

}
