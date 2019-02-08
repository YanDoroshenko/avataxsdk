package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CertExpressInvitationStatusModel(status:Option[CertExpressInvitationStatus] = None, invitation:Option[CertExpressInvitationModel] = None)
  