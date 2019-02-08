package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AuditMultiDocumentModel(reconstructed:Option[ReconstructedMultiDocumentModel] = None, code:Option[String] = None, `type`:Option[DocumentType] = None, serverTimestamp:Option[Date] = None, serverDuration:Option[Date] = None, apiCallStatus:Option[ApiCallStatus] = None, original:Option[OriginalApiRequestResponseModel] = None)
  