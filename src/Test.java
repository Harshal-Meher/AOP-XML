import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

import pack.Demo;  

public class Test 
{

	public static void main(String[] args) throws Exception {
	
		Resource r=new ClassPathResource("pack/applicationContaxt.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		
		Demo d=factory.getBean("proxy",Demo.class);
		d.Fun();
        d.validate(18);
	}

}
