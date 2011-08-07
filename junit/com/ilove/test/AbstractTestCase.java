/**
 * <P>所有junit test case的基类</P>
 */
package com.ilove.test;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

/**
 * 所有junit test case的基类
 * @author wangxin
 *
 */
public abstract class AbstractTestCase extends AbstractDependencyInjectionSpringContextTests
{
	/*********************
	 * <P>创建application context</P>
	 * @param locations
	 * @return
	 * @see org.springframework.test.AbstractSingleSpringContextTests#loadContextLocations(java.lang.String[])
	 */
	protected ConfigurableApplicationContext loadContextLocations(String[] locations)
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext()
	    {
	      protected void prepareBeanFactory(ConfigurableListableBeanFactory beanFactory)
	      {
		         super.prepareBeanFactory(beanFactory);
		         ((DefaultListableBeanFactory)beanFactory).setAllowRawInjectionDespiteWrapping(true);
	      }
	    };
	    ctx.setConfigLocations(locations);
	    ctx.refresh();
	    return ctx;
	}
	
	/***********************
	 * <P>读取xml文件配置名称</P>
	 * @return
	 * @see org.springframework.test.AbstractSingleSpringContextTests#getConfigLocations()
	 */
	protected String[] getConfigLocations()
	{
		String[] config = new String[]{
				"applicationContext-ilovecore-dao.xml"
	         	};
		
		return config;
	}
	
	/******************
	 * <P>将对象转化成string, 供子类调用</P>
	 * @param o
	 * @return
	 */
	protected String convertObjectToString(Object o){
		if(o == null){
			return "[NULL Object]";
		}
		return ReflectionToStringBuilder.toString(o);
	}
}
