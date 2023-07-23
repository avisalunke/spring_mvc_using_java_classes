package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

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
