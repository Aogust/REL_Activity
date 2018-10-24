package com.rel.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MultipleDataSource extends AbstractRoutingDataSource {  
    
    public static final String datasource = "datasource";  
    public static final String datasource1 = "datasource1";  
      
    private static final ThreadLocal<String> dataSourceKey = new InheritableThreadLocal<String>();  
  
    public static void setDataSourceKey(String dataSource) {  
        dataSourceKey.set(dataSource);  
    }  
  
    @Override  
    protected Object determineCurrentLookupKey() {  
        // TODO Auto-generated method stub  
        return dataSourceKey.get();  
    }  
}
