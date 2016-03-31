package com.taxi.config;

import com.google.inject.name.Names;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.guice.MyBatisModule;
import org.mybatis.guice.datasource.builtin.PooledDataSourceProvider;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import java.util.Properties;


public class DatabaseModule extends MyBatisModule {

    private static Properties myBatisProperties = new Properties();

    static {
        myBatisProperties.setProperty("JDBC.schema", "taxi");
        myBatisProperties.setProperty("JDBC.username", "root");
        myBatisProperties.setProperty("JDBC.password", "root");
    }


    @Override
    protected void initialize() {
        environmentId("development");
        install(JdbcHelper.MySQL);
        Names.bindProperties(binder(), myBatisProperties);
        bindDataSourceProviderType(PooledDataSourceProvider.class);
        bindTransactionFactoryType(JdbcTransactionFactory.class);
        addMapperClasses("com.taxi.repository");
    }

}
