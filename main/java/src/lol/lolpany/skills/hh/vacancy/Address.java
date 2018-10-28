
package lol.lolpany.skills.hh.vacancy;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("street")
    @Expose
    public String street;
    @SerializedName("building")
    @Expose
    public String building;
    @SerializedName("metro")
    @Expose
    public Metro metro;
    @SerializedName("lng")
    @Expose
    public Double lng;
    @SerializedName("description")
    @Expose
    public Object description;
    @SerializedName("raw")
    @Expose
    public Object raw;
    @SerializedName("metro_stations")
    @Expose
    public List<MetroStation> metroStations = null;
    @SerializedName("lat")
    @Expose
    public Double lat;
    @SerializedName("city")
    @Expose
    public String city;

}
