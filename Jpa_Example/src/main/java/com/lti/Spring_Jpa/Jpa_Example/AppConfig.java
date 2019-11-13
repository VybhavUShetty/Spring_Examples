package com.lti.Spring_Jpa.Jpa_Example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScans(value={@ComponentScan("com.lti.SpringEx.dao"),@ComponentScan("com.lti.SpringEx.service")})
public class AppConfig {
	@Bean
	public LocalEntityManagerFactoryBean getEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean factoryBean=new LocalEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("LOCAL_PERSISTENCE");
		return factoryBean;
		
		@Bean
		public JpaTransactionManager getJpaTransactionManager() {
			JpaTransactionManager transactionManager=new JpaTransactionManager();
			transactionManager.setEntityManagerFactory(getEntityManagerFactoryBean().getObject());
			return transactionManager;
		}
		
				
	}

}
