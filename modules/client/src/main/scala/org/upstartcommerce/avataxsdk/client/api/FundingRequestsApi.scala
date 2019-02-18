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

package org.upstartcommerce.avataxsdk.client.api

import akka.actor.ActorSystem
import akka.http.scaladsl.model.HttpMethods._
import akka.http.scaladsl.model._
import akka.stream.ActorMaterializer
import org.upstartcommerce.avataxsdk.client._
import org.upstartcommerce.avataxsdk.client.internal._
import org.upstartcommerce.avataxsdk.core.data.models._
import akka.http.scaladsl.model.headers.Authorization

import org.upstartcommerce.avataxsdk.json._
import play.api.libs.json._
import de.heikoseeberger.akkahttpplayjson.PlayJsonSupport._

trait FundingRequestsRootApi {
  def forId(fundingReqId:Long): FundingRequestsApi

}

object FundingRequestsRootApi {
  def apply(requester: Requester, security: Option[Authorization])(implicit system: ActorSystem, materializer: ActorMaterializer): FundingRequestsRootApi =
    new ApiRoot(requester, security) with FundingRequestsRootApi {
      def forId(fundingReqId:Long): FundingRequestsApi = FundingRequestsApi(requester, security)(fundingReqId)
    }
}

trait FundingRequestsApi {
  def activate: AvataxSimpleCall[FundingStatusModel]
  def status: AvataxSimpleCall[FundingStatusModel]
}
object FundingRequestsApi {
  def apply(requester: Requester, security: Option[Authorization])(fundingReqId:Long)(implicit system: ActorSystem, materializer: ActorMaterializer): FundingRequestsApi =
    new ApiRoot(requester, security) with FundingRequestsApi {
      def activate: AvataxSimpleCall[FundingStatusModel] = {
        val uri = Uri(s"/api/v2/fundingrequests/$fundingReqId/widget")
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxSimpleCall[FundingStatusModel](req)
      }

      def status: AvataxSimpleCall[FundingStatusModel] = {
        val uri = Uri(s"/api/v2/fundingrequests/$fundingReqId")
        val req = HttpRequest(uri = uri).withMethod(GET)
        avataxSimpleCall[FundingStatusModel](req)
      }
    }
}