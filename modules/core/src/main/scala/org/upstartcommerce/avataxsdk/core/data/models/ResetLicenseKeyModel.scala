package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class ResetLicenseKeyModel(accountId:Option[Int] = None, confirmResetLicenseKey:Option[Boolean] = None) {

  def withAccountId(value:Int):ResetLicenseKeyModel = copy(accountId = Some(value))
  def withConfirmResetLicenseKey(value:Boolean):ResetLicenseKeyModel = copy(confirmResetLicenseKey = Some(value))
}
  