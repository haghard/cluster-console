package com.boldradius.clusterconsole.serializer

import akka.actor.ActorSystem
import akka.serialization.Serializer

class CrawlerResponseSerializer(system: ActorSystem) extends Serializer {
  override def identifier: Int = ???

  override def includeManifest: Boolean = ???

  override def fromBinary(bytes: Array[Byte], manifest: Option[Class[_]]): AnyRef = ???

  override def toBinary(o: AnyRef): Array[Byte] = ???
}
