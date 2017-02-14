package com.magic.events

import java.io.Serializable

/**
  * @author kobi on 13/02/17.
  * @since 12.1
  */
object Events {

  case class Location(locationId: Int, state: String, city: String, latitude: String, longitude: String)

  case class CarEvent(eventId: Long, carId: Int, modelId: Int, location: Location)

}
