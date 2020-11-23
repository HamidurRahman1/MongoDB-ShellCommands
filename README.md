# MongoDBWithJava

MongoDB Commands using Shell on MacOSX 

### Services and Shell:
| Command | Description |
| --- | --- |
| `$ brew services start mongodb-community` | starts MongoDB services
| `$ brew services stop mongodb-community` | stops MongoDB services
| `$ mongo` | Opens MongoDB shell |

### Database:
| Command | Description |
| --- | --- |
| `$ show dbs/databases` | displays all available databases.
| `$ use <db-name>` | switch to `<db-name>` if exists, otherwise a new database with `<db-name>` will be created. The newly created database will not be actually created until a document has been inserted. if the collection is also not created then it will be created when inserting document into it.
| `$ db` | displays currently selected database.
| `$ db.dropDatabase()` | drops the currently selected database. Must be inside the database which needs to be dropped.

### Collection (tables):
| Command | Description |
| --- | --- |
| `$ show collections` | displays all available collections (tables).
| `$ db.collection.drop()` | drops the specified collection from the database.
| `$ db.createCollection('name')` | creates a collection. Error will be displayed if a collection with the same name exists.
| `$ db.collection.insert(json)` | a new collection will be created on the fly if does not exists and document will be inserted into it.
| `$ db.collection.count(query)` | without query it will return the total number of documents. With a valid query total matching count will be returned.
| `$ db.collection.distinct(key)` | returns an array of distinct values specified by the key. Appending `.length` will be display the total number of distinct values.