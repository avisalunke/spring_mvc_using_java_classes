# spring_mvc_using_java_classes
Spring mvc using java classes
1: you have to create mavan project for this 
2: while creating this project you need to select web app archetype
3:then project is created 
4: update pom.xml :
1: add two dependancies 
1 : spring web mvc : org.springframework spring-webmvc 6.0.9 
2 : servlet api : jakarta.servlet jakarta.servlet-api 6.0.0 provided
2: add plugin in boild : org.apache.maven.plugins maven-war-plugin 3.3.2
then create one class  where we create bean and component scan 
                                                                    @Configuration
                                                                    @ComponentScan("com.Controllers")
                                                                    public class AppConfig {
                                                                    
                                                                    	@Bean
                                                                    	public InternalResourceViewResolver getViewResolver() {
                                                                    		InternalResourceViewResolver internalViewResolver=new InternalResourceViewResolver();
                                                                    		internalViewResolver.setPrefix("/WEB-INF/jsp/");
                                                                    		internalViewResolver.setSuffix(".jsp");
                                                                    		return internalViewResolver;
                                                                    	}
                                                                    }
then create one class to extends AbstractAnnotationConfigDispatcherServletInitializer
then override its all methods .
          public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class [] configClass= {AppConfig.class};
		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
        return new String[] { "/" };
	}

}


