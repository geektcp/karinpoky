kanrinpoky
==========
kanrinpoky is a sql permission parser system.

![system architecture](https://github.com/geektcp/kanrinpoky/blob/main/doc/Architect.png)
```
kanrinpoky use plug-in architecture.
It is safely and reliable.
```

![inner architecture](https://github.com/geektcp/kanrinpoky/blob/main/doc/InnerArchitect.png)
```
kanrinpoky-service: provide all the api which use to add or del or modify policy
kanrinpoky-parser:  parse the sql(Hive sql, Mysql sql, TiDB sql, ArangoDB sql and others)

relational database: store all the policy
policy:  contain all the privilege,for example : select,update,delete table or field
```

### describe
```
Many OLAP system for example hive, 
or new database for exampl HBase, ArangoDB,TigerDB, 
they have no complete permission system.

We can not restrict the permission of any user when we use theses system.
for example use Hive sql,Graph sql,or other sql .

but if u use kanrinpoky,u can restrict the the permission of any user. 

kanrinpoky support:
Hive
Mysql
TiDB
Sqlite
ArangoDB

Thanks to our plug-in architecture, we can support any database.
In the future, kanrinpoky will support Oracle, Sqlserver, mongoDB.
```



### example
```java
public class Example {

    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER = "example";
    private static final String PASSWORD = "example";

    public static void main(String[] args) throws Exception {
        String user = "Yanni";
        String sql = "SELECT user_name, age FROM user";
        Client client = KanrinpokyClient.build();
        boolean isAuthorized = client.checkPermission(user, sql);
        if(!isAuthorized){
            throw new RuntimeException("the user have no permission");
        }
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getString("user_name")+" age："+  rs.getInt("age"));
        }
    }
}
```