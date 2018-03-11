package com.rentals.core;

import com.rentals.core.beans.Tenant;
import com.rentals.core.dao.TenantDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Tenant t=new Tenant();
        t.setAadhaarno("12534516243");
        t.setFirst_name("Abhilash");
        t.setLast_name("Rajakoti");
        TenantDao dao=new TenantDao();
        System.out.println(dao.createTenant(t));
    }
}
