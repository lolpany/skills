
package lol.lolpany.skills.hh.vacancy;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("negotiations_url")
    @Expose
    public Object negotiationsUrl;
    @SerializedName("accept_kids")
    @Expose
    public Boolean acceptKids;
    @SerializedName("accept_handicapped")
    @Expose
    public Boolean acceptHandicapped;
    @SerializedName("experience")
    @Expose
    public Experience experience;
    @SerializedName("specializations")
    @Expose
    public List<Specialization> specializations = null;
    @SerializedName("employer")
    @Expose
    public Employer employer;
    @SerializedName("employment")
    @Expose
    public Employment employment;
    @SerializedName("alternate_url")
    @Expose
    public String alternateUrl;
    @SerializedName("contacts")
    @Expose
    public Object contacts;
    @SerializedName("schedule")
    @Expose
    public Schedule schedule;
    @SerializedName("archived")
    @Expose
    public Boolean archived;
    @SerializedName("test")
    @Expose
    public Object test;
    @SerializedName("premium")
    @Expose
    public Boolean premium;
    @SerializedName("code")
    @Expose
    public Object code;
    @SerializedName("created_at")
    @Expose
    public String createdAt;
    @SerializedName("area")
    @Expose
    public Area area;
    @SerializedName("relations")
    @Expose
    public List<Object> relations = null;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("type")
    @Expose
    public Type type;
    @SerializedName("has_test")
    @Expose
    public Boolean hasTest;
    @SerializedName("branded_description")
    @Expose
    public Object brandedDescription;
    @SerializedName("response_letter_required")
    @Expose
    public Boolean responseLetterRequired;
    @SerializedName("hidden")
    @Expose
    public Boolean hidden;
    @SerializedName("suitable_resumes_url")
    @Expose
    public Object suitableResumesUrl;
    @SerializedName("allow_messages")
    @Expose
    public Boolean allowMessages;
    @SerializedName("driver_license_types")
    @Expose
    public List<Object> driverLicenseTypes = null;
    @SerializedName("key_skills")
    @Expose
    public List<KeySkill> keySkills = null;
    @SerializedName("quick_responses_allowed")
    @Expose
    public Boolean quickResponsesAllowed;
    @SerializedName("accept_incomplete_resumes")
    @Expose
    public Boolean acceptIncompleteResumes;
    @SerializedName("salary")
    @Expose
    public Salary salary;
    @SerializedName("billing_type")
    @Expose
    public BillingType billingType;
    @SerializedName("site")
    @Expose
    public Site site;
    @SerializedName("address")
    @Expose
    public Address address;
    @SerializedName("published_at")
    @Expose
    public String publishedAt;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("department")
    @Expose
    public Object department;
    @SerializedName("response_url")
    @Expose
    public Object responseUrl;
    @SerializedName("apply_alternate_url")
    @Expose
    public String applyAlternateUrl;

}
