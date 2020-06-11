package codes.recursive.cnms.user.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.vladmihalcea.hibernate.type.json.JsonBlobType;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import com.vladmihalcea.hibernate.type.json.internal.JacksonUtil;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;
@Entity
@Table(name = "REQUESTS")
@TypeDef(
        name = "jsonb",
        typeClass = JsonBlobType.class)
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "guid")
    @Column(name = "id", unique = true, nullable = false)
    private String id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    @Column(name = "created_on")
    private Date createdOn = new Date();

   //@JsonProperty("Contact")

    @Type(type = "jsonb")
    private Contact request;


    public Request() {

    }

    public Request(String id, Contact request) {
        this.setId(id);
        this.setRequest(request);
        this.setCreatedOn(createdOn);
    }
    public Request(Contact request) {
        this.setRequest(request);
        this.setCreatedOn(createdOn);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Contact getRequest() {
        return request;
    }

    public Request setRequest(Contact request) {
        this.request = request;
        return this;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
