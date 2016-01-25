package com.boldradius.clusterconsole.serializer

import akka.actor.ActorSystem
import akka.serialization.Serializer


class CampaignPersistedSerializer(system: ActorSystem) extends Serializer {
  override def identifier: Int = 20

  override def includeManifest: Boolean = true

  override def fromBinary(bytes: Array[Byte], manifest: Option[Class[_]]): AnyRef = ???

  override def toBinary(o: AnyRef): Array[Byte] = ???
}
