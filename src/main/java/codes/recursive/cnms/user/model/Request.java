package codes.recursive.cnms.user.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
@Entity
@Table(name = "REQUESTS")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "guid")
    @Column(name = "id", unique = true, nullable = false)
    private String id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    @Column(name = "created_on")
    private Date createdOn = new Date();

    @JsonProperty("request")
    @Column(name = "request")
    @NotNull
    @Size(max=10000)
    private String request;

    public Request() {

    }

    public Request(String id, String request) {
        this.setId(id);
        this.setRequest(request);
        this.setCreatedOn(createdOn);
    }
    public Request(String request) {
        this.setRequest(request);
        this.setCreatedOn(createdOn);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @JsonProperty("request")
    public String getRequest() { return request;}
    @JsonProperty("request")
    public void setRequest(String request) { this.request = request; }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
