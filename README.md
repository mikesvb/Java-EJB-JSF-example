# Java-EJB-JSF-example

Тестовый проект по технологиям EJB JSF с использованием базы данных postgreSQL

Сервер wildfly-10.1.0.Final 

Драйвер для PostgreSQL поместить в C:\wildfly-10.1.0.Final\standalone\deployments

использовал postgresql-42.2.12.jar 

там же в папку example-ds.xml с содержимым

```
<?xml version="1.0"?>
<datasources schemaLocation="https://docs.jboss.org/ironjacamar/schema/datasources_1_1.xsd">
    <datasource jndi-name="java:jboss/exampleDS" pool-name="PostgesSQLPool">
        <connection-url>jdbc:postgresql://localhost:5432/example</connection-url>
        <driver>postgresql-42.2.12.jar</driver>
        <driver-class>org.postgresql.Driver</driver-class>
        <pool>
            <max-pool-size>30</max-pool-size>
        </pool>
        <security>
            <user-name>postgres</user-name>
            <password>password</password>
        </security>
        <validation>
            <check-valid-connection-sql>select 1</check-valid-connection-sql>
        </validation>
    </datasource>
</datasources>
```
