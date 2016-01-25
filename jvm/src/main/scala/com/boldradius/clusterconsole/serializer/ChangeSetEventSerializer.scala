package com.boldradius.clusterconsole.serializer

import akka.actor.ActorSystem
import akka.serialization.Serializer


class ChangeSetEventSerializer(system: ActorSystem) extends Serializer {
  override def identifier: Int = 18

  override def includeManifest: Boolean = false

  override def fromBinary(bytes: Array[Byte], manifest: Option[Class[_]]): AnyRef = ???

  override def toBinary(o: AnyRef): Array[Byte] = ???
}
