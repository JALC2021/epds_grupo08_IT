
package paquete.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import paquete.Autenticacion;

@XmlRootElement(name = "usersRegisteredResponse", namespace = "http://paquete/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usersRegisteredResponse", namespace = "http://paquete/")
public class UsersRegisteredResponse {

    @XmlElement(name = "return", namespace = "")
    private List<Autenticacion> _return;

    /**
     * 
     * @return
     *     returns List<Autenticacion>
     */
    public List<Autenticacion> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<Autenticacion> _return) {
        this._return = _return;
    }

}
