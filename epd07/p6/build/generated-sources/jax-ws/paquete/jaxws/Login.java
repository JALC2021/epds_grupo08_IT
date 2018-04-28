
package paquete.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "login", namespace = "http://paquete/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "login", namespace = "http://paquete/", propOrder = {
    "usu",
    "pass"
})
public class Login {

    @XmlElement(name = "usu", namespace = "")
    private String usu;
    @XmlElement(name = "pass", namespace = "")
    private String pass;

    /**
     * 
     * @return
     *     returns String
     */
    public String getUsu() {
        return this.usu;
    }

    /**
     * 
     * @param usu
     *     the value for the usu property
     */
    public void setUsu(String usu) {
        this.usu = usu;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getPass() {
        return this.pass;
    }

    /**
     * 
     * @param pass
     *     the value for the pass property
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

}
