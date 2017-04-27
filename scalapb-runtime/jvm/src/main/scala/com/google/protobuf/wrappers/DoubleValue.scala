// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.wrappers

import scala.collection.JavaConverters._

/** Wrapper message for `double`.
  *
  * The JSON representation for `DoubleValue` is JSON number.
  *
  * @param value
  *   The double value.
  */
@SerialVersionUID(0L)
final case class DoubleValue(
    value: Double = 0.0
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[DoubleValue] with com.trueaccord.lenses.Updatable[DoubleValue] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (value != 0.0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeDoubleSize(1, value) }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = value
        if (__v != 0.0) {
          _output__.writeDouble(1, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.wrappers.DoubleValue = {
      var __value = this.value
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 9 =>
            __value = _input__.readDouble()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.wrappers.DoubleValue(
          value = __value
      )
    }
    def withValue(__v: Double): DoubleValue = copy(value = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = value
          if (__t != 0.0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PDouble(value)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.wrappers.DoubleValue
}

object DoubleValue extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.wrappers.DoubleValue] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.wrappers.DoubleValue, com.google.protobuf.DoubleValue] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.wrappers.DoubleValue] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.wrappers.DoubleValue, com.google.protobuf.DoubleValue] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.wrappers.DoubleValue): com.google.protobuf.DoubleValue = {
    val javaPbOut = com.google.protobuf.DoubleValue.newBuilder
    javaPbOut.setValue(scalaPbSource.value)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DoubleValue): com.google.protobuf.wrappers.DoubleValue = com.google.protobuf.wrappers.DoubleValue(
    value = javaPbSource.getValue.doubleValue
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.wrappers.DoubleValue = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.wrappers.DoubleValue(
      __fieldsMap.getOrElse(__fields.get(0), 0.0).asInstanceOf[Double]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.wrappers.DoubleValue] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.wrappers.DoubleValue(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[Double]).getOrElse(0.0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = WrappersProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = WrappersProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.wrappers.DoubleValue(
  )
  implicit class DoubleValueLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.wrappers.DoubleValue]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.wrappers.DoubleValue](_l) {
    def value: _root_.com.trueaccord.lenses.Lens[UpperPB, Double] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val VALUE_FIELD_NUMBER = 1
}