package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class LockTransactionModel(isLocked:Option[Boolean] = None) {

  def withIsLocked(value:Boolean):LockTransactionModel = copy(isLocked = Some(value))
}
  