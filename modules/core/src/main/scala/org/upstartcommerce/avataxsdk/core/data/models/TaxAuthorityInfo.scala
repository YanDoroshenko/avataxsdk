package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class TaxAuthorityInfo(avalaraId:Option[String] = None, jurisdictionName:Option[String] = None, jurisdictionType:Option[JurisdictionType] = None, signatureCode:Option[String] = None)
  