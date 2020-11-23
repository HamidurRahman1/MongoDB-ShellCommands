# MongoDBWithJava

MongoDB Commands using Shell on MacOSX 

| Command | Description |
| --- | --- |
| `$ brew services start mongodb-community` | starts MongoDB services |
| `$ brew services stop mongodb-community` | stops MongoDB services |
| &nbsp; | &nbsp; |
| `$ mongo` | Opens MongoDB shell |
| &nbsp; | &nbsp; |
| `$ show dbs/databases` | displays all available databases |
| `$ use <db-name>` | switch to `<db-name>` if exists, otherwise a new database with `<db-name>` will be created. The newly created database will not be actually created until a document has been inserted. if the collection is also not created then it will be created when inserting document into it. |
| `$ db` | displays currently selected database |