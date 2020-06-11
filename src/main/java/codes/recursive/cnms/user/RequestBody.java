package codes.recursive.cnms.user;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class RequestBody {
        @XmlElement String product_id;
        @XmlElement String first_name;
        @XmlElement String last_name;
        @XmlElement String email_address;
        @XmlElement String phone_number;
        @XmlElement String comments;
}
