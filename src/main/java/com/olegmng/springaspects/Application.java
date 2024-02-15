package com.olegmng.springaspects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

	@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass = true)
	public class Application {

		// OOP (Object oriented programing)
		// AOP (Aspect oriented programming)

		// CGLib extends MyServiceBean
		// DynamicProxy implements ...

		// @Transactional

		public static void main(String[] args) {
//		System.out.println(RuntimeException.class.isAssignableFrom(IllegalArgumentException.class));
//		System.out.println(IllegalArgumentException.class.isAssignableFrom(RuntimeException.class));


			ConfigurableApplicationContext context = SpringApplication.run(com.olegmng.springaspects.Application.class, args);
//		MyServiceBean myServiceBean = context.getBean(MyServiceBean.class);
//
//		myServiceBean.method1("argument");

			// object = myServiceBean
			// proxy[object]

			// method1 -> proxy[object -> method2]


			// object = Bean MyServiceBean
			// Proxy[object = MyServiceBean] != MyServiceBean == MyServiceInterface

		}

	}