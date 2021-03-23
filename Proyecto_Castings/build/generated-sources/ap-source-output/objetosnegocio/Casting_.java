package objetosnegocio;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import objetosnegocio.Cliente;
import objetosnegocio.Fase;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-21T07:06:30")
@StaticMetamodel(Casting.class)
public class Casting_ { 

    public static volatile SingularAttribute<Casting, String> descripcion;
    public static volatile SingularAttribute<Casting, Cliente> cliente;
    public static volatile SingularAttribute<Casting, Date> fechaContratacion;
    public static volatile SingularAttribute<Casting, Long> id;
    public static volatile SingularAttribute<Casting, String> nombre;
    public static volatile ListAttribute<Casting, Fase> fases;
    public static volatile SingularAttribute<Casting, Float> coste;

}