package com.magic

import com.magic.events.Events.{CarEvent, Location}
import play.api.libs.json.Json

/**
  * @author kobi on 13/02/17.
  * @since 12.1
  */
package object producer {

  val TOPIC_CAR = "topic.car"
  val BOOTSTRAP_SERVERS = "bootstrap.servers"

  implicit val locationWriter = Json.writes[Location]
  implicit val carEventWriter = Json.writes[CarEvent]

}
