/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at <a href=\"http://swagger.io\">http://swagger.io</a> or on irc.freenode.net, #swagger.  For this sample, you can use the api key \"special-key\" to test the authorization filters
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@wordnik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#include "HttpContent.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

HttpContent::HttpContent()
{
}

HttpContent::~HttpContent()
{
}

utility::string_t HttpContent::getContentDisposition()
{
    return m_ContentDisposition;
}

void HttpContent::setContentDisposition( const utility::string_t & value )
{
    m_ContentDisposition = value;
}

utility::string_t HttpContent::getName()
{
    return m_Name;
}

void HttpContent::setName( const utility::string_t & value )
{
    m_Name = value;
}

utility::string_t HttpContent::getFileName()
{
    return m_FileName;
}

void HttpContent::setFileName( const utility::string_t & value )
{
    m_FileName = value;
}

utility::string_t HttpContent::getContentType()
{
    return m_ContentType;
}

void HttpContent::setContentType( const utility::string_t & value )
{
    m_ContentType = value;
}

std::shared_ptr<std::istream> HttpContent::getData()
{
    return m_Data;
}

void HttpContent::setData( std::shared_ptr<std::istream> value )
{
    m_Data = value;
}

void HttpContent::writeTo( std::ostream& stream )
{
    m_Data->seekg( 0, m_Data->beg );
    stream << m_Data->rdbuf();
}

}
}
}
}
