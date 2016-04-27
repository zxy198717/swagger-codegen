<?php
/**
 * FormatTest
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */
/**
 *  Copyright 2016 SmartBear Software
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
/**
 * FormatTest Class Doc Comment
 *
 * @category    Class
 * @description 
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class FormatTest implements ArrayAccess
{
    /**
      * The original name of the model.
      * @var string
      */
    static $swaggerModelName = 'format_test';

    /**
      * Array of property to type mappings. Used for (de)serialization 
      * @var string[]
      */
    static $swaggerTypes = array(
        'integer' => 'int',
        'int32' => 'int',
        'int64' => 'int',
        'number' => 'float',
        'float' => 'float',
        'double' => 'double',
        'string' => 'string',
        'byte' => 'string',
        'binary' => 'string',
        'date' => '\DateTime',
        'date_time' => '\DateTime',
        'uuid' => 'UUID',
        'password' => 'string'
    );
  
    static function swaggerTypes() {
        return self::$swaggerTypes;
    }

    /** 
      * Array of attributes where the key is the local name, and the value is the original name
      * @var string[] 
      */
    static $attributeMap = array(
        'integer' => 'integer',
        'int32' => 'int32',
        'int64' => 'int64',
        'number' => 'number',
        'float' => 'float',
        'double' => 'double',
        'string' => 'string',
        'byte' => 'byte',
        'binary' => 'binary',
        'date' => 'date',
        'date_time' => 'dateTime',
        'uuid' => 'uuid',
        'password' => 'password'
    );
  
    static function attributeMap() {
        return self::$attributeMap;
    }

    /**
      * Array of attributes to setter functions (for deserialization of responses)
      * @var string[]
      */
    static $setters = array(
        'integer' => 'setInteger',
        'int32' => 'setInt32',
        'int64' => 'setInt64',
        'number' => 'setNumber',
        'float' => 'setFloat',
        'double' => 'setDouble',
        'string' => 'setString',
        'byte' => 'setByte',
        'binary' => 'setBinary',
        'date' => 'setDate',
        'date_time' => 'setDateTime',
        'uuid' => 'setUuid',
        'password' => 'setPassword'
    );
  
    static function setters() {
        return self::$setters;
    }

    /**
      * Array of attributes to getter functions (for serialization of requests)
      * @var string[]
      */
    static $getters = array(
        'integer' => 'getInteger',
        'int32' => 'getInt32',
        'int64' => 'getInt64',
        'number' => 'getNumber',
        'float' => 'getFloat',
        'double' => 'getDouble',
        'string' => 'getString',
        'byte' => 'getByte',
        'binary' => 'getBinary',
        'date' => 'getDate',
        'date_time' => 'getDateTime',
        'uuid' => 'getUuid',
        'password' => 'getPassword'
    );
  
    static function getters() {
        return self::$getters;
    }

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = array(
        /**
         * $container['integer']
         * @var int
         */
        'integer' => null,
    
        /**
         * $container['int32']
         * @var int
         */
        'int32' => null,
    
        /**
         * $container['int64']
         * @var int
         */
        'int64' => null,
    
        /**
         * $container['number']
         * @var float
         */
        'number' => null,
    
        /**
         * $container['float']
         * @var float
         */
        'float' => null,
    
        /**
         * $container['double']
         * @var double
         */
        'double' => null,
    
        /**
         * $container['string']
         * @var string
         */
        'string' => null,
    
        /**
         * $container['byte']
         * @var string
         */
        'byte' => null,
    
        /**
         * $container['binary']
         * @var string
         */
        'binary' => null,
    
        /**
         * $container['date']
         * @var \DateTime
         */
        'date' => null,
    
        /**
         * $container['date_time']
         * @var \DateTime
         */
        'date_time' => null,
    
        /**
         * $container['uuid']
         * @var UUID
         */
        'uuid' => null,
    
        /**
         * $container['password']
         * @var string
         */
        'password' => null,
    );

    /**
     * Constructor
     * @param mixed[] $data Associated array of property value initalizing the model
     */
    public function __construct(array $data = null)
    {
        
        
        if ($data != null) {
            $this->container['integer'] = $data['integer'];
            $this->container['int32'] = $data['int32'];
            $this->container['int64'] = $data['int64'];
            $this->container['number'] = $data['number'];
            $this->container['float'] = $data['float'];
            $this->container['double'] = $data['double'];
            $this->container['string'] = $data['string'];
            $this->container['byte'] = $data['byte'];
            $this->container['binary'] = $data['binary'];
            $this->container['date'] = $data['date'];
            $this->container['date_time'] = $data['date_time'];
            $this->container['uuid'] = $data['uuid'];
            $this->container['password'] = $data['password'];
        }
    }
    /**
     * Gets integer
     * @return int
     */
    public function getInteger()
    {
        return $this->container['integer'];
    }
  
    /**
     * Sets integer
     * @param int $integer 
     * @return $this
     */
    public function setInteger($integer)
    {
        
        $this->container['integer'] = $integer;
        return $this;
    }
    /**
     * Gets int32
     * @return int
     */
    public function getInt32()
    {
        return $this->container['int32'];
    }
  
    /**
     * Sets int32
     * @param int $int32 
     * @return $this
     */
    public function setInt32($int32)
    {
        
        $this->container['int32'] = $int32;
        return $this;
    }
    /**
     * Gets int64
     * @return int
     */
    public function getInt64()
    {
        return $this->container['int64'];
    }
  
    /**
     * Sets int64
     * @param int $int64 
     * @return $this
     */
    public function setInt64($int64)
    {
        
        $this->container['int64'] = $int64;
        return $this;
    }
    /**
     * Gets number
     * @return float
     */
    public function getNumber()
    {
        return $this->container['number'];
    }
  
    /**
     * Sets number
     * @param float $number 
     * @return $this
     */
    public function setNumber($number)
    {
        
        $this->container['number'] = $number;
        return $this;
    }
    /**
     * Gets float
     * @return float
     */
    public function getFloat()
    {
        return $this->container['float'];
    }
  
    /**
     * Sets float
     * @param float $float 
     * @return $this
     */
    public function setFloat($float)
    {
        
        $this->container['float'] = $float;
        return $this;
    }
    /**
     * Gets double
     * @return double
     */
    public function getDouble()
    {
        return $this->container['double'];
    }
  
    /**
     * Sets double
     * @param double $double 
     * @return $this
     */
    public function setDouble($double)
    {
        
        $this->container['double'] = $double;
        return $this;
    }
    /**
     * Gets string
     * @return string
     */
    public function getString()
    {
        return $this->container['string'];
    }
  
    /**
     * Sets string
     * @param string $string 
     * @return $this
     */
    public function setString($string)
    {
        
        $this->container['string'] = $string;
        return $this;
    }
    /**
     * Gets byte
     * @return string
     */
    public function getByte()
    {
        return $this->container['byte'];
    }
  
    /**
     * Sets byte
     * @param string $byte 
     * @return $this
     */
    public function setByte($byte)
    {
        
        $this->container['byte'] = $byte;
        return $this;
    }
    /**
     * Gets binary
     * @return string
     */
    public function getBinary()
    {
        return $this->container['binary'];
    }
  
    /**
     * Sets binary
     * @param string $binary 
     * @return $this
     */
    public function setBinary($binary)
    {
        
        $this->container['binary'] = $binary;
        return $this;
    }
    /**
     * Gets date
     * @return \DateTime
     */
    public function getDate()
    {
        return $this->container['date'];
    }
  
    /**
     * Sets date
     * @param \DateTime $date 
     * @return $this
     */
    public function setDate($date)
    {
        
        $this->container['date'] = $date;
        return $this;
    }
    /**
     * Gets date_time
     * @return \DateTime
     */
    public function getDateTime()
    {
        return $this->container['date_time'];
    }
  
    /**
     * Sets date_time
     * @param \DateTime $date_time 
     * @return $this
     */
    public function setDateTime($date_time)
    {
        
        $this->container['date_time'] = $date_time;
        return $this;
    }
    /**
     * Gets uuid
     * @return UUID
     */
    public function getUuid()
    {
        return $this->container['uuid'];
    }
  
    /**
     * Sets uuid
     * @param UUID $uuid 
     * @return $this
     */
    public function setUuid($uuid)
    {
        
        $this->container['uuid'] = $uuid;
        return $this;
    }
    /**
     * Gets password
     * @return string
     */
    public function getPassword()
    {
        return $this->container['password'];
    }
  
    /**
     * Sets password
     * @param string $password 
     * @return $this
     */
    public function setPassword($password)
    {
        
        $this->container['password'] = $password;
        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset 
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }
  
    /**
     * Gets offset.
     * @param  integer $offset Offset 
     * @return mixed 
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }
  
    /**
     * Sets value based on offset.
     * @param  integer $offset Offset 
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }
  
    /**
     * Unsets offset.
     * @param  integer $offset Offset 
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }
  
    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        }

        return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this));
    }
}
