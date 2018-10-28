
package lol.lolpany.skills.hh.vacancies;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Snippet {

    @SerializedName("requirement")
    @Expose
    public String requirement;
    @SerializedName("responsibility")
    @Expose
    public Object responsibility;

}
