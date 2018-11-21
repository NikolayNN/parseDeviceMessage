package jdbc;

import org.postgresql.ds.PGPoolingDataSource;

public class PoolingSource {
    private static PGPoolingDataSource source;
    static {
        source = new PGPoolingDataSource();
        source.setDataSourceName("DataSourceNT");
        source.setServerName("localhost");
        source.setDatabaseName("device");
        source.setUser("postgres");
        source.setPassword("123");
        source.setMaxConnections(100);
    }

    public static PGPoolingDataSource getDatasourse(){
        return source;
    }
}
