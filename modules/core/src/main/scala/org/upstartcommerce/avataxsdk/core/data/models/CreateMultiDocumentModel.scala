package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class CreateMultiDocumentModel(code:Option[String] = None, lines:Option[List[MultiDocumentLineItemModel]] = None, allowAdjust:Option[Boolean] = None, `type`:Option[DocumentType] = None, companyCode:Option[String] = None, date:Option[Date] = None, salespersonCode:Option[String] = None, customerCode:Option[String] = None, customerUsageType:Option[String] = None, entityUseCode:Option[String] = None, discount:Option[BigDecimal] = None, purchaseOrderNo:Option[String] = None, exemptionNo:Option[String] = None, addresses:Option[AddressesModel] = None, parameters:Option[Map[String, String]] = None, referenceCode:Option[String] = None, reportingLocationCode:Option[String] = None, commit:Option[Boolean] = None, batchCode:Option[String] = None, taxOverride:Option[TaxOverrideModel] = None, currencyCode:Option[String] = None, serviceMode:Option[ServiceMode] = None, exchangeRate:Option[BigDecimal] = None, exchangeRateEffectiveDate:Option[Date] = None, posLaneCode:Option[String] = None, businessIdentificationNo:Option[String] = None, isSellerImporterOfRecord:Option[Boolean] = None, description:Option[String] = None, email:Option[String] = None, debugLevel:Option[TaxDebugLevel] = None)
  