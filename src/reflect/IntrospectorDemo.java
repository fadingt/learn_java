package reflect;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

import learn_java.Person;

public class IntrospectorDemo {
	public static void main(String[] args) throws IntrospectionException {
		BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
		PropertyDescriptor[] pd = beanInfo.getPropertyDescriptors();
		for (int i = 0; i < pd.length; i++) {
			System.out.println(pd[i].getName());
		}
	}
}
