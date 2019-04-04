package ejercicio3nuevo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Autor.class)
public abstract class Autor_ {

	public static volatile SingularAttribute<Autor, String> apellidos;
	public static volatile SingularAttribute<Autor, Date> fechaNacimiento;
	public static volatile SingularAttribute<Autor, Integer> indiceH;
	public static volatile SingularAttribute<Autor, Long> id;
	public static volatile SetAttribute<Autor, String> firmas;
	public static volatile SingularAttribute<Autor, String> nombre;

}

