package io.vertx.ext.mongo;

import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.Future;

@VertxGen
public interface MongoSession extends MongoClient {

  Future<MongoSession> startTransaction();
  Future<Void> commitTransaction();
  Future<Void> abortTransaction();

}
