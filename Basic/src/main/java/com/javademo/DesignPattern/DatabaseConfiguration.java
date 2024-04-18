package com.javademo.DesignPattern;

public class DatabaseConfiguration {
    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;

    private DatabaseConfiguration(){

    }

    private DatabaseConfiguration(DbBuilder b){
        // validate shifted to Builder Class getBuilderMethod
        this.databaseUrl = b.getDatabaseUrl();
        this.username = b.getUsername();
        this.password = b.getPassword();
        this.maxConnections = b.getMaxConnections();
        this.enableCache = b.isEnableCache();
        this.isReadOnly = b.isReadOnly();
    }

    public static DbBuilder getBuilder(){
        return new DbBuilder();
    }
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public boolean isEnableCache() {
        return enableCache;
    }

    public boolean isReadOnly() {
        return isReadOnly;
    }



    public static class DbBuilder {
        private String databaseUrl;
        private String username;
        private String password;
        private int maxConnections;
        private boolean enableCache;
        private boolean isReadOnly;

        public String getDatabaseUrl() {
            return databaseUrl;
        }

        public DbBuilder setDatabaseUrl(String databaseUrl) {
            this.databaseUrl = databaseUrl;
            return this;
        }

        public String getUsername() {
            return username;
        }

        public DbBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public DbBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public int getMaxConnections() {
            return maxConnections;
        }

        public DbBuilder setMaxConnections(int maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }

        public boolean isEnableCache() {
            return enableCache;
        }

        public DbBuilder setEnableCache(boolean enableCache) {
            this.enableCache = enableCache;
            return this;
        }

        public boolean isReadOnly() {
            return isReadOnly;
        }

        public DbBuilder setReadOnly(boolean readOnly) {
            isReadOnly = readOnly;
            return this;
        }


        public DatabaseConfiguration build(){
            //validation
            return new DatabaseConfiguration(this);
        }
    }

}