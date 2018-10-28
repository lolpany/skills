
package lol.lolpany.skills.hh.vacancy;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metro {

    @SerializedName("lng")
    @Expose
    public Double lng;
    @SerializedName("lat")
    @Expose
    public Double lat;
    @SerializedName("line_id")
    @Expose
    public String lineId;
    @SerializedName("line_name")
    @Expose
    public String lineName;
    @SerializedName("station_name")
    @Expose
    public String stationName;
    @SerializedName("station_id")
    @Expose
    public String stationId;

}
