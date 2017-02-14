package com.magic.insightedge.model

import java.util.Date

import org.insightedge.scala.annotation.SpaceId

import scala.beans.BeanProperty

/**
  * @author kobi on 13/02/17.
  * @since 12.1
  */
abstract class MagicEvent(eventId: Long) {
  def this() = this(-1)
}


case class CarEvent(
                            @BeanProperty
                            @SpaceId
                            var eventId: Long,

                            @BeanProperty
                            var carId: Int,

                            @BeanProperty
                            var modelId: Int,

                            @BeanProperty
                            var locationId: Int,

                            @BeanProperty
                            var locationState: String,

                            @BeanProperty
                            var locationCity: String,

                            @BeanProperty
                            var locationLatitude: String,

                            @BeanProperty
                            var locationLongitude: String
                          ) extends MagicEvent(eventId) {
  def this() = this(-1, -1, -1, -1, null, null, null, null)
}

case class AggregatedCar(
                     @BeanProperty
                     @SpaceId
                     var aggregationId: String,

                     @BeanProperty
                     var date: Date,

                     @BeanProperty
                     var modelIdAgg: Map[Int, Long]
                   )  {
  def this() = this(null, null, Map[Int, Long]())
}
