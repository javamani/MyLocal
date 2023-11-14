package com.mkyong.common;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import com.mkyong.common.pojo.AddBuyerDetailsType;
import com.mkyong.common.pojo.BuyerSupplierDetailsType;

public class BeanWrapperNestedBean {

	public static void main (String[] args) {
		/*
        BeanWrapper beanWrapperEmployee = new BeanWrapperImpl(new Employee());
        beanWrapperEmployee.setPropertyValue("name", "Joe");
        BeanWrapper beanWrapperDept = new BeanWrapperImpl(new Department());
        beanWrapperDept.setPropertyValue("deptCode", 1101);
        beanWrapperDept.setPropertyValue("deptName", "IT");
        System.out.println(beanWrapperDept.getWrappedInstance());
        beanWrapperEmployee.setPropertyValue("department", beanWrapperDept.getWrappedInstance());
        System.out.println(beanWrapperEmployee.getWrappedInstance());
        */
		
		/*
		 * BeanWrapper bw = new BeanWrapperImpl(new Employee());
		 * bw.setPropertyValue("name", "Joe"); bw.setPropertyValue("department", new
		 * Department()); bw.setPropertyValue("department.deptCode", 1001);
		 * bw.setPropertyValue("department.deptName", "IT");
		 * System.out.println(bw.getWrappedInstance());
		 */
		
		BeanWrapper bw = new BeanWrapperImpl(new AddBuyerDetailsType());
		bw.setPropertyValue("memberid" , "123456");
		bw.setPropertyValue("supplierDetails" , new BuyerSupplierDetailsType());
		 for (PropertyDescriptor pd : bw.getPropertyDescriptors()) {
	            System.out.println(pd.getDisplayName() + "  " + pd.getPropertyType());
	        }
		 
		bw.setPropertyValue("supplierDetails.firstName","SupplierFirstName");
		System.out.println("Samples");
		System.out.println(bw.getWrappedInstance());
    }

}
