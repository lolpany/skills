
package lol.lolpany.skills.hh.vacancy;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Specialization {

    @SerializedName("profarea_name")
    @Expose
    public String profareaName;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("profarea_id")
    @Expose
    public String profareaId;

}
