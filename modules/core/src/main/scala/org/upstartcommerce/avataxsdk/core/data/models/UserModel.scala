package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class UserModel(id:Option[Int] = None, accountId:Option[Int] = None, companyId:Option[Int] = None, userName:Option[String] = None, firstName:Option[String] = None, lastName:Option[String] = None, email:Option[String] = None, postalCode:Option[String] = None, securityRoleId:Option[SecurityRoleId] = None, passwordStatus:Option[PasswordStatusId] = None, isActive:Option[Boolean] = None, createdDate:Option[Date] = None, createdUserId:Option[Int] = None, modifiedDate:Option[Date] = None, modifiedUserId:Option[Int] = None) {

  def withId(value:Int):UserModel = copy(id = Some(value))
  def withAccountId(value:Int):UserModel = copy(accountId = Some(value))
  def withCompanyId(value:Int):UserModel = copy(companyId = Some(value))
  def withUserName(value:String):UserModel = copy(userName = Some(value))
  def withFirstName(value:String):UserModel = copy(firstName = Some(value))
  def withLastName(value:String):UserModel = copy(lastName = Some(value))
  def withEmail(value:String):UserModel = copy(email = Some(value))
  def withPostalCode(value:String):UserModel = copy(postalCode = Some(value))
  def withSecurityRoleId(value:SecurityRoleId):UserModel = copy(securityRoleId = Some(value))
  def withPasswordStatus(value:PasswordStatusId):UserModel = copy(passwordStatus = Some(value))
  def withIsActive(value:Boolean):UserModel = copy(isActive = Some(value))
  def withCreatedDate(value:Date):UserModel = copy(createdDate = Some(value))
  def withCreatedUserId(value:Int):UserModel = copy(createdUserId = Some(value))
  def withModifiedDate(value:Date):UserModel = copy(modifiedDate = Some(value))
  def withModifiedUserId(value:Int):UserModel = copy(modifiedUserId = Some(value))
}
  