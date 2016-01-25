package com.boldradius.clusterconsole.serializer

import akka.actor.ActorSystem
import akka.serialization.Serializer

/**
  * Created by haghard on 25/01/16.
  */
class ResultAddedEventSerializer(system: ActorSystem) extends Serializer {
  override def identifier: Int = 19

  override def includeManifest: Boolean = true

  override def fromBinary(bytes: Array[Byte], manifest: Option[Class[_]]): AnyRef = ???

  override def toBinary(o: AnyRef): Array[Byte] = ???
}
