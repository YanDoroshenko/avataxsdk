/* Copyright 2019 UpStart Commerce, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.upstartcommerce.avataxsdk.core.data.models
import java.sql.Date
import org.upstartcommerce.avataxsdk.core.data.enums._

final case class FilingsCheckupSuggestedFormModel(taxAuthorityId:Option[Int] = None, country:Option[String] = None, region:Option[String] = None, returnName:Option[String] = None, taxFormCode:Option[String] = None) {

  def withTaxAuthorityId(value:Int):FilingsCheckupSuggestedFormModel = copy(taxAuthorityId = Some(value))
  def withCountry(value:String):FilingsCheckupSuggestedFormModel = copy(country = Some(value))
  def withRegion(value:String):FilingsCheckupSuggestedFormModel = copy(region = Some(value))
  def withReturnName(value:String):FilingsCheckupSuggestedFormModel = copy(returnName = Some(value))
  def withTaxFormCode(value:String):FilingsCheckupSuggestedFormModel = copy(taxFormCode = Some(value))
}
  