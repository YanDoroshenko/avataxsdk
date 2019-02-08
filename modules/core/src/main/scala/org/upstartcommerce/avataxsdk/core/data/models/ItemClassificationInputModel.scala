package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ItemClassificationInputModel(productCode:Option[String] = None, systemCode:Option[String] = None)
  