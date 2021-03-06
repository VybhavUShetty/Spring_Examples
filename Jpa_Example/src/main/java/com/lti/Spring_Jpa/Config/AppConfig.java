package com.lti.Spring_Jpa.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScans(value={@ComponentScan("com.lti.Spring_Jpa.Jpa_Dao"),@ComponentScan("com.lti.Spring_Jpa.service")})
public class AppConfig {
	@Bean
	public LocalEntityManagerFactoryBean geEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean factoryBean=new LocalEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("persistence");
		return factoryBean;
	}
		
		@Bean
		public JpaTransactionManager geJpaTransactionManager() {
			JpaTransactionManager transactionManager=new JpaTransactionManager();
			transactionManager.setEntityManagerFactory(geEntityManagerFactoryBean().getObject());
			return transactionManager;
		}
		
				
	}


