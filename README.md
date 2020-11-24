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
| `$ db.createCollection('name')` | creates a collection. Error will be displayed if a collection with the same name exists.
| `$ db.collection.insert(json)` | a new collection gets created on the fly if does not exists and document will be inserted into it.
| `$ db.collection.count(optionalQuery)` | without query it will return the total number of documents. With a valid query, total matching count will be returned.
| `$ db.collection.deleteOne(query)` | drops the first document matching the query.
| `$ db.collection.deleteMany(query)` | drops all documents matching the query.
| `$ db.collection.distinct("field", optionalQuery)` | returns an array of distinct values specified by the `field` from all documents. If `query` is specified, then distinct values will be only retrieved from the documents matching the query. Appending `.length` will be display the total number of distinct values.
| `$ db.collection.drop()` | drops the specified collection from the database.
| `$ db.collection.find(optionalQuery, optionalProjection)` | returns all documents from the collection. With a valid query, all matching documents will be returned.
| `$ db.collection.findOne(query, optionalProjection)` | returns a document matching the query. If multiple documents matches then the first document will be based on natural ordering on the disk.
| `$ db.collection.findOneAndDelete(query, options)` | finds and delete a document matching the query. Options can take sort and projection.
