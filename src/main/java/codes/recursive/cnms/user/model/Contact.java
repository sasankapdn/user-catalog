package codes.recursive.cnms.user.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Contact {
    @JsonProperty("product_id")
    @ManyToOne
    public String product_id;
    @JsonProperty("first_name")
    @ManyToOne
    public String first_name;
    @JsonProperty("last_name")
    @ManyToOne
    public String last_name;
    @JsonProperty("email_address")
    @ManyToOne
    public String email_address;
    @JsonProperty("phone_number")
    @ManyToOne
    public String phone_number;
    @JsonProperty("comments")
    @ManyToOne
    public String comments;

}
