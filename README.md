# Frequently used MongoDB Shell Commands

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
| `$ db.collection.findOne(optionalQuery, optionalProjection)` | returns a document matching the query. If multiple documents matches then the first document will be based on natural ordering on the disk.
| `$ db.collection.findOneAndDelete(query, options)` | finds and delete a document matching the query. Options can take sort and projection.
| `$ db.collection.findOneAndReplace(query, newDocument)` | finds and replace a document matching the query.
| `$ db.collection.findOneAndUpdate(query, updateDocumentOrAggregationPipeline)` | finds and update a document matching the query.
| `$ db.collection.insert(documentOrArrayOfDocuments)` | inserts the document(s) into the collection.
| `$ db.collection.insertOne(document)` | inserts the document into the collection.
| `$ db.collection.insertMany(documents)` | inserts the documents into the collection.
| `$ db.collection.remove({})` | removes all documents from the collection.
| `$ db.collection.remove(query)` | removes all documents from the collection that matches the query.
| `$ db.collection.remove(query, true)` | removes the first documents that matches the query.
| `$ db.collection.renameCollection("newCollectionName")` | renames the collection with the specified name. Parameterized collection name must not exists in this database.
| `$ db.collection.save(document)` | Inserts the document if it does not contain a `_id` field. If it does contains `_id` and matches with an existing `_id` the update operation will occur.
| `$ db.collection.update(query, updatedFieldOrDocument)` | Modifies a single existing document or field of a document. Multiple document(s) can be modified as well.
