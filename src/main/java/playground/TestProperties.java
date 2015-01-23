package playground;

import java.util.Enumeration;
import java.util.Properties;

public class TestProperties {
	public static void main(String args[]){
		Properties props = System.getProperties();
		Enumeration<?> propNames =  props.propertyNames();

		while (propNames.hasMoreElements() ){
			String propName = (String) propNames.nextElement();
			String property = props.getProperty(propName);
			System.out.println("property '" + propName + "' is '" + property + "'");
		}
	}

}
