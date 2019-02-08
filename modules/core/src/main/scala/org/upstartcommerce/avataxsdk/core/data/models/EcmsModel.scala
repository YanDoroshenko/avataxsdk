package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class EcmsModel(exemptCertId:Option[Int] = None, companyId:Option[Int] = None, customerCode:Option[String] = None, customerName:Option[String] = None, address1:Option[String] = None, address2:Option[String] = None, address3:Option[String] = None, city:Option[String] = None, region:Option[String] = None, postalCode:Option[String] = None, country:Option[String] = None, exemptCertTypeId:Option[ExemptCertTypeId] = None, documentRefNo:Option[String] = None, businessTypeId:Option[Int] = None, businessTypeOtherDescription:Option[String] = None, exemptReasonId:Option[String] = None, exemptReasonOtherDescription:Option[String] = None, effectiveDate:Option[Date] = None, regionsApplicable:Option[String] = None, exemptCertStatusId:Option[ExemptCertStatusId] = None, createdDate:Option[Date] = None, lastTransactionDate:Option[Date] = None, expiryDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None, countryIssued:Option[String] = None, avaCertId:Option[String] = None, exemptCertReviewStatusId:Option[ExemptCertReviewStatusId] = None, details:Option[List[EcmsDetailModel]] = None)
  