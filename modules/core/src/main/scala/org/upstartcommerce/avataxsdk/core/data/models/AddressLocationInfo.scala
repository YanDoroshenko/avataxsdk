package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class AddressLocationInfo(locationCode:Option[String] = None, line1:Option[String] = None, line2:Option[String] = None, line3:Option[String] = None, city:Option[String] = None, region:Option[String] = None, country:Option[String] = None, postalCode:Option[String] = None, latitude:Option[BigDecimal] = None, longitude:Option[BigDecimal] = None) {

  def withLocationCode(value:String):AddressLocationInfo = copy(locationCode = Some(value))
  def withLine1(value:String):AddressLocationInfo = copy(line1 = Some(value))
  def withLine2(value:String):AddressLocationInfo = copy(line2 = Some(value))
  def withLine3(value:String):AddressLocationInfo = copy(line3 = Some(value))
  def withCity(value:String):AddressLocationInfo = copy(city = Some(value))
  def withRegion(value:String):AddressLocationInfo = copy(region = Some(value))
  def withCountry(value:String):AddressLocationInfo = copy(country = Some(value))
  def withPostalCode(value:String):AddressLocationInfo = copy(postalCode = Some(value))
  def withLatitude(value:BigDecimal):AddressLocationInfo = copy(latitude = Some(value))
  def withLongitude(value:BigDecimal):AddressLocationInfo = copy(longitude = Some(value))
}
  