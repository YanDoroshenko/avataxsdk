package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ApproveFilingsModel(approve:Option[Boolean] = None) {

  def withApprove(value:Boolean):ApproveFilingsModel = copy(approve = Some(value))
}
  